package b11.content;

import arc.graphics.Color;
import b11.blocks.defense.BulletWall;
import b11.blocks.defense.ManualTurret;
import b11.content.*;
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
		test2 = new ManualTurret("AAAAAAAAAAAAAAAAAAAAAAA"){{
			localizedName = this.name;
			ammo = Items.sand;
			shoot1 = B11Bullets.copperBulletWall;
			shoot2 = B11Bullets.lancerManual;
			size = 3;
			requirements(Category.defense, with(Items.copper, 1));
		}};

	}
}
