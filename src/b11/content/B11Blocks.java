package b11.content;

import arc.graphics.Color;
import b11.blocks.defense.BulletWall;
import b11.blocks.production.TapCrafter;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.draw.DrawDefault;
import mindustry.world.draw.DrawFlame;
import mindustry.world.draw.DrawMulti;

import static mindustry.type.ItemStack.*;

public class B11Blocks {
	public static Block
		test, test2, test3;
	public static void load(){
		test = new AirBlock("test");
		test2 = new BulletWall("test2"){{
			requirements(Category.defense, with(Items.copper, 50000));
			size = 2;
			health = 10;
			shots = 8;
		}};
		test3 = new TapCrafter("TAP-CRAFTER"){{
			requirements(Category.crafting, with(Items.copper, 30, Items.lead, 25));
			craftEffect = Fx.smeltsmoke;
			tap = 5;
			tapColor = Color.valueOf("ffef99");
			outputItem = new ItemStack(Items.silicon, 1);
			craftTime = 40f;
			size = 2;
			hasPower = true;
			hasLiquids = false;
			drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffef99")));
			ambientSound = Sounds.smelter;
			ambientSoundVolume = 0.07f;

			consumeItems(with(Items.coal, 1, Items.sand, 2));
			consumePower(0.50f);
		}};
	}
}
