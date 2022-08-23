		e0001 = new BurnerGenerator("e0001"){{
			requirements(Category.power, with(Items.copper, 65, Items.lead, 50, Items.silicon, 35));
			localizedName = "e0001";
			powerProduction = 8.16f;
			size = 2;
			itemDuration = 240f;
			ambientSound = Sounds.smelter;
			ambientSoundVolume = 0.03f;
		}};
		e0010 = new BurnerGenerator("e0010"){{
			requirements(Category.power, with(Items.copper, 165, Items.lead, 95, Items.silicon, 75, Items.titanium, 70));
			localizedName = "e0010";
			powerProduction = 21.75f;
			consumes.liquid(Liquids.water, 0.75f);
			size = 3;
			itemDuration = 270f;
			ambientSound = Sounds.smelter;
			ambientSoundVolume = 0.05f;
		}};
		e0011 = new BurnerGenerator("e0011"){{
			requirements(Category.power, with(Items.copper, 385, Items.lead, 175, Items.silicon, 100, Items.titanium, 95));
			localizedName = "e0010";
			powerProduction = 43.5f;
			consumes.liquid(Liquids.water, 4f);
			size = 4;
			itemDuration = 360f;
			ambientSound = Sounds.smelter;
			ambientSoundVolume = 0.06f;
		}};
		e0100 = new ThermalGenerator("e0100"){{
			requirements(Category.power, with(Items.copper, 15, Items.graphite, 10, Items.lead, 5));
			powerProduction = 1f;
			localizedName = "e0100";
			generateEffect = Fx.redgeneratespark;
			effectChance = 0.008f;
			size = 1;
			floating = true;
			ambientSound = Sounds.hum;
			ambientSoundVolume = 0.03f;
		}};
		e0101 = new ThermalGenerator("e0101"){{
			requirements(Category.power, with(Items.copper, 45, Items.graphite, 35, Items.lead, 20));
			powerProduction = 2.2f;
			localizedName = "e0101";
			generateEffect = Fx.redgeneratespark;
			effectChance = 0.009f;
			size = 2;
			floating = true;
			ambientSound = Sounds.hum;
			ambientSoundVolume = 0.04f;
		}};
		e0110 = new ThermalGenerator("e0110"){{
			requirements(Category.power, with(Items.copper, 135, Items.graphite, 105, Items.lead, 80, Items.silicon, 50));
			powerProduction = 3.8f;
			localizedName = "e0110";
			generateEffect = Fx.redgeneratespark;
			effectChance = 0.010f;
			size = 3;
			floating = true;
			ambientSound = Sounds.hum;
			ambientSoundVolume = 0.04f;
		}};
		e0111 = new ThermalGenerator("e0111"){{
			requirements(Category.power, with(Items.copper, 540, Items.graphite, 420, Items.lead, 280, Items.silicon, 100));
			powerProduction = 5f;
			localizedName = "e0111";
			generateEffect = Fx.redgeneratespark;
			effectChance = 0.011f;
			size = 4;
			floating = true;
			ambientSound = Sounds.hum;
			ambientSoundVolume = 0.04f;
		}};
		e1000 = new DecayGenerator("e1000"){{
			requirements(Category.power, with(Items.lead, 35, Items.silicon, 20, Items.plastanium, 15));
			size = 1;
			localizedName = "e1000";
			powerProduction = 2.5f;
			itemDuration = 60 * 7f;
		}};
		e1001 = new DecayGenerator("e1001"){{
			requirements(Category.power, with(Items.lead, 140, Items.silicon, 70, Items.plastanium, 65, Items.thorium, 25));
			size = 2;
			localizedName = "e1001";
			powerProduction = 5f;
			itemDuration = 60 * 14f;
		}};
		// end power
		// turret
		t0000 = new ItemTurret("t0000"){{
			requirements(Category.turret, with(Items.copper, 28), true);
			ammo(Items.lead, B11Bullets.basicbullet1, Items.graphite, B11Bullets.basicbullet2);
			spread = 4.5f;
			shots = 1;
			localizedName = "t0000";
			reloadTime = 24f;
			restitution = 0.03f;
			range = 128;
			shootCone = 15f;
			ammoUseEffect = Fx.casing1;
			health = 250;
			inaccuracy = 0f;
			rotateSpeed = 10f;
		}};
		t0001 = new ItemTurret("t0001"){{
			requirements(Category.turret, with(Items.copper, 40, Items.lead, 15), true);
			ammo(Items.lead, B11Bullets.basicbullet1, Items.graphite, B11Bullets.basicbullet2, Items.silicon, B11Bullets.basicbullet3);
			spread = 4.5f;
			shots = 2;
			localizedName = "t0001";
			alternate = true;
			reloadTime = 24f;
			range = 160;
			shootCone = 15f;
			ammoUseEffect = Fx.casing2;
			health = 300;
			inaccuracy = 0f;
			rotateSpeed = 12f;
		}};
		t0010 = new ItemTurret("t0010"){{
			requirements(Category.turret, with(Items.copper, 45, Items.lead, 20), true);
			ammo(Items.lead, B11Bullets.basicbullet1, Items.graphite, B11Bullets.basicbullet2, Items.silicon, B11Bullets.basicbullet3);
			spread = 4.5f;
			shots = 2;
			localizedName = "t0010";
			alternate = true;
			reloadTime = 18f;
			range = 192;
			shootCone = 15f;
			ammoUseEffect = Fx.casing2;
			health = 350;
			inaccuracy = 0f;
			rotateSpeed = 12f;
		}};
		t0011 = new ItemTurret("t0011"){{
			requirements(Category.turret, with(Items.copper, 45, Items.graphite, 18), true);
			ammo(Items.lead, B11Bullets.basicbullet1, Items.graphite, B11Bullets.basicbullet2, Items.silicon, B11Bullets.basicbullet3);
			spread = 4.5f;
			shots = 2;
			localizedName = "t0010";
			alternate = true;
			reloadTime = 18f;
			range = 192;
			shootCone = 15f;
			ammoUseEffect = Fx.casing2;
			health = 350;
			inaccuracy = 0f;
			rotateSpeed = 12f;
		}};
		t0100 = new ItemTurret("t0100"){{
			requirements(Category.turret, with(Items.copper, 48, Items.graphite, 20));
			ammo(Items.silicon, B11Bullets.artillerybullet1, Items.blastCompound, B11Bullets.artillerybullet2);
			targetAir = false;
			localizedName = "t0100";
			reloadTime = 60f;
			recoilAmount = 2f;
			range = 248f;
			shootCone = 10f;
			health = 260;
			shootSound = Sounds.bang;
		}};
		t0101 = new PowerTurret("t0101"){{
			requirements(Category.turret, with(Items.copper, 65, Items.lead, 35));
			shootType = B11Bullets.lightningbullet1;
			reloadTime = 25f;
			shootCone = 40f;
			rotateSpeed = 8f;
			powerUse = 3.5f;
	 	 	targetAir = true;
	 	 	range = 128f;
	 	 	shootEffect = Fx.lightningShoot;
	 	 	recoilAmount = 1f;
	 	 	size = 1;
	 	 	health = 300;
	 	 	shootSound = Sounds.spark;
		}};
		t0110 = new PowerTurret("t0110"){{
			requirements(Category.turret, with(Items.copper, 60, Items.lead, 70, Items.silicon, 50));
			range = 165f;
			localizedName = "t0110";
			chargeTime = 40f;chargeMaxDelay = 30f;chargeEffects = 7;chargeEffect = Fx.lancerLaserCharge;chargeBeginEffect = Fx.lancerLaserChargeBegin;recoilAmount = 2f; // charge stuffs
	 	 	reloadTime = 160f;
			cooldown = 0.03f;
			powerUse = 6f;
			shootShake = 2f;
			shootEffect = Fx.lancerLaserShoot;
			smokeEffect = Fx.none;
	 	 	size = 2;
	 	 	health = 350 * size * size;
	 	 	targetAir = true;
	 	 	shootSound = Sounds.laser;
	 	 	shootType = B11Bullets.laserbullet1;
		}};
		// end turret
		t0111 = new ItemTurret("t0111"){{
	 	 	requirements(Category.turret, with(Items.copper, 65, Items.lead, 65));
	 	 	ammo(Items.scrap, B11Bullets.flak1,Items.lead, B11Bullets.flak2,Items.metaglass, B11Bullets.flak3);
	 	 	reloadTime = 18f;
	 	 	range = 240f;
	 	 	size = 2;
			localizedName = "t0111";
			burstSpacing = 4f;
			shots = 2;
			targetGround = false;
			recoilAmount = 2f;
			rotateSpeed = 15f;
			inaccuracy = 5f;
			shootCone = 35f;
			health = 325 * size * size;
			shootSound = Sounds.shootSnap;
		}};
		t1000 = new ItemTurret("t1000"){{
	 	 	requirements(Category.turret, with(Items.copper, 75, Items.lead, 55, Items.silicon, 20));
	 	 	ammo(Items.scrap, B11Bullets.flak1,Items.lead, B11Bullets.flak2,Items.metaglass, B11Bullets.flak3);
	 	 	reloadTime = 9f;
	 	 	range = 280f;
	 	 	size = 2;
			localizedName = "t1000";
			burstSpacing = 4f;
			shots = 3;
			targetGround = false;
			recoilAmount = 2f;
			rotateSpeed = 15f;
			inaccuracy = 0f;
			shootCone = 35f;
			health = 350 * size * size;
			shootSound = Sounds.shootSnap;
		}};
		t1001 = new PowerTurret("t1001"){{
			requirements(Category.turret, with(Items.copper, 2000, Items.lead, 1500, Items.silicon, 1750, Items.surgeAlloy, 575, Items.titanium, 800, Items.thorium, 250, Items.plastanium, 850));
			range = 460;
			localizedName = "t1000";
			details = "an endgame turret that ends your game, and the development of this mod.";
			recoilAmount = 2f;
	 	 	reloadTime = 180f;
			cooldown = 1f;
			powerUse = 12f;
			shootShake = 2f;
	 	 	size = 4;
	 	 	health = 2500 * size * size;
	 	 	targetAir = true;
	 	 	shootSound = Sounds.laser;
	 	 	shootType = B11Bullets.biglaserbullet;
		}};
	}
}
