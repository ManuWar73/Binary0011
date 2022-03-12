package bin0011.content;

import arc.graphics.Color;
import arc.struct.*;
import mindustry.graphics.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.abilities.*;
import mindustry.world.meta.*;
import mindustry.gen.*;
import mindustry.ctype.ContentList;
import mindustry.type.*;

public class Bin0011UnitTypes implements ContentList {
	public static UnitType
		unit000;

	@Override
	public void load() {
		unit000 = new UnitType("unit000") {{
			localizedName = "unit000";
	 	 	health = 600;
			speed = 5.25f;
			flying = true;
			constructor = UnitEntity::create;
			range = maxRange = 144f;
			hitSize = 8f;
            		weapons.add(new Weapon("binary0011-basic-weapon-1"){{
                		y = -6;
				x = 0;
				mirror = false;
				top = true;
                		reload = 10f;
                		ejectEffect = Fx.casing1;
				shootSound = Sounds.pew;
                		bullet = new BasicBulletType(10f, 17){{
                                	width = height = 7f;
					top = true;
                    			lifetime = 85f;
                    			shootEffect = Fx.shootSmall;
                    			smokeEffect = Fx.shootSmallSmoke;
                		}};
                	}});
		}};
	}
}
