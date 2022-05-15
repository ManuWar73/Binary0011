package b11.content;

import arc.graphics.Color;
import b11.blocks.defense.BulletWall;
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
                String a = "hello world";
	}
}
