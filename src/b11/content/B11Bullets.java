package b11.content;

import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;

public class B11Bullets {
        public static BulletType
                copperBulletWall;

        public static void load() {
                // reg bullet wall
                copperBulletWall = new BasicBulletType(2.5f, 10){{
                        width = height = 8;
                        lifetime = 60f;
                        ammoMultiplier = 2;
                }};
                // end bullet wall
        }
}
