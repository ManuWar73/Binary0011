// bt001
// bullets
const laser1 = extend(LaserBulletType, {});
laser1.colors = new Color[]{Pal.lancerLaser.cpy().a(0.4f), Pal.lancerLaser, Color.white};
laser1.hitEffect = Fx.hitLancer;
laser1.hitSize = 4;
laser1.lifetime = 16;
laser1.drawSize = 400;
laser1.collidesAir = true;
laser1.length = 173;
laser1.ammoMultiplier = 1;
laser1.damage = 154;

const laser2 = extend(LaserBulletType, {});
laser2.colors = new Color[]{Pal.lancerLaser.cpy().a(0.4f), Pal.lancerLaser, Color.white};
laser2.hitEffect = Fx.hitLancer;
laser2.hitSize = 4;
laser2.lifetime = 16;
laser2.drawSize = 400;
laser2.collidesAir = true;
laser2.length = 173;
laser2.ammoMultiplier = 1;
laser2.damage = 154 * 2;

const bt001 = extendContent(ItemTurret, "bt001", {});
bt001.reloadTime = 60;
bt001.shootShake = 4;
bt001.range = 120;
bt001.recoilAmount = 0.1;
bt001.shots = 2;
bt001.shootCone = 30;
bt001.size = 1;
bt001.health = 280;
bt001.shootSound = Sounds.laser;
bt001.ammo(
	Items.graphite, laser1,
	Items.titanium, laser2
);
bt001.requirements = ItemStack.with(
	Items.scrap, 45,
	Items.lead, 25

);
bt001.buildVisibility = BuildVisibility.shown;
bt001.category = Category.turret;

exports.bt001 = bt001;

