package b11.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.*;

public class B11Items implements ContentList{
	public static Item 
	item00, item01, item10, item11;
	@Override
	public void load(){
		item00 = new Item("item00", Color.valueOf("b2bbc2")){{
			cost = 0.1f;
			localizedName = "item00";
			hardness = 0;
		}};
		item01 = new Item("item01", Color.valueOf("54555e")){{
			cost = 0.1f;
			localizedName = "item01";
			hardness = 0;
		}};
		item10 = new Item("item10", Color.valueOf("b2bbc2")){{
			cost = 0.2f;
			localizedName = "item10";
			flammability = 0.35f;
			explosiveness = 0.05f;
			hardness = 0;
		}};
		item11 = new Item("item11", Color.valueOf("54555e")){{
			cost = 0.2f;
			localizedName = "item11";
			hardness = 0;
			charge = 0.05f;
		}};
	}
}
