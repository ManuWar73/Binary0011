package b11.blocks.defense;

import b11.content.B11Bullets;
import mindustry.entities.bullet.BulletType;
import mindustry.graphics.Drawf;
import mindustry.graphics.Pal;
import mindustry.world.blocks.production.GenericCrafter;

public class E extends GenericCrafter {
        public E(String name) {
                super(name);
        }
        public int shots = 8;
        public BulletType bullet1, bullet2  = B11Bullets.e;

        public class EBuild extends GenericCrafterBuild {
                public void craft(){
                        consume();
                        for(int i = 0; i < shots; i++) {
                              bullet1.create(this, x, y, i * (int)(360 / shots));
                              i++;
                              bullet2.create(this, x, y, i * (int)(360 / shots));
                        }
                }
        }
}
