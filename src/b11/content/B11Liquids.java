package b11.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class B11Liquids implements ContentList{
    public static Liquid liquid0, liquid1;
    @Override
    public void load(){
        liquid0 = new Liquid("liquid0", Color.valueOf("54555e")){{
            heatCapacity = 0.4f;
            localizedName = "liquid0";
            alwaysUnlocked = true;
            //effect = StatusEffects.wet;
        }};

        liquid1 = new Liquid("liquid1", Color.valueOf("989aa3")){{
            temperature = 1f;
            localizedName = "liquid1";
            viscosity = 0.7f;
            //effect = StatusEffects.melting;
            lightColor = Color.valueOf("ffffff").a(0.45f);
        }};
    }
}
