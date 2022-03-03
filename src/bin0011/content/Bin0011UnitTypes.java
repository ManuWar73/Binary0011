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

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;
import bin0011.content.*;
import bin0011.content.Bin0011Blocks.*;

public class Bin0011UnitTypes implements ContentList{
	public static UnitType
		// malar
	 	guram, majuh;
	@Override
	public void load() {
		// malar start
		guram = new UnitType("guram"){{
			localizedName = "Guram";
			constructor = LegsUnit::create;
	 	 	speed = 0.67f;
            	 	drag = 0.4f;
		        hitSize = 13f;
		        flying = false;
            	 	rotateSpeed = 4.5f;
            	 	health = 600;
	 	 	legCount = 4;
            	 	legLength = 10f;
            	 	legTrns = 0.6f;
            	 	legMoveSpace = 1.4f;
            	 	hovering = true;
            	 	armor = 4f;
            	 	visualElevation = 0.2f;
	 	 	groundLayer = Layer.legUnit;
		}};
		majuh = new UnitType("majuh"){{
			localizedName = "Majuh";
			constructor = LegsUnit::create;
	 	 	speed = 0.78f;
            	 	drag = 0.51f;
		        hitSize = 26f;
		        flying = false;
            	 	rotateSpeed = 5f;
            	 	health = 700;
	 	 	legCount = 5;
            	 	legLength = 16f;
            	 	legTrns = 0.7f;
            	 	legMoveSpace = 1.57f;
            	 	hovering = true;
            	 	armor = 4.5f;
            	 	visualElevation = 0.2f;
	 	 	groundLayer = Layer.legUnit;
		}};
		// malar end
	}
}
