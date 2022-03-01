package net.nocturne.game.npc.familiar.impl;

import net.nocturne.game.*;
import net.nocturne.game.Hit.HitLook;
import net.nocturne.game.npc.familiar.Familiar;
import net.nocturne.game.player.Player;
import net.nocturne.game.player.actions.skills.summoning.Summoning.Pouch;
import net.nocturne.game.tasks.WorldTask;
import net.nocturne.game.tasks.WorldTasksManager;
import net.nocturne.utils.Utils;

public class Talonbeast extends Familiar {

	private static final long serialVersionUID = 7695472240241943640L;

	public Talonbeast(Player owner, Pouch pouch, WorldTile tile,
			int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	@Override
	public String getSpecialName() {
		return "Deadly Claw";
	}

	@Override
	public String getSpecialDescription() {
		return "A magical attack that hits 3 times. It is similar to its normal attack, but may hit higher (80 per hit, adding up to a max of 240) and will also hit more often through metal armour.";
	}

	@Override
	public int getBOBSize() {
		return 0;
	}

	@Override
	public int getSpecialAmount() {
		return 6;
	}

	@Override
	public SpecialAttack getSpecialAttack() {
		return SpecialAttack.ENTITY;
	}

	@Override
	public boolean submitSpecial(Object object) {
		final Entity target = (Entity) object;
		getOwner().setNextGraphics(new Graphics(1316));
		getOwner().setNextAnimation(new Animation(7660));
		setNextAnimation(new Animation(5989));
		setNextGraphics(new Graphics(1519));
		World.sendProjectile(this, target, 1520, 34, 16, 30, 35, 16, 0);
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				WorldTasksManager.schedule(new WorldTask() {

					int ticks;

					@Override
					public void run() {
						if (ticks++ == 3) {
							stop();
							return;
						}
						target.applyHit(new Hit(getOwner(), Utils.random(80),
								HitLook.MAGIC_DAMAGE));
					}
				}, 0, 1);
			}
		});
		return false;
	}
}
