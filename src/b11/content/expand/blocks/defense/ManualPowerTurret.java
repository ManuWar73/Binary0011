package b11.content.expand.blocks.defense;

import arc.math.Mathf;
import b11.content.B11Bullets;
import mindustry.entities.bullet.BulletType;
import mindustry.world.blocks.defense.turrets.PowerTurret;

public class ManualPowerTurret extends PowerTurret {
        /**
         * basically a power turret but it won't shoot anything until you tap it.
         * @param name name of the object/block.
         */
        public ManualPowerTurret(String name) {
                super(name);
                hasPower = true;
        }
        private int counter = 0;
        public BulletType shoot = B11Bullets.lancerManual;
        public class ManualPowerTurretBuild extends PowerTurretBuild{
                public void tapped(){
                        if(this.power.status > 0){
                                int LOOP = 4;
                                for (int i = 1; i <= LOOP; i++) {
                                        shoot.create(this, x, y, (Mathf.random(0, 4)) * 90);
                                        int a = 10;
                                        if(counter % a == 0){
                                                int b = 0;
                                                for (int j = 0; j < 8; j++) {
                                                        shoot.create(this, x, y, b * 45);
                                                        b++;
                                                }
                                        }
                                        counter++;
                                }
                        }
                }
        }
}
