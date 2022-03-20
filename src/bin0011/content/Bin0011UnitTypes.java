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
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

public class Bin0011UnitTypes implements ContentList {
	public static UnitType
		unit000, unit001, unit010, unit011, unit100;

	@Override
	public void load() {
		unit000 = new UnitType("unit000") {{
			localizedName = "unit000";
	 	 	health = 800;
			speed = 4f;
			flying = true;
			lowAltitude = true;
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
	 	 	health = 1000;
			speed = 4f;
			lowAltitude = true;
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
	 	 	health = 3000;
			speed = 3.5f;
			lowAltitude = true;
			flying = true;
			constructor = UnitEntity::create;
			range = maxRange = 200f;
			hitSize = 9f;
			commandLimit = 16;
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
	 	 	health = 6000;
			speed = 3.8f;
			lowAltitude = true;
			flying = true;
			constructor = UnitEntity::create;
			range = maxRange = 216f;
			hitSize = 18f;
			commandLimit = 24;
			armor = 9f;
			abilities.add(new ForceFieldAbility(60f, 0.3f, 400f, 60f * 6));
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
				shootSound = Sounds.missile;
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
			weapons.add(new Weapon("binary0011-laser-weapon-2"){{
                		y = 4;
				x = 0;
				mirror = false;
				top = true;
                		reload = 60f;
				shootSound = Sounds.laser;
                		bullet = new LaserBulletType(156){{
					shootEffect = Fx.lancerLaserShoot;
                			colors = new Color[]{Pal.lancerLaser.cpy().a(0.4f), Pal.lancerLaser, Color.white};
                			hitEffect = Fx.hitLancer;
                			hitSize = 4;
                			lifetime = 16f;
                			drawSize = 400f;
                			collidesAir = true;
                			length = 173f;
                			ammoMultiplier = 1f;
            			}};
                	}});
			weapons.add(new Weapon("binary0011-laser-weapon-1"){{
                		y = -9;
				x = 9;
				mirror = true;
				top = true;
                		reload = 25f;
				shootSound = Sounds.spark;
                		bullet = new LightningBulletType(){{
                			damage = 28;
                			lightningLength = 50;
                			collidesAir = true;
                			ammoMultiplier = 1f;
                		}};
                	}});
			weapons.add(new Weapon("binary0011-basic-weapon-1"){{
                		y = -10;
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
		unit100 = new UnitType("unit100") {{
			localizedName = "unit100";
	 	 	health = 9000;
			speed = 2f;
			flying = true;
			lowAltitude = true;
			constructor = UnitEntity::create;
			range = maxRange = 256f;
			hitSize = 20f;
			commandLimit = 48;
			armor = 18f;
			abilities.add(new ForceFieldAbility(120f, 0.6f, 800f, 120f * 12));
			weapons.add(new Weapon("binary0011-laser-weapon-3"){{
                		y = 1;
				x = 0;
				mirror = false;
				top = true;
                		reload = 35f;
				heatColor = Color.valueOf("FFFFFF55");
            			shootSound = Sounds.laser;
                		bullet = new ContinuousLaserBulletType(100){{
                			length = 256f;
					top = true;
                			hitEffect = Fx.hitMeltdown;
                			hitColor = Pal.meltdownHit;
                			status = StatusEffects.melting;
                			drawSize = 160f;
                			incendChance = 0.4f;
                			incendSpread = 5f;
                			incendAmount = 1;
                			ammoMultiplier = 1f;
            			}};
                	}});
			weapons.add(new Weapon("binary0011-shrapnel-weapon-1"){{
				y = 19;
				x = 7;
				mirror = true;
				top = true;
				shots = 4;
				reload = 35f / 1.3f;
				heatColor = Color.valueOf("FFFFFF55");
				shootSound = Sounds.shotgun;
				bullet = new ShrapnelBulletType(){{
                    			length = 256f;
                    			damage = 66f * 1.5f;
                    			ammoMultiplier = 4f;
                    			width = 19f;
                		}};
			}});
			weapons.add(new Weapon("binary0011-missile-weapon-1"){{
                		y = -9;
				x = 17;
				mirror = true;
				top = true;
                		reload = 6f;
                		ejectEffect = Fx.casing2Double;
				shootSound = Sounds.missile;
                		bullet = new MissileBulletType(3f, 21){{
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
