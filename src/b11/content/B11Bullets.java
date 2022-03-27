package b11.content;

import arc.graphics.Color;
import mindustry.content.*;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.*;
import b11.*;
import b11.content.*;

public class B11Bullets implements ContentList {
	public static BulletType
	// basic bullets
	basicbullet1, basicbullet2, basicbullet3, basicbullet4,
	// pawer bullets
	lightningbullet1, laserbullet1, laserbullet2
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
		// pawer end
	}
}


