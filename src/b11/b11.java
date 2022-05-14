package b11;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import b11.content.*;

public class b11 extends Mod{
	public b11(){
                //listen for game load event
                Events.on(ClientLoadEvent.class, e -> {
                //show dialog upon startup
                        Time.runTask(10f, () -> {
				BaseDialog dialog = new BaseDialog("Hello.");
				dialog.cont.add("Welcome to Binary0011.").row();
				dialog.cont.button("OK", dialog::hide).size(100f, 50f);
				dialog.show();
                 	});
            	});
        }
	// load mod content
	public void loadContent(){
//		B11Status.load();
//	 	B11Liquids.load();
//		B11Items.load();
		B11Bullets.load();
//		B11Units.load();
		B11Blocks.load();
//		B11Planets.load();
//		B11Tree.load();
	}
}
