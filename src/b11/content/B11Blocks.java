package b11.content;

import b11.blocks.defense.ManualTurret;
import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;

import static mindustry.type.ItemStack.*;

public class B11Blocks {
	public static Block
		test, test2, test3;
	public static void load(){
		test = new AirBlock("test");
		test2 = new ManualTurret("AAAAAAAAAAAAAA"){{
                        bullet1 = bullet2 = B11Bullets.copperBulletWall;
                        shots = 4;
			size = 3;
			health = 1000000;
			itemCapacity = 30;
			shootSound = Sounds.laser;
			requirements(Category.turret, with(Items.copper, 1));
			consumeItems(with(Items.copper, 1, Items.lead, 3));
		}};
	}
}
