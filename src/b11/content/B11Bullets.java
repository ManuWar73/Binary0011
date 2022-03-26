package b11.content;

import arc.graphics.Color;
import mindustry.content.*;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.*;
import b11.*;
import b11.content.*;

public class B11Bullets implements ContentList {
	public static BulletType
	basicbullet1, basicbullet2;
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
	}
}


