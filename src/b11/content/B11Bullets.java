package b11.content;

import arc.graphics.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.graphics.*;

public class B11Bullets {
        public static BulletType
                // bullet wall
                copperBulletWall,
                // manual power turret
                lancerManual;

        public static void load() {
                // reg bullet wall
                copperBulletWall = new BasicBulletType(2.5f, 10){{
                        width = height = 8;
                        lifetime = 60f;
                        ammoMultiplier = 2;
                }};
                lancerManual = new LaserBulletType(140 / 4){{
                                colors = new Color[]{Pal.lancerLaser.cpy().a(0.4f), Pal.lancerLaser, Color.white};
                                chargeEffect = new MultiEffect(Fx.lancerLaserCharge, Fx.lancerLaserChargeBegin);
                                buildingDamageMultiplier = 1.25f;
                                hitEffect = Fx.hitLancer;
                                hitSize = 4;
                                lifetime = 16f;
                                drawSize = 400f;
                                collidesAir = true;
                                length = 20*8f;
                                ammoMultiplier = 1f;
                                pierceCap = 4;
                }};
                // end bullet wall
        }
}
