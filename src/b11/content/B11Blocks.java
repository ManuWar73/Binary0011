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
import mindustry.world.meta.*;
import static mindustry.type.ItemStack.*;
import b11.content.*;
import java.util.*;
import mindustry.content.*;
public class B11Blocks implements ContentList{
	public static Block
	e0000, e0001;
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
			requirements(Category.power, with(Items.copper, 70, Items.lead, 50, Items.silicon, 15));
			localizedName = "e0001";
			powerProduction = 2.72f;
			size = 2;
			itemDuration = 240f;
			ambientSound = Sounds.smelter;
			ambientSoundVolume = 0.03f;
		}};
		// effect
		m0000 = new MendProjector("m0000"){{
			requirements(Category.effect, with(Items.lead, 45, Items.copper, 35, Items.silicon, 20));
			consumes.power(0.32f);
			localizedName = "m0000";
			details = "basically it's a block that damages another blocks";
			size = 1;
			reload = 125f;
			range = 8 * 20f;
			healPercent = -5f;
			phaseBoost = 4f;
			phaseRangeBoost = 35f;
			health = 125;
			consumes.item(Items.silicon).boost();
		}};
		m0001 = new MendProjector("m0001"){{
			requirements(Category.effect, with(Items.lead, 90, Items.copper, 70, Items.silicon, 40, Items.titanium, 35));
			consumes.power(0.32f);
			localizedName = "m0001";
			details = "m0000 MKII";
			size = 2;
			reload = 65f;
			range = 8 * 45f;
			healPercent = -20f;
			phaseBoost = 5f;
			phaseRangeBoost = 55f;
			health = 250 * size * size;
			consumes.item(Items.silicon).boost();
		}};
	}
}
