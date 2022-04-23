package b11.world.blocks.defense;
/* arc */ import arc.Core;import arc.graphics.*;import arc.graphics.g2d.*; import arc.math.*;
/* mindus */ import mindustry.content.*; import mindustry.world.blocks.defense.*;import mindustry.entities.bullet.*;import mindustry.game.EventType.*;import mindustry.gen.*;import mindustry.graphics.*;import mindustry.type.*;import mindustry.ui.*;import mindustry.world.consumers.*;import mindustry.world.meta.*;
/*
a wall that ""shoots"" bullets when destroyed. a hybrid wall-turret. 
*/
public class BulletWall extends Wall {
	public BulletType bullet = Bullets.standardCopper;
	public int shots = 3;
	public BulletWall(String name) {
		super(name);
		solid = destructible = true;
	 	group = BlockGroup.walls;
	 	buildCostMultiplier = 3f;
	 	canOverdrive = drawDisabled = false;
	}

	@Override
	public void setStats() {
		super.setStats();
		stats.add(Stat.range, bullet.lifetime * bullet.speed/8, StatUnit.blocks);
	}
	public class BulletWallBuild extends WallBuild {
		@Override
		public void onDestroyed() {
		 	for(int no = 0;no <= shots * 5;no++){
				 bullet.create(this, this.team, x, y, Mathf.random(0, 4) * 90f);
				 bullet.create(this, this.team, x, y, Mathf.random(0, 4) * 90f);
			};
			super.onDestroyed();
		}
	}
}
