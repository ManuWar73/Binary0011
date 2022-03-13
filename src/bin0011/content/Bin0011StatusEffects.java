package mindustry.content;

import arc.*;
import arc.graphics.*;
import arc.math.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.game.EventType.*;
import mindustry.type.*;
import mindustry.graphics.*;


import static mindustry.Vars.*;

public class Bin0011StatusEffects implements ContentList{
    public static StatusEffect
		mati
		;

    @Override
    public void load(){

        mati = new StatusEffect("mati"){{
			localizedName = "Mati"; // mati = dead
            color = Color.valueOf("666666"); // bjir
            damage = 99999999999999999999999999999f;
            effect = Fx.lightning;
            transitionDamage = 1f;
		}};
	}
}
