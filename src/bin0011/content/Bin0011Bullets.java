package bin0011.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.graphics.*;
import bin0011.content.*;

public class Bin0011Bullets implements ContentList{
	public static BulletType
		t8b1, t8b2, t8b3, t9b1;

	@Override
    	public void load(){
	// binary artillery
	t8b1 = new ArtilleryBulletType(){{
		hitEffect = Fx.flakExplosion;
		speed = 6.5f;
		knockback = 1f;
		lifetime = 80f;
		width = height = 11f;
		collidesTiles = false;
		splashDamageRadius = 30f * 0.75f;
		splashDamage = 45f;
	}};
	t8b2 = new ArtilleryBulletType(){{
		hitEffect = Fx.flakExplosion;
            	knockback = 0.8f;
		speed = 6.8f;
            	lifetime = 80f;
            	width = height = 11f;
            	collidesTiles = false;
            	splashDamageRadius = 25f * 0.75f;
            	splashDamage = 54f;
            	reloadMultiplier = 1.2f;
            	ammoMultiplier = 3f;
            	homingPower = 1f;
            	homingRange = 50f;
	}};
	t8b3 = new ArtilleryBulletType(){{
		hitEffect = Fx.blastExplosion;
            	knockback = 0.8f;
		speed = 7.2f;
            	lifetime = 80f;
            	width = height = 14f;
            	collidesTiles = false;
            	ammoMultiplier = 4f;
            	splashDamageRadius = 45f * 0.75f;
            	splashDamage = 55f;
            	backColor = Color.valueOf("ffffff");
            	frontColor = Pal.darkishGray;

            	status = StatusEffects.shocked;
	}};
	// end
	// binary missiles
	t9b1 = new MissileBulletType(4f, 11){{
            	width = 10f;
            	height = 10f;
            	shrinkY = 0f;
            	splashDamageRadius = 35f;
            	splashDamage = 58f * 1.5f;
            	ammoMultiplier = 6f;
            	hitEffect = Fx.blastExplosion;
            	despawnEffect = Fx.blastExplosion;
            	lightningDamage = 10;
            	lightning = 3;
            	lightningLength = 10;
            	status = StatusEffects.unmoving;
            	statusDuration = 240f;
        }};
	t9b2 = new MissileBulletType(4f, 11){{
            	 width = 10f;
            	height = 10f;
            	shrinkY = 0f;
            	splashDamageRadius = 37.5f;
            	splashDamage = 65f * 1.5f;
            	ammoMultiplier = 6f;
            	hitEffect = Fx.blastExplosion;
            	despawnEffect = Fx.blastExplosion;
            	lightningDamage = 15;
            	lightning = 3;
            	lightningLength = 10;
            	status = StatusEffects.unmoving;
            	statusDuration = 240f;
        }};
	}
}
