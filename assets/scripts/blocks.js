const bt0000 = extend(ItemTurret, "bt0000", {
	size: 1,
	category: turret,
	health: 200,
	reloadTime: 60,
	spread: 4,
	ammo: (Items.copper, Bullets.standardCopper, Items.graphite, Bullets.standardDense, Items.pyratite, Bullets.standardIncendiary, Items.silicon, Bullets.standardHoming),
	range: 192,
	recoilAmount: 0.3,
	shootCone: 15,
	rotateSpeed: 10
});
