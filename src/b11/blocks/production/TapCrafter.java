package b11.blocks.production;

import arc.graphics.Color;
import arc.struct.EnumSet;
import mindustry.gen.Sounds;
import mindustry.graphics.Drawf;
import mindustry.type.ItemStack;
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
                boolean F = false;
                @Override
                public void tapped(){
                        Drawf.square(x,y,5,tapColor);
                        counter++;
                        F = true;
                        if(shouldConsume() && (outputItem != null || outputItems != null) && counter % tap == 0){
                                consume();
                                craft();
                                counter = 0;
                        }
                }
                public void craft(){
                        consume();
                        if(outputItems != null && F == true){
                                for(var output : outputItems){
                                        for(int i = 0; i < output.amount; i++){
                                                offload(output.item);
                                        }
                                }
                        }
                        if(wasVisible){
                                craftEffect.at(x, y);
                        }
                        progress %= 1f;
                }

                public void dumpOutputs(){
                        if((outputItems != null && F == true) && timer(timerDump, dumpTime / timeScale)){
                                for(ItemStack output : outputItems){
                                        dump(output.item);
                                }
                        }

                        if(outputLiquids != null && F == true){
                                for(int i = 0; i < outputLiquids.length; i++){
                                        int dir = liquidOutputDirections.length > i ? liquidOutputDirections[i] : -1;

                                        dumpLiquid(outputLiquids[i].liquid, 2f, dir);
                                }
                        }
                }
        }
}
