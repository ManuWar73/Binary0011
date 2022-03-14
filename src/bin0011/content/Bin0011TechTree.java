package bin0011.content;

import arc.struct.Seq;
import mindustry.content.*;
import mindustry.content.TechTree.TechNode;
import mindustry.ctype.ContentList;
import mindustry.ctype.UnlockableContent;
import mindustry.game.Objectives.*;
import mindustry.type.ItemStack;
import bin0011.content.*;

public class Bin0011TechTree implements ContentList {
	static TechTree.TechNode context = null;

	private static void extendNode (UnlockableContent parent, Runnable children) {
		context = TechTree.all.find(t -> t.content == parent);
		children.run();
	}

	private static void node (UnlockableContent content, ItemStack[] requirements, Seq <Objective> objectives, Runnable children) {
		TechNode node = new TechNode(context, content, requirements);
		if (objectives != null) node.objectives = objectives;

		TechNode prev = context;
		context = node;
		children.run();
		context = prev;
	}

	private static void node (UnlockableContent content, ItemStack[] requirements, Seq <Objective> objectives) {
		node(content, requirements, objectives, () -> {
		});
	}

	private static void node (UnlockableContent content, Seq <Objective> objectives) {
		node(content, content.researchRequirements(), objectives, () -> {
		});
	}

	private static void node (UnlockableContent content, ItemStack[] requirements) {
		node(content, requirements, Seq.with(), () -> {
		});
	}

	private static void node (UnlockableContent content, ItemStack[] requirements, Runnable children) {
		node(content, requirements, null, children);
	}

	private static void node (UnlockableContent content, Seq <Objective> objectives, Runnable children) {
		node(content, content.researchRequirements(), objectives, children);
	}

	private static void node (UnlockableContent content, Runnable children) {
		node(content, content.researchRequirements(), children);
	}

	private static void node (UnlockableContent block) {
		node(block, () -> {
		});
	}

	private static void nodeProduce (UnlockableContent content, Seq <Objective> objectives, Runnable children) {
		node(content, content.researchRequirements(), objectives.and(new Produce(content)), children);
	}

	private static void nodeProduce (UnlockableContent content, Seq <Objective> objectives) {
		nodeProduce(content, objectives, () -> {
		});
	}

	private static void nodeProduce (UnlockableContent content, Runnable children) {
		nodeProduce(content, Seq.with(), children);
	}

	private static void nodeProduce (UnlockableContent content) {
		nodeProduce(content, Seq.with(), () -> {
		});
	}

	@Override
	public void load() {

	 	// items
		extendNode(Items.copper, () -> {
			nodeProduce(Bin0011Items.item00, () -> {

				 nodeProduce(Bin0011Items.item01, () -> {
				 	 nodeProduce(Bin0011Items.item10, () -> {
				 	 	 nodeProduce(Bin0011Items.item11);
	 	 	 	 	 });
	 	 	 	 });
	 	 	});
	 	});
		// liquid
		extendNode(Liquids.water, () -> {
			nodeProduce(Bin0011Liquids.liquid0, () -> {
				 nodeProduce(Bin0011Liquids.liquid1);
	 		});
		});
		// turret
                extendNode(Blocks.duo, () -> {
			node(Bin0011Blocks.turret0000, () -> {
				node(Bin0011Blocks.turret0001, () -> {
					node(Bin0011Blocks.turret0010, () -> {

						node(Bin0011Blocks.turret0011, () -> {
						 	node(Bin0011Blocks.turret0100, () -> {
	 	 	 	 	 	 	 	node(Bin0011Blocks.turret0101, () -> {
	 	 	 	 	 	 	 	 	node(Bin0011Blocks.turret0110, () -> {
	 	 	 	 	 	 	 	 	 	node(Bin0011Blocks.turret0111, () -> {
	 	 	 	 	 	 	 	 	 	 	node(Bin0011Blocks.turret1000, () -> {
	 	 	 	 	 	 	 	 	 	 		node(Bin0011Blocks.turret1001, () -> {
	 	 	 	 	 	  	 	 	 	 	 		node(Bin0011Blocks.turret1010);
	 	 	 	 	 	 	 	 	 	 	 	});
	 	 	 	 	 	 	 	 		 	});
	 	 	 	 	 	 		 	 	});
	 	 	 	 	 	 	 		});
	 	 	 	 	 	 	 	});
	 	 	 	 	 		});
	 	 	 	 	 	});
	 	 	 	 	});
				});
			});
		});
		// walls
		extendNode(Blocks.copperWall, () -> {
			node(Bin0011Blocks.wall00);
			node(Bin0011Blocks.wallLarge00, () -> {
				node(Bin0011Blocks.wall01);
				node(Bin0011Blocks.wallLarge01, () -> {
					node(Bin0011Blocks.wall10);
					node(Bin0011Blocks.wallLarge10);
					node(Bin0011Blocks.wallHuge10);
				});
			});
		});
		// pawer
		extendNode(Blocks.powerNode, () -> {
			node(Bin0011Blocks.node000);
			node(Bin0011Blocks.node001, () -> {
				node(Bin0011Blocks.gen0000);
				node(Bin0011Blocks.gen0001);
				node(Bin0011Blocks.burner000, () -> {
					node(Bin0011Blocks.burner001, () -> {
						node(Bin0011Blocks.panel00);
						node(Bin0011Blocks.panel01);
						node(Bin0011Blocks.battery00, () -> {
							node(Bin0011Blocks.battery01);
						});
					});
				});
			});
		});
		// crafters
		extendNode(Blocks.graphitePress, () -> {
			node(Bin0011Blocks.itemextractor);
			node(Bin0011Blocks.crafter0000, () -> {
				node(Bin0011Blocks.crafter0001);
				node(Bin0011Blocks.crafter0010, () -> {
					node(Bin0011Blocks.crafterLarge0000, () -> {
						node(Bin0011Blocks.crafterLarge0001, () -> {
							node(Bin0011Blocks.crafterLarge0010, () -> {
								node(Bin0011Blocks.crafterLarge0011);
							});
						});
					});
				});
			});
		});
		// distr
		extendNode(Blocks.conveyor, () -> {
			node(Bin0011Blocks.binaryconveyor, () -> {
				node(Bin0011Blocks.junction00);
				node(Bin0011Blocks.junction01, () -> {
					node(Bin0011Blocks.router00, () -> {
						node(Bin0011Blocks.router01, () -> {
							node(Bin0011Blocks.router10, () -> {
								node(Bin0011Blocks.bridge00);
								node(Bin0011Blocks.binaryduct, () -> {
									node(Bin0011Blocks.binaryductrouter);
								});
							});
						});
					});
				});
			});
		});
		// storage
		extendNode(Blocks.container, () -> {
			node(Bin0011Blocks.binarycontainer, () -> {
				node(Bin0011Blocks.binaryvault);
			});
		});
		// unit blocks & units.
		extendNode(Blocks.groundFactory, () -> {
			node(Bin0011UnitTypes.unit000);
			node(Bin0011Blocks.binfact, () -> {
				node(Bin0011UnitTypes.unit001);
				node(Bin0011Blocks.r1, () -> {
					node(Bin0011UnitTypes.unit010);
					node(Bin0011Blocks.r2, () -> {
						node(Bin0011UnitTypes.unit011);
						node(Bin0011Blocks.r3, () -> {
							node(Bin0011UnitTypes.unit100, () -> {
								node(Bin0011Blocks.r4);
							});
						});
					});
				});
			});
		});
	}
}
