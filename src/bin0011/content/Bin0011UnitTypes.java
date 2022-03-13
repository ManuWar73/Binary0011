package bin0011.content;

import arc.graphics.Color;
import arc.struct.*;
import mindustry.graphics.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.abilities.*;
import mindustry.world.meta.*;
import mindustry.gen.*;
import mindustry.ctype.ContentList;
import mindustry.type.*;

public class Bin0011UnitTypes implements ContentList {
	public static UnitType
		unit000, unit001, unit010, unit011;

	@Override
	public void load() {
		unit000 = new UnitType("unit000") {{
			localizedName = "unit000";
	 	 	health = 600;
			speed = 4f;
			flying = true;
			constructor = UnitEntity::create;
			range = maxRange = 144f;
			hitSize = 8f;
            		weapons.add(new Weapon("binary0011-basic-weapon-1"){{
                		y = -6;
				x = 0;
				mirror = false;
				top = true;
                		reload = 10f;
                		ejectEffect = Fx.casing1;
				shootSound = Sounds.pew;
                		bullet = new BasicBulletType(10f, 17){{
                                	width = height = 7f;
					top = true;
                    			lifetime = 85f;
					visualElevation = 1f;
                    			shootEffect = Fx.shootSmall;
                    			smokeEffect = Fx.shootSmallSmoke;
                		}};
                	}});
		}};
		unit001 = new UnitType("unit001") {{
			localizedName = "unit001";
	 	 	health = 725;
			speed = 4f;
			flying = true;
			constructor = UnitEntity::create;
			range = maxRange = 192f;
			hitSize = 9f;
			weapons.add(new Weapon("binary0011-basic-weapon-2"){{
                		y = -4;
				x = 7;
				mirror = true;
				top = true;
                		reload = 12f;
                		ejectEffect = Fx.casing1;
				shootSound = Sounds.pew;
                		bullet = new BasicBulletType(10f, 12){{
                                	width = height = 7f;
					top = true;
                    			lifetime = 120f;
                    			shootEffect = Fx.shootSmall;
                    			smokeEffect = Fx.shootSmallSmoke;
                		}};
                	}});
			weapons.add(new Weapon("binary0011-basic-weapon-1"){{
                		y = 2;
				x = 0;
				mirror = false;
				top = true;
                		reload = 120f;
                		ejectEffect = Fx.casing2;
                		shootSound = Sounds.artillery;
                		bullet = new ArtilleryBulletType(2f, 35, "shell"){{
                    			hitEffect = Fx.blastExplosion;
                    			knockback = 0.8f;
                    			lifetime = 120f;
                    			width = height = 14f;
                    			collides = true;
                    			collidesTiles = true;
                    			splashDamageRadius = 35f;
                    			splashDamage = 80f;
                    			backColor = Pal.bulletYellowBack;
                    			frontColor = Pal.bulletYellow;
                		}};
                	}});
		}};
		unit010 = new UnitType("unit010") {{
			localizedName = "unit010";
	 	 	health = 857;
			speed = 3.5f;
			flying = true;
			constructor = UnitEntity::create;
			range = maxRange = 200f;
			hitSize = 9f;
			weapons.add(new Weapon("binary0011-laser-weapon-1"){{
                		y = 3;
				x = 5;
				mirror = true;
				top = true;
                		reload = 35f;
				shootSound = Sounds.spark;
                		bullet = new LightningBulletType(){{
                			damage = 28;
                			lightningLength = 50;
                			collidesAir = true;
                			ammoMultiplier = 1f;
                		}};
                	}});
			weapons.add(new Weapon("binary0011-basic-weapon-2"){{
                		y = -4;
				x = 8;
				mirror = true;
				top = true;
                		reload = 24f;
                		ejectEffect = Fx.casing1;
				shootSound = Sounds.pew;
                		bullet = new BasicBulletType(10f, 16){{
                                	width = height = 7f;
					top = true;
                    			lifetime = 40f;
                    			shootEffect = Fx.shootSmall;
                    			smokeEffect = Fx.shootSmallSmoke;
                		}};
                	}});
		}};
		unit011 = new UnitType("unit011") {{
			localizedName = "unit011";
	 	 	health = 1000;
			speed = 3.8f;
			flying = true;
			constructor = UnitEntity::create;
			range = maxRange = 216f;
			hitSize = 18f;
			weapons.add(new Weapon(){{
                		minShootVelocity = 0.75f;
                		x = 6f;
				y = -7f;
                		shootY = 0f;
                		reload = 240f;
				mirror = true;
                		shootCone = 180f;
                		ejectEffect = Fx.none;
                		inaccuracy = 0f;
                		ignoreRotation = true;
                		shootSound = Sounds.none;
                		bullet = new BombBulletType(27f, 50f){{
                    			width = height = 16f;
                    			hitEffect = Fx.flakExplosion;
                    			shootEffect = Fx.none;
                    			smokeEffect = Fx.none;
                    			status = StatusEffects.shocked;
                    			statusDuration = 240f;
                		}};
            		}});
			weapons.add(new Weapon("binary0011-basic-weapon-3"){{
                		y = 2;
				x = 9;
				mirror = true;
				top = true;
                		reload = 4f;
                		ejectEffect = Fx.casing2Double;
				shootSound = Sounds.pew;
                		bullet = new MissileBulletType(3f, 20){{
                    			width = height = 10f;
                    			shrinkY = 0f;
                    			drag = -0.003f;
                    			homingRange = 60f;
					homingPower = 100f;
                    			keepVelocity = false;
                    			splashDamageRadius = 25f;
                    			splashDamage = 15f;
                    			lifetime = 50f;
                    			trailColor = backColor = Pal.unitBack;
                    			frontColor = Pal.unitFront;
                    			hitEffect = despawnEffect = Fx.blastExplosion;
                    			weaveScale = 6f;
                    			weaveMag = 1f;
				}};
                	}});
		}};
	}
}
