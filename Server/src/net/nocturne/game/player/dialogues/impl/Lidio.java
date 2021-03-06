package net.nocturne.game.player.dialogues.impl;

import net.nocturne.game.player.dialogues.Dialogue;
import net.nocturne.utils.ShopsHandler;

public class Lidio extends Dialogue {

	private int npcId = 4293;

	@Override
	public void start() {
		sendNPCDialogue(npcId, NORMAL,
				"Greetings Warrior, how can I fill your stomach today?");
	}

	@Override
	public void run(int interfaceId, int componentId, int slotId) {
		stage++;
		if (stage == 0)
			sendPlayerDialogue(NORMAL, "With food preferably.");
		else if (stage == 1) {
			end();
			ShopsHandler.openShop(player, 120);
		}
	}

	@Override
	public void finish() {

	}
}
