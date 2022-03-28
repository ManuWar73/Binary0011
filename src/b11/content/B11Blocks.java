package b11.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.Pal;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.entities.bullet.*;
import mindustry.entities.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.units.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.meta.*;
import mindustry.world.draw.*;
import b11.*;
import b11.content.*;
import static mindustry.type.ItemStack.*;
import static mindustry.type.ItemStack.with;

public class B11Blocks implements ContentList{
	public static Block
	// turret
	t0000, t0001, t0010, t0011, t0100, t0101, t0110, t0111, t1000, t1001, t1010, t1011, t1100, t1101, t1110, t1111, tNUMBER_OVERFLOW
	;
	@Override
	public void load(){
		// turret start
		t0000 = new ItemTurret("t0000") {{
			requirements(Category.turret, with(
				B11Items.item00, 25
			));
			size = 1;
			localizedName = "t0000";
			health = 200 * size * size;
			reloadTime = 20f;
			shots = 1;
			range = 18f * 8f;
			maxAmmo = 200;
			restitution = 0.02f;
			inaccuracy = 0f;
			ammo(
				B11Items.item00, B11Bullets.basicbullet1,
				B11Items.item01, B11Bullets.basicbullet2
			);
		}};
		t0001 = new ItemTurret("t0001") {{
			requirements(Category.turret, with(
				B11Items.item00, 30,
				B11Items.item01, 20
			));
			size = 2;
			localizedName = "t0001";
			health = 200 * size * size;
			reloadTime = 20f;
			shots = 2;
			range = 27f * 8f;
			maxAmmo = 200;
			restitution = 0.02f;
			inaccuracy = 0f;
			ammo(
				B11Items.item00, B11Bullets.basicbullet1,
				B11Items.item01, B11Bullets.basicbullet2
			);
		}};
		t0010 = new ItemTurret("t0010") {{
			requirements(Category.turret, with(
				B11Items.item00, 50,
				B11Items.item01, 25
			));
			size = 3;
			localizedName = "t0010";
			health = 200 * size * size;
			reloadTime = 20f;
			shots = 4;
			range = 36f * 8f;
			maxAmmo = 200;
			restitution = 0.04f;
			inaccuracy = 0.1f;
			heatColor = Color.valueOf("FF0000AA");
			ammo(
				B11Items.item00, B11Bullets.basicbullet3,
				B11Items.item01, B11Bullets.basicbullet4
			);
		}};
		t0011 = new PowerTurret ("t0011"){{
			requirements(Category.turret, with(B11Items.item00, 50, B11Items.item01, 25));
			shootType = B11Bullets.lightningbullet1;
			localizedName = "t0011";
			reloadTime = 30f;
			shootCone = 40f;
			rotateSpeed = 8f;
			powerUse = 2.8f;
			targetAir = true;
			range = 90f;
			shootEffect = Fx.lightningShoot;
			heatColor = Color.red;
			recoilAmount = 1f;
			size = 1;
			health = 260;
			shootSound = Sounds.spark;
		}};
		t0100 = new PowerTurret("t0100"){{
			requirements(Category.turret, with(B11Items.item00, 30, B11Items.item01, 35));
			range = 192f;
			localizedName = "t0100";
			chargeTime = 40f;
			chargeMaxDelay = 30f;
			recoilAmount = 2f;
			reloadTime = 60f;
			cooldown = 0.03f;
			powerUse = 5.7f;
			shootShake = 2f;
			heatColor = Color.red;
			size = 1;
			health = 260;
			targetAir = true;
			shootSound = Sounds.laser;
			shootType = B11Bullets.laserbullet1;
		}};
		t0101 = new PowerTurret("t0101"){{
			requirements(Category.turret, with(B11Items.item00, 50, B11Items.item01, 60, B11Items.item10, 30));
			range = 288f;
			localizedName = "t0101";
			chargeTime = 20f;
			chargeMaxDelay = 10f;
			recoilAmount = 2f;
			reloadTime = 60f;
			cooldown = 0.03f;
			powerUse = 5.7f;
			shootShake = 2f;
			heatColor = Color.red;
			size = 2;
			health = 260 * size * size;
			targetAir = true;
			shootSound = Sounds.laser;
			shootType = B11Bullets.laserbullet2;
		}};
		t0110 = new PowerTurret("t0110"){{
			requirements(Category.turret, with(B11Items.item00, 175, B11Items.item01, 154, B11Items.item10, 100));
			range = 288f;
			localizedName = "t0110";
			chargeTime = 120f;
			chargeMaxDelay = 60f;
			recoilAmount = 2f;
			reloadTime = 60f * 2f;
			cooldown = 0.03f;
			powerUse = 10f;
			shootShake = 2f;
			heatColor = Color.red;
			size = 3;
			health = 260 * size * size;
			targetAir = true;
			shootSound = Sounds.laser;
			shootType = B11Bullets.biglaserbullet;
		}};
		t0111 = new ItemTurret("t0111"){{
			requirements(Category.turret, with(B11Items.item00, 25, B11Items.item01, 8));
			ammo(
				B11Items.item00, B11Bullets.artillerybullet1,
				B11Items.item10, B11Bullets.artillerybullet2
			);
			localizedName = "t0111";
			heatColor = Color.red;
			targetAir = false;
			reloadTime = 50f;
			recoilAmount = 2f;
			range = 240f;
			inaccuracy = 0f;
			shootCone = 10f;
			health = 280;
			shootSound = Sounds.bang;
			limitRange(0f);
		}};
		t1000 = new ItemTurret("t1000"){{
			requirements(Category.turret, with(B11Items.item00, 60, B11Items.item01, 35, B11Items.item10, 30));
			ammo(
				B11Items.item00, B11Bullets.artillerybullet1,
				B11Items.item10, B11Bullets.artillerybullet2
			);
			localizedName = "t1000";
			heatColor = Color.red;
			shots = 2;
			size = 2;
			targetAir = false;
			reloadTime = 25f;
			recoilAmount = 2f;
			range = 280f;
			inaccuracy = 0f;
			shootCone = 10f;
			health = 280 * size * size;
			shootSound = Sounds.bang;
			limitRange(0f);
		}};
		t1001 = new ItemTurret("t1001"){{
			requirements(Category.turret, with(B11Items.item00, 120, B11Items.item01, 90, B11Items.item10, 75));
			ammo(
				B11Items.item00, B11Bullets.artillerybullet1,
				B11Items.item10, B11Bullets.artillerybullet2
			);
			localizedName = "t1001";
			heatColor = Color.red;
			shots = 4;
			size = 3;
			targetAir = false;
			reloadTime = 20f;
			recoilAmount = 2f;
			range = 300f;
			inaccuracy = 0f;
			shootCone = 10f;
			health = 285 * size * size;
			shootSound = Sounds.bang;
			limitRange(0f);
		}};
		int a = 6;
		t1010 = new ItemTurret("t1010"){{
			requirements(Category.turret, with(B11Items.item00, 25, B11Items.item01, 20, B11Items.item10, 15));
			ammo(
				B11Items.item10, B11Bullets.missile1,
				B11Items.item11, B11Bullets.missile2
			);
			reloadTime = 50f;
			burstSpacing = a;
			localizedName = "t1010";
			shots = 2;
			inaccuracy = xRand = 6f;
			range = 192f;
			size = 1;
			health = 300 * size * size;
			shootSound = Sounds.missile;

			limitRange(5f);
		}};
		t1011 = new ItemTurret("t1011"){{
			requirements(Category.turret, with(B11Items.item00, 70, B11Items.item01, 40, B11Items.item10, 30, B11Items.item11, 40));
			ammo(
				B11Items.item10, B11Bullets.missile1,
				B11Items.item11, B11Bullets.missile2
			);
			reloadTime = 30f;
			localizedName = "t1011";
			shots = 4;
			burstSpacing = a;
			inaccuracy = xRand = 7f;
			range = 240f;
			size = 2;
			health = 300 * size * size;
			shootSound = Sounds.missile;

			limitRange(5f);
		}};
		t1100 = new ItemTurret("t1100"){{
			requirements(Category.turret, with(B11Items.item00, 85, B11Items.item01, 55, B11Items.item10, 45, B11Items.item11, 55));
			ammo(
				B11Items.item10, B11Bullets.missile1,
				B11Items.item11, B11Bullets.missile2
			);
			reloadTime = 26f;
			localizedName = "t1100";
			shots = 6;
			burstSpacing = a;
			inaccuracy = xRand = 7f;
			range = 256f;
			size = 2;
			health = 300 * size * size;
			shootSound = Sounds.missile;

			limitRange(5f);
		}};
		t1101 = new ItemTurret("t1101"){{
			requirements(Category.turret, with(B11Items.item00, 50, B11Items.item01, 25));
			ammo(
				B11Items.item01, B11Bullets.flak1,
				B11Items.item10, B11Bullets.flak2,
				B11Items.item11, B11Bullets.flak3
			);
			xRand = 4f;
			localizedName = "t1101";
			reloadTime = 20f;
			range = 100f;
			size = 1;
			recoilAmount = 1f;
			rotateSpeed = 10f;
			inaccuracy = 0f;
			shootCone = 30f;
			shootSound = Sounds.shootSnap;
			health = 150 * size * size;
			limitRange();
		}};
		t1110 = new ItemTurret("t1110"){{
			requirements(Category.turret, with(B11Items.item00, 100, B11Items.item01, 75, B11Items.item11, 55));
			ammo(
				B11Items.item01, B11Bullets.flak1,
				B11Items.item10, B11Bullets.flak2,
				B11Items.item11, B11Bullets.flak3
			);
			xRand = 4f;
			localizedName = "t1110";
			reloadTime = 12f;
			range = 180f;
			size = 2;
			recoilAmount = 2f;
			rotateSpeed = 10f;
			inaccuracy = 0f;
			shootCone = 30f;
			shootSound = Sounds.shootSnap;
			health = 150 * size * size;
			limitRange();
		}};
		t1111 = new ItemTurret("t1111"){{
			requirements(Category.turret, with(B11Items.item00, 175, B11Items.item01, 160, B11Items.item11, 180));
			ammo(
				B11Items.item01, B11Bullets.flak1,
				B11Items.item10, B11Bullets.flak2,
				B11Items.item11, B11Bullets.flak3
			);
			xRand = 6f;
			localizedName = "t1111";
			reloadTime = 5f;
			range = 240f;
			size = 3;
			recoilAmount = 3f;
			rotateSpeed = 10f;
			inaccuracy = 0f;
			shootCone = 30f;
			shootSound = Sounds.shootSnap;
			health = 150 * size * size;
			limitRange();
		}};
		// turret end
	}
}
