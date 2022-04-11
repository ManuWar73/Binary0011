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
	e0000, e0001, e0010, e0011;
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
	}
}
