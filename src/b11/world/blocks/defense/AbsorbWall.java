/** a wall that can absorb enemy bullets and heals itself. hybrid mender-wall. */
package b11.world.blocks.defense;
import arc.Core;import arc.graphics.*;import arc.graphics.g2d.*; import arc.math.*;
import mindustry.content.*; import mindustry.world.blocks.defense.*;import mindustry.entities.bullet.*;import mindustry.game.EventType.*;import mindustry.gen.*;import mindustry.graphics.*;import mindustry.type.*;import mindustry.ui.*;import mindustry.world.consumers.*;import mindustry.world.meta.*;
public class AbsorbWall extends Wall {
	public int health = 100;
	public AbsorbWall(String name) {
		super(name);
		solid = destructible = true;
	 	group = BlockGroup.walls;
	 	buildCostMultiplier = 3f;
	 	canOverdrive = drawDisabled = false;
	}
	@Override
	public void setStats() {
		super.setStats();	
	}
	public class AbsorbWallBuild extends WallBuild {
		int health2 = (float) health; // aneh
		int damagecounter = 0;
		public boolean damaged(){
			damagecounter += 2;
			if(damagecounter == 100){
	 	 		 health += health2;
			};
		}
	}
}
