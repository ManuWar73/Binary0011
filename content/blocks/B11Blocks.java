		t0011 = new PowerTurret("t0101"){{
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
		t0100 = new PowerTurret("t0110"){{
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
	}
}
