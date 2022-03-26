package b11.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.*;

public class B11Items implements ContentList{
	public static Item 
	item00, item01, item10, item11;
	@Override
	public void load(){
		item00 = new Item("item00"){{
			cost = 0.1f;
			hardness = 0;
		}};
		item01 = item00;
	}
}
