/** a wall that can absorb enemy bullets and heals itself. hybrid mender-wall. */
package b11.world.blocks.defense;
import arc.Core;import arc.graphics.*;import arc.graphics.g2d.*; import arc.math.*;
import mindustry.content.*; import mindustry.world.blocks.defense.*;import mindustry.entities.bullet.*;import mindustry.game.EventType.*;import mindustry.gen.*;import mindustry.graphics.*;import mindustry.type.*;import mindustry.ui.*;import mindustry.world.consumers.*;import mindustry.world.meta.*;
public class AbsorbWall extends Wall {
	public int health = 500;
	public int heal = 1000;
	public AbsorbWall(String name) {
		super(name);
		health = 1237;
		solid = destructible = true;
	 	group = BlockGroup.walls;
	 	buildCostMultiplier = 3f;
	 	canOverdrive = drawDisabled = false;
	}
	@Override
	public void setStats() {
		super.setStats();	
	}
	@Override
	public void setBars(){
		super.setBars();
		bars.add("counter", (AbsorbWallBuild entity) -> new Bar("bar.damagecounter", Pal.lightOrange, () -> entity.damagecounter));
	}
	public class AbsorbWallBuild extends WallBuild {
		int damagecounter = 0;
		@Override
		public boolean collision(Bullet bullet){
			super.collision(bullet);
			if(damagecounter == 100){
	 	 		health += heal;
				damagecounter = 0;
				return false;
			}else{
	 	 	 	health -= bullet.damage;
				damagecounter += 2;
				return true;
			}
		 	return this.collision;
		}
	}
}
