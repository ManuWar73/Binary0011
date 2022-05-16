package b11.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class B11Items{
	public static Item
	bronze;
	public static void load(){
		bronze = new Item("bronze", Color.valueOf("d9806c")){{
			cost = 1.5f;
			hardness = 4;
		}};
	}
}
