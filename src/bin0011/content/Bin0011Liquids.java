package bin0011.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;
import bin0011.content.*;

public class Bin0011Liquids implements ContentList{
    public static Liquid liquid0, liquid1;

    @Override
    public void load(){

        liquid0 = new Liquid("liquid0", Color.valueOf("9ca1b5")){{
            heatCapacity = 0.4f;
            alwaysUnlocked = true;
            temperature = 0.75f;
            // effect = StatusEffects.wet;
        }};

        liquid1 = new Liquid("liquid1", Color.valueOf("6e7080")){{
            temperature = 1f;
            viscosity = 0.57f;
            flammability = 0.78f;
            // effect = StatusEffects.melting; 
            lightColor = Color.valueOf("ffffff").a(0.9f);
        }};
    }
}
