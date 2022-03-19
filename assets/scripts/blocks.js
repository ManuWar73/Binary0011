const bt000 = extendContent(ItemTurret, "bt000", {});
bt000.spread = 4;
bt000.shots = 2;
bt000.alternate = true;
bt000.reloadTime = 13;
bt000.restitution = 0.03;
bt000.range = 15 * 8;
bt000.shootCone = 15;
bt000.ammoUseEffect = Fx.casing1;
bt000.health = 320;
bt000.inaccuracy = 2;
bt000.rotateSpeed = 10;
bt000.limitRange();
bt000.ammo(
	Items.scrap, Bullets.flakScrap
);
bt000.requirements = ItemStack.with(
	Items.scrap, 28
);
bt000.buildVisibility = BuildVisibility.shown;
bt000.category = Category.turret;

exports.bt000 = bt000;
