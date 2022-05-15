package b11.content;

import arc.audio.Sound;
import arc.graphics.Color;
import b11.blocks.defense.BulletWall;
import b11.blocks.defense.ManualTurret;
import b11.content.*;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Sounds;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.draw.DrawDefault;
import mindustry.world.draw.DrawFlame;
import mindustry.world.draw.DrawMulti;

import static mindustry.type.ItemStack.*;

public class B11Blocks {
	public static Block
		test, test2, test3;
	public static void load(){
		test = new AirBlock("test");
		test2 = new ManualTurret("AAAAAAAAAAAAAAAAAAAAAAA"){{
			reload = 120f;
			range = 128f;
			bullet1 = B11Bullets.lancerManual;
			bullet2 = B11Bullets.lancerManual;
			consumePower(1);
			shootSound = Sounds.wind3;
			shots = 8;
		}};

	}
}
