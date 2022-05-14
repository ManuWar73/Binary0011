package b11.content.expand.blocks.defense;

import arc.math.Mathf;
import b11.content.B11Bullets;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Building;
import mindustry.gen.Bullet;
import mindustry.gen.Teamc;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BlockGroup;
import mindustry.world.meta.Stat;

public class BulletWall extends Wall {
        /**
         * a wall that shoots bullets when destroyed. a hybrid wall turret.
         * @param name
         */
        public BulletWall(String name){
                super(name);
                group = BlockGroup.walls;
        }

        public BulletType shootType = B11Bullets.copperBulletWall;
        public int shots = 3;

        public class BulletWallBuild extends Building {
                public boolean collision(Bullet bullet) {
                        for (int i = 0; i < shots * 3; i++) {
                                shootType.create((Teamc) this.team, x, y,(Mathf.random(0, 4)) * 90);
                        }
                        return true;
                }
                public void setStats(){
                        stats.add(Stat.range, (int) (shootType.lifetime * shootType.speed) / 8);
                        stats.add(Stat.damage, shootType.damage);
                        stats.add(Stat.flying, "I'm a wall, not an air unit. i can't fly.");
                }
        }
}
