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
	t0000, t0001, t0010, t0011, t0100, t0101
	;
	@Override
	public void load(){
		// turret start
		t0000 = new ItemTurret("t000") {{
			requirements(Category.turret, with(
				B11Items.item00, 25
			));
			size = 1;
			localizedName = "t000";
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
		t0001 = new ItemTurret("t001") {{
			requirements(Category.turret, with(
				B11Items.item00, 30,
				B11Items.item01, 20
			));
			size = 2;
			localizedName = "t001";
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
		t0010 = new ItemTurret("t010") {{
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
		// turret end
	}
}
