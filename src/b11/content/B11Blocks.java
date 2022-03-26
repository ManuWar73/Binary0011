package b11.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.Pal;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.entities.bullet.*;
import mindustry.entities.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.units.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.meta.*;
import mindustry.world.draw.*;
import b11.*;
import b11.content.*;
import static mindustry.type.ItemStack.*;
import static mindustry.type.ItemStack.with;

public class B11Blocks implements ContentList{
	public static Block
	// turret
	t0000, t0001, t0010
	;
	@Override
	public void load(){
		t0000 = new ItemTurret("t000") {{
			requirements(Category.turret, with(
				B11Items.item00, 25
			));
			size = 1;
			localizedName = "t000";
			health = 200 * size * size;
			reloadTime = 20f;
			shots = 1;
			range = 18f * 8f;
			maxAmmo = 200;
			restitution = 0.02f;
			inaccuracy = 0f;
			ammo(
				B11Items.item00, B11Bullets.basicbullet1,
				B11Items.item01, B11Bullets.basicbullet2
			);
		}};
		t0001 = new ItemTurret("t001") {{
			requirements(Category.turret, with(
				B11Items.item00, 30
				B11Items.item01, 20
			));
			size = 2;
			localizedName = "t001";
			health = 200 * size * size;
			reloadTime = 20f;
			shots = 2;
			range = 27f * 8f;
			maxAmmo = 200;
			restitution = 0.02f;
			inaccuracy = 0f;
			ammo(
				B11Items.item00, B11Bullets.basicbullet1,
				B11Items.item01, B11Bullets.basicbullet2
			);
		}};
	}
}
