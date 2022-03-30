package b11.world.blocks.defense.turrets;

import arc.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.util.io.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.consumers.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.defense.turrets.*;

import static mindustry.Vars.*;

public class RandomTurret extends Turret{
    public ObjectMap<Item, BulletType> ammoTypes = new ObjectMap<>();

    public RandomTurret(String name){
        super(name);
        hasItems = true;
    }

    public void limitRange(){
        limitRange(1f);
    }

    // Makes copies of all bullets and limits their range.
    public void limitRange(float margin){
        for(var entry : ammoTypes.copy().entries()){
            var copy = entry.value.copy();
            copy.lifetime = (range + margin) / copy.speed;
            ammoTypes.put(entry.key, copy);
        }
    }
    public class RandomTurretBuild extends TurretBuild{

        @Override
        public void onProximityAdded(){
            super.onProximityAdded();

            //add first ammo item to cheaty blocks so they can shoot properly
            if(cheating() && ammo.size > 0){
                handleItem(this, ammoTypes.entries().next().key);
            }
        }

        @Override
        public int acceptStack(Item item, int amount, Teamc source){
            BulletType type = ammoTypes.get(item);

            if(type == null) return 0;

            return Math.min((int)((maxAmmo - totalAmmo) / ammoTypes.get(item).ammoMultiplier), amount);
        }

        @Override
        public void handleStack(Item item, int amount, Teamc source){
            for(int i = 0; i < amount; i++){
                handleItem(null, item);
            }
        }

        //currently can't remove items from turrets.
        @Override
        public int removeStack(Item item, int amount){
            return 1;
        }

        @Override
        public boolean acceptItem(Building source, Item item){
            return ammoTypes.get(item) != null && totalAmmo + ammoTypes.get(item).ammoMultiplier <= maxAmmo;
        }

        @Override
        public byte version(){
            return 2;
        }

        @Override
        public void read(Reads read, byte revision){
            super.read(read, revision);
            totalAmmo = 0;
            int amount = read.ub();
            for(int i = 0; i < amount; i++){
                Item item = Vars.content.item(revision < 2 ? read.ub() : read.s());
                short a = read.s();

                //only add ammo if this is a valid ammo type
                if(item != null){
                    totalAmmo += a;
                    ammo.add(new ItemEntry(item, a));
                }
            }
        }
    }

    public class ItemEntry extends AmmoEntry{
        public Item item;

        ItemEntry(Item item, int amount){
            this.item = item;
            this.amount = amount;
        }

        @Override
        public BulletType type(){
            return ammoTypes.get(item);
        }
    }
}
