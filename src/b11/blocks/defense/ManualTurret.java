package b11.blocks.defense;

import arc.audio.*;
import arc.math.Mathf;
import arc.util.Time;
import b11.content.B11Bullets;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Sounds;
import mindustry.graphics.Drawf;
import mindustry.graphics.Pal;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatUnit;

public class ManualTurret extends GenericCrafter {
	/** 
	 *
	 * basically a manual crafter but instead of outputting items, this block creates bullets instead.
	 * and yes, this class extends the GenericCrafter class because i want to inherit/use all the
	 * methods/fields from that class.
	 * this class also uses some code from uujuju1's scatter silo.
	 * @author 1237
	 *
	 */
        public ManualTurret(String name) {
                super(name);
                itemCapacity = 10;
        }

        public int shots = 8;
        public BulletType bullet1, bullet2 = B11Bullets.e;
        public int reload = 30;
        public Sound shootSound = Sounds.wind3;

        public void setStats(){
                super.setStats();
                stats.add(Stat.reload, reload / 60, StatUnit.seconds);
                stats.add(Stat.damage, (bullet1.damage + bullet2.damage) * shots);
        }

        public class EBuild extends GenericCrafterBuild {
                boolean shoot = false;
                public void craft(){
                        consume();
                        for (int i = 0; i < shots; i++) {
                                Drawf.square(x, y, 8, this.rotation, Pal.placing);
                                bullet1.create(this, x, y, i * (int) (360 / shots));
                                i++;
                                bullet2.create(this, x, y, i * (int) (360 / shots));
                                shootSound.at(x,y,1);
                        }
                }
                int cooldown = 0;
                public void tapped(){
                        if(shoot == true && cooldown <= 0){
                                craft();
                                cooldown = reload;
                        }
                }

                public void updateTile(){
                        if(efficiency > 0){
                                progress += getProgressIncrease(reload);
                                warmup = Mathf.approachDelta(warmup, warmupTarget(), warmupSpeed);

                                if(outputLiquids != null){
                                        float inc = getProgressIncrease(1f);
                                        for(var output : outputLiquids){
                                                handleLiquid(this, output.liquid, Math.min(output.amount * inc, liquidCapacity - liquids.get(output.liquid)));
                                        }
                                }

                                if(wasVisible && Mathf.chanceDelta(updateEffectChance)){
                                        updateEffect.at(x + Mathf.range(size * 4f), y + Mathf.range(size * 4));
                                }
                        }else{
                                warmup = Mathf.approachDelta(warmup, 0f, warmupSpeed);
                        }

                        totalProgress += warmup * Time.delta;

                        if(progress >= 1f){
                                shoot = true;
                        } else {
                                shoot = false;
                        }

                        if(cooldown >= 0){
                                cooldown -= Time.delta;
                        }
                }
        }
}
