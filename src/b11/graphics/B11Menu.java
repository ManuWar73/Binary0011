package b11.graphics;

import arc.graphics.g2d.Draw;
import mindustry.gen.*;
import mindustry.graphics.Drawf;
import mindustry.graphics.MenuRenderer;
import mindustry.graphics.Pal;

import static arc.input.KeyCode.*;

public class B11Menu extends MenuRenderer {
        public B11Menu(){

        }
        private void generate(){
                Drawf.square(0,0,100,0, Pal.placing);
                Drawf.square(0,0,100,90, Pal.placing);
                Drawf.square(0,0,100,180, Pal.placing);
                Drawf.square(0,0,100,270, Pal.placing);
        }
}
