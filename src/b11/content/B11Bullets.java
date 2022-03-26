package b11.content;

import arc.graphics.Color;
import mindustry.content.*;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.*;
import b11.*;
import b11.content.*;

public class B11Bullets implements ContentList {
	public static BulletType
	basicbullet1, basicbullet2, basicbullet3, basicbullet4
	;
	@Override
	public void load(){
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
	}
}


