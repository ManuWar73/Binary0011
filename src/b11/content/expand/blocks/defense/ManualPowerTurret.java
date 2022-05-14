package b11.content.expand.blocks.defense;

import arc.math.Mathf;
import arc.struct.ObjectMap;
import b11.content.B11Bullets;
import mindustry.entities.bullet.BulletType;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatValues;

public class ManualPowerTurret extends PowerTurret {
        /**
         * @author 1237
         * basically a power turret but it won't shoot anything until you tap it.
         * This class uses some codes from Anuken's power turret code.
         * @param name name of the object/block.
         */
        public ManualPowerTurret(String name) {
                super(name);
                hasPower = true;
        }
        private int counter = 0;
        @Override
        public void setStats(){
                super.setStats();
                stats.add(Stat.ammo, StatValues.ammo(ObjectMap.of(this, shootType)));
        }
        public BulletType shoot = B11Bullets.lancerManual;
        public class ManualPowerTurretBuild extends PowerTurretBuild{
                @Override
                public BulletType useAmmo(){
                        return shootType;
                }
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
                @Override
                public void updateTile(){
                        unit.ammo(power.status * unit.type().ammoCapacity);

                        super.updateTile();
                }
        }
}
