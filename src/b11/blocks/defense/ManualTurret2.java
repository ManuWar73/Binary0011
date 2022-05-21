package b11.blocks.defense;

import arc.audio.Sound;
import arc.math.Mathf;
import arc.util.Time;
import b11.content.B11Bullets;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Building;
import mindustry.gen.Sounds;
import mindustry.graphics.Drawf;
import mindustry.graphics.Pal;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatUnit;

public class ManualTurret2 extends Block {
	/**
	 *
	 * trying to fix the original manual turret class.
	 *
	 */
        public ManualTurret2(String name) {
                super(name);
                itemCapacity = 10;
        }

        public int shots = 8;
        public BulletType shootType = B11Bullets.e;
        public int reload = 30;
        public Sound shootSound = Sounds.shoot;

        public void setStats(){
                super.setStats();
                stats.add(Stat.reload, reload / 60, StatUnit.seconds);
                stats.add(Stat.damage, (shootType.damage) * shots);
        }

        public class ManualTurretBuild extends Building {
                boolean shoot = efficiency > 0;
                public void shoot(){
                        consume();
                        for (int i = 0; i < shots; i++) {
                                Drawf.square(x, y, 8, this.rotation, Pal.placing);
                                shootType.create(this, x, y, i * (360 / shots));
                                shootSound.at(x,y,1);
                        }
                }
                int cooldown = 0;
                public void tapped(){
                        if(shoot == true && cooldown <= 0){
                                shoot();
                                cooldown = reload;
                        }
                }

                public void updateTile(){
                        if(cooldown >= 0){
                                cooldown -= Time.delta;
                        }
                }
        }
}