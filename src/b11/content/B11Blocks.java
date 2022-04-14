package b11.content;
import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
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
import mindustry.world.draw.DrawRotator;
import mindustry.world.meta.*;
import static mindustry.type.ItemStack.*;
import b11.content.*;
import java.util.*;
import mindustry.content.*;
public class B11Blocks implements ContentList{
	public static Block
        // power
	e0000, e0001, e0010, e0011, e0100, 
	e0101, e0110, e0111, e1000, e1001;
	@Override
	public void load(){
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
	}
}
