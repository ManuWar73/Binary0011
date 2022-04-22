package b11.world.blocks.defense;
/* arc */ import arc.Core;import arc.graphics.*;import arc.graphics.g2d.*;
/* mindus */ import mindustry.gen.*;import mindustry.content.*;import mindustry.graphics.*;import mindustry.entities.*;import mindustry.world.blocks.defense.*;import mindustry.world.meta.*;
/** a wall that ""shoots"" bullets when destroyed. in short, it's a hybrid wall-turret. */
public class BulletWall extends Wall {
	public BulletType bullet = Bullets.standardCopper;
	public float range = 240f;
	public BulletWall(String name) {
		super(name);
	}

	@Override
	public void setStats() {
		super.setStats();
		stats.add(Stat.bullet, bullet.damage);
		stats.add(Stat.range, range/8, StatUnit.blocks);
	}
	public class BulletWallBuild extends WallBuild {
		@Override
		public void onDestroyed() {
			bullet.create(this, this.team, x, y, Mathf.random(0, 4) * 90f);
			Thread.sleep(500);
			bullet.create(this, this.team, x, y, Mathf.random(0, 4) * 90f);
			super.onDestroyed();
		}
	}
}
