package b11.content;

import arc.graphics.Color;
import mindustry.content.*;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.*;
import b11.*;
import b11.content.*;

public class B11Bullets implements ContentList {
	public static BulletType
	// basic
	basicbullet1, basicbullet2, basicbullet3, basicbullet4,
	// pawer
	lightningbullet1, laserbullet1, laserbullet2, biglaserbullet,
	// artillery
	artillerybullet1, artillerybullet2
	;
	@Override
	public void load(){
		// basic start
		basicbullet1 = new BasicBulletType(2.5f, 14){{
			width = height = 7.5f;
			lifetime = 60 * 2f;
			shootEffect = Fx.shootSmall;
			smokeEffect = Fx.shootSmallSmoke;
			ammoMultiplier = 2;
		}};
		basicbullet2 = new BasicBulletType(3.5f, 21){{
			width = height = 7.5f;
			lifetime = 60 * 2f;
			shootEffect = Fx.shootSmall;
			smokeEffect = Fx.shootSmallSmoke;
			ammoMultiplier = 2;
		}};
		basicbullet3 = new BasicBulletType(5f, 28){{
			width = height = 7.5f;
			lifetime = 60 * 3f;
			shootEffect = Fx.shootSmall;
			smokeEffect = Fx.shootSmallSmoke;
			ammoMultiplier = 3;
			homingPower = 100f;
			homingRange = 45f * 8f;
		}};
		basicbullet4 = new BasicBulletType(5f, 56){{
			width = height = 9f;
			lifetime = 60 * 3f;
			shootEffect = Fx.shootSmall;
			smokeEffect = Fx.shootSmallSmoke;
			ammoMultiplier = 3;
			homingPower = 100f;
			homingRange = 45f * 8f;
		}};
		// basic end
		// pawer start
		lightningbullet1 = new LightningBulletType(){{
			damage = 35;
			lightningLength = 25;
			collidesAir = true;
			ammoMultiplier = 1f;
		}};
		laserbullet1 = new LaserBulletType(154){{
			colors = new Color[]{Color.valueOf("959595"), Color.valueOf("BABABA"), Color.white};
			hitSize = 4;
			lifetime = 16f;
			drawSize = 400f;
			collidesAir = true;
			length = 192f;
			ammoMultiplier = 1f;
		}};
		laserbullet2 = new LaserBulletType(210){{
			colors = new Color[]{Color.valueOf("a0a0a0"), Color.valueOf("dfdfdf"), Color.white};
			hitSize = 4;
			lifetime = 8f;
			drawSize = 400f;
			collidesAir = true;
			length = 288f;
			ammoMultiplier = 1f;
		}};
		biglaserbullet = new LaserBulletType(){{
			length = 460f;
			damage = 560f / 2f;
			width = 75 / 1.5f;

			lifetime = 65 * 1.5f;

			lightningSpacing = 35f;
			lightningLength = 5 * 3;
			lightningDelay = 1.1f;
			lightningLengthRand = 15;
			lightningDamage = 50;
			lightningAngleRand = 40f;
			largeHit = true;
			lightColor = lightningColor = Color.valueOf("ffffff");

			sideAngle = 15f;
			sideWidth = 0f;
			sideLength = 0f;
			colors = new Color[]{Color.valueOf("111111"), Color.valueOf("666666"), Color.valueOf("999999")};
		}};
		// pawer end
		// artillery start
		artillerybullet1 = new ArtilleryBulletType(3f, 20, "shell"){{
			hitEffect = Fx.flakExplosion;
			knockback = 0.8f;
			lifetime = 80f * 3f;
			width = height = 11f;
			collidesTiles = false;
			splashDamageRadius = 25f * 8f;
			splashDamage = 49f;
			reloadMultiplier = 1.2f;
			ammoMultiplier = 3f;
			homingPower = homingRange = 100f; // wkwkwk
		}};
		artillerybullet2 = new ArtilleryBulletType(3f, 20, "shell"){{
			hitEffect = Fx.flakExplosion;
			knockback = 0.8f;
			lifetime = 80f * 3f;
			width = height = 11f;
			collidesTiles = false;
			splashDamageRadius = 100f * 8f;
			splashDamage = 73f;
			reloadMultiplier = 1.2f;
			ammoMultiplier = 3f;
			status = StatusEffects.blasted;
		}};
	}
}
