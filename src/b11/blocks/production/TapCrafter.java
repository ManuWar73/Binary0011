package b11.blocks.production;

import arc.graphics.Color;
import arc.struct.EnumSet;
import mindustry.gen.Sounds;
import mindustry.graphics.Drawf;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.draw.DrawBlock;
import mindustry.world.draw.DrawDefault;
import mindustry.world.meta.BlockFlag;

public class TapCrafter extends GenericCrafter {
        /**
         * @author 1237
         * basically a manual crafter
         * @param name name of the block/object
         */
        public TapCrafter(String name) {
                super(name);
                solid = hasItems = sync = true;
                ambientSound = Sounds.machine;
                ambientSoundVolume = 0.03f;
                flags = EnumSet.of(BlockFlag.factory);
                drawArrow = false;
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
                        if(shouldConsume() && (outputItem != null || outputItems != null) && counter % tap == 0){
                                consume();
                                craft();
                        }
                }
        }
}
