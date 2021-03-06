package net.nocturne.game.npc.familiar.impl;

import net.nocturne.game.Animation;
import net.nocturne.game.Graphics;
import net.nocturne.game.WorldTile;
import net.nocturne.game.npc.familiar.Familiar;
import net.nocturne.game.player.Player;
import net.nocturne.game.player.Skills;
import net.nocturne.game.player.actions.skills.summoning.Summoning.Pouch;

public class Obsidiangolem extends Familiar {

	private static final long serialVersionUID = 1070333785198314033L;

	public Obsidiangolem(Player owner, Pouch pouch, WorldTile tile,
			int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea); // TODO
		// invisible
		// mining
		// boost
	}

	@Override
	public String getSpecialName() {
		return "Volcanic Strength";
	}

	@Override
	public String getSpecialDescription() {
		return "Gives +9 strength levels to the player.";
	}

	@Override
	public int getBOBSize() {
		return 0;
	}

	@Override
	public int getSpecialAmount() {
		return 12;
	}

	@Override
	public SpecialAttack getSpecialAttack() {
		return SpecialAttack.CLICK;
	}

	@Override
	public boolean submitSpecial(Object object) {
		Player player = (Player) object;
		player.getSkills().set(Skills.STRENGTH,
				player.getSkills().getLevel(Skills.STRENGTH) + 9);
		player.setNextAnimation(new Animation(7660));
		player.setNextGraphics(new Graphics(1300));
		setNextGraphics(new Graphics(1465));
		setNextAnimation(new Animation(8053));
		return true;
	}
}
