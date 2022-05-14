package b11.blocks.defense;

import arc.math.Mathf;
import b11.content.B11Bullets;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Building;
import mindustry.gen.Bullet;
import mindustry.gen.Teamc;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BlockGroup;
import mindustry.world.meta.Stat;

public class BulletWall extends Wall {
        /**
         * @author 1237
         * a wall that shoots bullets when destroyed. a hybrid wall turret.
         * @param name name of the object/block.
         */
        public BulletWall(String name){
                super(name);
                group = BlockGroup.walls;
                localizedName = name;
        }
        public BulletType shootType = B11Bullets.copperBulletWall;
        public int shots = 3;

        public void setStats(){
                stats.add(Stat.range, (int) (shootType.lifetime * shootType.speed) / 8);
                stats.add(Stat.damage, shootType.damage);
        }
        public class BulletWallBuild extends Building {
                public void onDestroyed() {
                        super.onDestroyed();
                        for (int i = 0; i < shots * 3; i++) {
                                shootType.create((Teamc) this, x, y,(Mathf.random(0, 4)) * 90);
                        }
                }
        }
}
