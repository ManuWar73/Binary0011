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
                Log.info("Loaded Binary0011 constructor.");

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
	@Override
	public void loadContent(){

//		new B11Status().load();
//	 	new B11Liquids().load();
		new B11Items().load();
		new B11Bullets().load();
//		new B11Units().load();
		new B11Blocks().load();
//		new B11Planets().load();
//		new B11TechTree().load();
	}
}
