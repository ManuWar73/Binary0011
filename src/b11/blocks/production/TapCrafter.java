package b11.blocks.production;

import arc.graphics.Color;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.graphics.*;
import mindustry.world.blocks.production.*;
import mindustry.world.draw.*;
import mindustry.world.meta.Stat;

public class TapCrafter extends GenericCrafter {
        public TapCrafter(String name) {
                super(name);
        }
        public DrawBlock drawer = new DrawDefault();
        public int tap = 3;
        public Color tapColor = Color.valueOf("000000");

        public class TapCrafterBuild extends GenericCrafterBuild {
                int counter = 0;
                @Override
                public void tapped(){
                        Drawf.square(x,y,5,tapColor);
                        counter++;
                        if(counter % tap == 0){
                                craft();
                        } else if(counter % (tap * 10) == 0){
                                craft();
                                counter = 0; // reset counter, biar gak kena int limit.
                        }
                }
        }
}
