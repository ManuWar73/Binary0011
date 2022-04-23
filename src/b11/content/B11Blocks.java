package b11.content;
/* arc */ import arc.graphics.*;import arc.math.*;import arc.struct.*;
/* mindus */ import mindustry.*;import mindustry.ctype.*;import mindustry.entities.*;import mindustry.entities.bullet.*;import mindustry.gen.*;import mindustry.graphics.*;import mindustry.type.*;import mindustry.world.*;import mindustry.world.blocks.*;import mindustry.world.blocks.campaign.*;import mindustry.world.blocks.defense.*;import mindustry.world.blocks.defense.turrets.*;import mindustry.world.blocks.distribution.*;import mindustry.world.blocks.environment.*;import mindustry.world.blocks.legacy.*;import mindustry.world.blocks.liquid.*;import mindustry.world.blocks.logic.*;import mindustry.world.blocks.payloads.*;import mindustry.world.blocks.power.*;import mindustry.world.blocks.production.*;import mindustry.world.blocks.sandbox.*;import mindustry.world.blocks.storage.*;import mindustry.world.blocks.units.*;import mindustry.world.consumers.*;import mindustry.world.draw.*;import mindustry.world.draw.DrawRotator;import mindustry.world.meta.*;import static mindustry.type.ItemStack.*;import mindustry.content.*;
/* binary */ import b11.content.*;import b11.world.blocks.defense.*;
public class B11Blocks implements ContentList{
	public static Block
	// experimental
	experimental,
        // power
	e0000, e0001, e0010, e0011, e0100, e0101,
	e0110, e0111, e1000, e1001,
	// distribution
	d0000, d0001, d0010,
	// turret
	t0000, t0001, t0010, t0011, t0100, t0101;
	@Override
	public void load(){
		experimental = new AbsorbWall("experimental"){{
			requirements(Category.defense, with(Items.copper, 1));
	 	 	health = 1000;
		}};
		// power
		e0000 = new BurnerGenerator("e0000"){{
			requirements(Category.power, with(Items.copper, 35, Items.lead, 25));
			localizedName = "e0000";
			powerProduction = 1.3f;
			itemDuration = 180f;
			ambientSound = Sounds.smelter;
			ambientSoundVolume = 0.03f;
		}};
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
		// distribution
		d0000 = new StackConveyor("d0000"){{
			requirements(Category.distribution, with(Items.titanium, 1));
			localizedName = "d0000";
			health = 50;
			speed = 3f / 60f;
			itemCapacity = 10;
		}};
		d0001 = new Router("d0001"){{requirements(Category.distribution, with(Items.titanium, 1));localizedName = "d0001";health = 200;speed = 0.2f;}}; // compact™
		d0010 = new Junction("d0010"){{requirements(Category.distribution, with(Items.titanium, 1));localizedName = "d0010";health = 150;speed = 0.2f;itemCapacity = 20;}};
		// end distribution
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
			shootType = B11Bullets.laserbullet1;
			reloadTime = 60f;
			shootCone = 40f;
			rotateSpeed = 8f;
			powerUse = 3.5f;
	 	 	targetAir = true;
	 	 	range = 128f;
	 	 	shootEffect = Fx.lightningShoot;
	 	 	recoilAmount = 1f;
	 	 	size = 1;
	 	 	health = 300;
	 	 	shootSound = Sounds.laser;
		}};
		// end turret
	}
}
