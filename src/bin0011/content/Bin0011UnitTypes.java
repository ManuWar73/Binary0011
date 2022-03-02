package mindustry.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class Bin0011UnitTypes implements ContentList{
	public static UnitType 
		guram, /* majuh, belit, rantas, caruk */;
/*
         atrax = new UnitType("atrax"){{
            speed = 0.57f;
            drag = 0.4f;
            hitSize = 13f;
            rotateSpeed = 3f;
            targetAir = false;
            health = 600;
            immunities = ObjectSet.with(StatusEffects.burning, StatusEffects.melting);

            legCount = 4;
            legLength = 9f;
            legTrns = 0.6f;
            legMoveSpace = 1.4f;
            hovering = true;
            armor = 3f;
            ammoType = new ItemAmmoType(Items.coal);

            visualElevation = 0.2f;
            groundLayer = Layer.legUnit - 1f;

            weapons.add(new Weapon("eruption"){{
                top = false;
                shootY = 3f;
                reload = 9f;
                ejectEffect = Fx.none;
                recoil = 1f;
                x = 7f;
                shootSound = Sounds.flame;

                bullet = new LiquidBulletType(Liquids.slag){{
                    damage = 13;
                    speed = 2.5f;
                    drag = 0.009f;
                    shootEffect = Fx.shootSmall;
                    lifetime = 57f;
                    collidesAir = false;
                }};
            }});
        }};
*/
/*	@Override
	public void load() {
		guram = new UnitType("guram"){{
			speed = 0.67f;
            	 	drag = 0.4f;
		        hitSize = 13f;
            	 	rotateSpeed = 3f;
            	 	targetAir = false;
            	 	health = 600;
			immunities = ObjectSet.with(StatusEffects.burning, StatusEffects.melting);
	 	 	legCount = 4;
            	 	legLength = 9f;
            	 	legTrns = 0.6f;
            	 	legMoveSpace = 1.4f;
            	 	hovering = true;
            	 	armor = 3f;
            	 	ammoType = new ItemAmmoType(Items.coal);
            	 	visualElevation = 0.2f;
	 	 	groundLayer = Layer.legUnit - 1f; */
