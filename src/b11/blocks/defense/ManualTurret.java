package b11.blocks.defense;

import arc.util.io.Writes;
import b11.content.B11Bullets;
import mindustry.content.Items;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Building;
import mindustry.type.Item;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.Turret;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatValues;

import java.util.concurrent.TimeUnit;

public class ManualTurret extends Wall{
        /**
         * @author 1237
         * an experiment.
         */
        public ManualTurret(String name) {
                super(name);
                solid = destructible = true;
                hasItems = true;
                acceptsItems = true;
                itemCapacity = 100;

        }
        final int shots = 8;
        public BulletType shoot1 = B11Bullets.lancerManual;
        public BulletType shoot2 = B11Bullets.lancerManual;
        public Item ammo = Items.copper;

        @Override
        public void setStats(){
                super.setStats();
                stats.add(Stat.damage, shoot1.damage);
                stats.add(Stat.damage, shoot2.damage);
                stats.add(Stat.itemCapacity, this.itemCapacity);
        }
        public class ManualTurretBuild extends Building {
                @Override
                public boolean canConsume(){
                        return this.items.total() <= itemCapacity;
                }
                @Override
                public void tapped() {
                        boolean E = false;
                        if(E == false){
                                if(/*this.items.total() <= itemCapacity && this.items.has(ammo)*/
                                        canConsume()
                                ){
                                        for (int i = 0; i < shots;) {
                                                shoot1.create(this, x, y,i * 45);
                                                try {
                                                        TimeUnit.SECONDS.sleep(1);
                                                } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                }
                                                i++;
                                                shoot2.create(this, x, y,i * 45);
                                                try {
                                                        TimeUnit.SECONDS.sleep(1);
                                                } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                }
                                                i++;
                                                E = true;
                                        }
                                }
                                super.tapped();
                                E = false;
                        }
                }
        }
}
