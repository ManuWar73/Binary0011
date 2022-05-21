package b11.content;

import b11.blocks.defense.ManualTurret;
import b11.blocks.defense.ManualTurret2;
import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;

import static mindustry.type.ItemStack.*;

public class B11Blocks {
	public static Block
		root, o;
	public static void load(){
		root = new ManualTurret("root"){{
                        bullet1 = B11Bullets.copperBulletWall;
                        shots = 4;
			size = 1;
			health = 100;
			itemCapacity = 30;
			shootSound = Sounds.shoot;
			requirements(Category.turret, with(Items.copper, 28, Items.lead, 15));
			consumeItems(with(Items.copper, 4));
		}};

		o = new ManualTurret2("wqejfhc89dwfwryhdigvbuwf"){{
			shootType= B11Bullets.copperBulletWall;
			shots = 5;
			size = 3;
			health = 1000;
			itemCapacity = 30;
			shootSound = Sounds.shoot;
			requirements(Category.turret, with(Items.copper, 28, Items.lead, 15));
			consumeItems(with(Items.copper, 1));
		}};
	}
}
