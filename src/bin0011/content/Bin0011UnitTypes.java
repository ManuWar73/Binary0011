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
	 	 	health = 520;
			speed = 3f;
			flying = true;
			constructor = UnitEntity::create;
			range = maxRange = 144f;
			hitSize = 9f;
            		weapons.add(new Weapon("basic-weapon-1"){{
                		y = -6;
				x = 0;
				top = true;
                		reload = 10f;
                		ejectEffect = Fx.casing1;
                		bullet = new BasicBulletType(2.75f, 17){{
                                	width = height = 7f;
                    			lifetime = 85f;
                    			shootEffect = Fx.shootSmall;
                    			smokeEffect = Fx.shootSmallSmoke;
                    			ammoMultiplier = 2;
					shootSound = Sounds.pew;
                		}};
                	}});
		}};
	}
}
