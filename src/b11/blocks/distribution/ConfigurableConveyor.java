package b11.blocks.distribution;

import mindustry.gen.Icon;
import mindustry.world.blocks.distribution.Conveyor;
import arc.*;
import arc.util.*;
import arc.util.io.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.scene.ui.layout.*;
import mindustry.ui.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.graphics.*;
import mindustry.world.meta.*;

public class ConfigurableConveyor extends Conveyor {
        public ConfigurableConveyor(String name) {
                super(name);
                update = configurable = true;
                speed = 1;
        }
        public float s = 0f;
        public int m = 0;

        public void buildConfiguration(){
                table.button(Icon.up, () -> {
                        if (s >= 0f) {
                                speed += 1;
                        }
                });
        }
}
