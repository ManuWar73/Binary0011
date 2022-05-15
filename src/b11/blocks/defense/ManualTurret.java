package b11.blocks.defense;

import arc.audio.Sound;
import arc.math.Mathf;
import b11.content.B11Bullets;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Building;
import mindustry.gen.Sounds;
import mindustry.graphics.Drawf;
import mindustry.graphics.Pal;
import mindustry.world.Block;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatUnit;

public class ManualTurret extends Block {
        /**
         * an experiment. this class uses some code from uujuju's scatter silo.
         */
        public float range = 128f;
        public BulletType bullet1 = B11Bullets.e; // empty bullet
        public BulletType bullet2 = B11Bullets.e;
        public Sound shootSound = Sounds.wind3;
        public int shots = 8;

        public ManualTurret(String name) {
                super(name);
                solid = destructible = hasItems = acceptsItems = true;
                itemCapacity = 25;
        }

        @Override
        public void setStats() {
                super.setStats();
                stats.add(Stat.range, range/8, StatUnit.blocks);
        }
        @Override
        public void drawPlace(int x, int y, int rotation, boolean valid){
                super.drawPlace(x, y, rotation, valid);
                Drawf.dashCircle(x * 8, y * 8, range, Pal.placing);
        }

        public class ManualTurretBuild extends Building {
                public int getProximityBlocks() {
                        int add = 0;
                        for (int i = 0; i < this.proximity.size; i++) {
                                if (this.proximity.get(i) != null) {
                                        add += 1;
                                }
                        }
                        return add;
                }
                @Override
                public void tapped() {
                        if(hasItems && this.efficiency > 0){
                                this.consume();
                                for (int i = 0; i < (shots + getProximityBlocks()); i++) {
                                        bullet1.create(this, this.team, x, y, i * 45);
                                        i++;
                                        bullet2.create(this, this.team, x, y, i * 45);
                                        shootSound.at(x, y, Mathf.random(-5, 2));
                                }
                                Drawf.square(x,y,range/8,Pal.placing);
                        }
                }

                @Override
                public void drawSelect() {
                        Drawf.dashCircle(x, y, range, Pal.placing);
                }
        }
}