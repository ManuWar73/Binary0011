package b11.content;

import arc.graphics.Color;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import b11.*;
import b11.content.*;

public class B11Bullets {
/*
	public static BulletType
	// basic
	basicbullet1, basicbullet2, basicbullet3, basicbullet4,
	// pawer
	lightningbullet1, laserbullet1, laserbullet2, biglaserbullet,
	// artillery
	artillerybullet1, artillerybullet2, artillerybullet3,
	// missile
	missile1, missile2,
	// flak
	flak1, flak2, flak3
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
			colors = new Color[]{Color.valueOf("777777"), Color.valueOf("cccccc"), Color.valueOf("ffffff")};
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
		artillerybullet3 = new ArtilleryBulletType(3f, 20, "shell"){{
			hitEffect = Fx.flakExplosion;
			knockback = 0.8f;
			lifetime = 80f * 4.5f;
			width = height = 11f;
			collidesTiles = false;
			splashDamageRadius = 100f * 8f;
			splashDamage = 85f;
			reloadMultiplier = 1.25f;
			ammoMultiplier = 3f;
			status = StatusEffects.unmoving;
			homingPower = 100;
			homingRange = 240;
		}};
		// artillery end
		// missile start
		missile1 = new MissileBulletType(3.7f, 24){{
			width = height = 8f;
			shrinkY = 0f;
			splashDamageRadius = 25f;
			splashDamage = 34f * 1.4f;
			hitEffect = Fx.blastExplosion;
			despawnEffect = Fx.blastExplosion;
			ammoMultiplier = 4f;
			lightningDamage = lightningLength = 25;
			lightning = 2;
		}};
		missile2 = new MissileBulletType(3.7f, 27){{
			width = height = 10f;
			shrinkY = 0f;
			splashDamageRadius = 25f;
			splashDamage = 34f * 1.4f;
			hitEffect = Fx.blastExplosion;
			despawnEffect = Fx.blastExplosion;
			ammoMultiplier = 4f;
			lightningDamage = lightningLength = 45;
			lightning = 2;
		}};
		// missile end
		// flak start
		flak1 = new FlakBulletType(4.5f, 13){{
			ammoMultiplier = 2f;
			splashDamage = splashDamageRadius = 28f * 1.5f;
			lightning = 2;
			lightningLength = 7;
			shootEffect = Fx.shootBig;
			collidesGround = true;
			explodeRange = 15f;
		}};
		flak2 = new FlakBulletType(4.5f, 13){{
			ammoMultiplier = 4f;
			splashDamage = splashDamageRadius = 44f * 1.5f;
			lightning = 3;
			lightningLength = 8;
			shootEffect = Fx.shootBig;
			collidesGround = true;
			explodeRange = 35f;
		}};
		flak3 = new FlakBulletType(4.5f, 13){{
			ammoMultiplier = 2f;
			splashDamage = splashDamageRadius = 28f * 1.5f;
			lightning = 8;
			lightningLength = 17;
			shootEffect = Fx.shootBig;
			collidesGround = true;
			explodeRange = 50f;
		}};
		// flak end
	} */
}
