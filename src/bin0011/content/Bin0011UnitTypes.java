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
			speed = 1.8f;
			flying = true;
			lowAltitude = true;
			constructor = UnitEntity::create;
			range = maxRange = 144f;
			hitSize = 9f;
		}};
	}
}
