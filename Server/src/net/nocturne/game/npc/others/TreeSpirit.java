package net.nocturne.game.npc.others;

import net.nocturne.game.Entity;
import net.nocturne.game.ForceTalk;
import net.nocturne.game.WorldTile;
import net.nocturne.game.npc.NPC;
import net.nocturne.game.player.Player;

@SuppressWarnings("serial")
public class TreeSpirit extends NPC {

	private Player target;

	public TreeSpirit(Player target, WorldTile tile) {
		super(655, tile, -1, true, true);
		this.target = target;
		target.getTemporaryAttributtes().put("HAS_SPIRIT_TREE", true);
		setTarget(target);
		setNextForceTalk(new ForceTalk(
				"You must defeat me before touching the tree!"));
	}

	@Override
	public void processNPC() {
		if (!target.withinDistance(this, 16)) {
			target.getTemporaryAttributtes().remove("HAS_SPIRIT_TREE");
			finish();
		}
		super.processNPC();
	}

	@Override
	public void sendDeath(Entity source) {
		target.getTemporaryAttributtes().remove("HAS_SPIRIT_TREE");
		target.setKilledLostCityTree(true);
		super.sendDeath(source);

	}

}
