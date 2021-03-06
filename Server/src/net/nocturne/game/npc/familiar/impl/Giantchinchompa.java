package net.nocturne.game.npc.familiar.impl;

import java.util.List;

import net.nocturne.game.*;
import net.nocturne.game.Hit.HitLook;
import net.nocturne.game.npc.familiar.Familiar;
import net.nocturne.game.player.Player;
import net.nocturne.game.player.actions.skills.summoning.Summoning.Pouch;
import net.nocturne.utils.Utils;

public class Giantchinchompa extends Familiar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7708802901929527088L;

	public Giantchinchompa(Player owner, Pouch pouch, WorldTile tile,
			int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	@Override
	public String getSpecialName() {
		return "Explode";
	}

	@Override
	public String getSpecialDescription() {
		return "Explodes, damaging nearby enemies.";
	}

	@Override
	public int getBOBSize() {
		return 0;
	}

	@Override
	public int getSpecialAmount() {
		return 3;
	}

	@Override
	public SpecialAttack getSpecialAttack() {
		return SpecialAttack.CLICK;
	}

	@Override
	public boolean submitSpecial(Object object) {
		setNextAnimation(new Animation(7750));
		setNextGraphics(new Graphics(1310));
		setNextForceTalk(new ForceTalk("Squeek!"));
		Player player = getOwner();
		List<Integer> playerIndexes = World.getRegion(player.getRegionId())
				.getPlayerIndexes();
		if (playerIndexes != null) {
			for (int playerIndex : playerIndexes) {
				Player p2 = World.getPlayers().get(playerIndex);
				if (p2 == null || p2.isDead() || p2 != player
						|| !p2.isRunning() || !p2.withinDistance(player, 2))
					continue;
				p2.applyHit(new Hit(this, Utils.random(130),
						HitLook.MAGIC_DAMAGE));
			}
			return true;
		}
		return false;
	}
}
