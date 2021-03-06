package net.nocturne;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import net.nocturne.game.WorldTile;
import net.nocturne.game.player.Player;
import net.nocturne.login.WorldInformation;

public final class Settings {

	private static boolean hostName() {
		try {
			switch (InetAddress.getLocalHost().getHostName()) {
			case "nocturne":
				return true;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static int WORLD_ID = 1;
	public static boolean DEBUG = hostName() ? false : true;
	public static boolean HOSTED = hostName() ? true : false;

	public static final String VPS1_IP = HOSTED ? "127.0.0.1"
			: "127.0.0.1";

	public static final String UPDATE_TOPIC_TITLE = "";
	public static final String UPDATE_TOPIC_ID = "";
	public static final String SERVER_NAME = "OpenRS3";
	public static final String MAIN_FC = "OpenRS3";
	public static final String CACHE_PATH = "./data/cache/";
	public static final String LOGIN_DATA_PATH = "data/accounts_data";
	@SuppressWarnings("serial")
	public static final ArrayList<String> SERVER_OWNERS = new ArrayList<String>() {
		{
			add("summer");
			add("");
		}
	};
	@SuppressWarnings("serial")
	public static final ArrayList<String> SERVER_DEVELOPERS = new ArrayList<String>() {
		{
			add("");
			add("");
		}
	};
	@SuppressWarnings("serial")
	public static final ArrayList<String> SERVER_ADMINISTRATORS = new ArrayList<String>() {
		{
			add("");
			add("");
			add("");
		}
	};
	@SuppressWarnings("serial")
	public static final ArrayList<String> SERVER_MODERATORS = new ArrayList<String>() {
		{
			add("");
			add("");
			add("");
			add("");
			add("");
		}
	};

	public static final int XP_RATE = 1;
	// Can change this later <3 
	public static boolean DOUBLE_XP = false;
	public static boolean DOUBLE_VOTES = false;
	private static final String MASTER_IP = "127.0.0.1";
	public static final WorldTile HOME_LOCATION = new WorldTile(3225, 3219, 0);
	public static final WorldTile STARTER_LOCATION = new WorldTile(3225, 3219, 0);
	public final static int GAME_UPDATES = 1, WEBSITE = 2, SUPPORT = 3,
			TECHNICAL = 4, COMMUNITY = 5, BEHIND_THE_SCENES = 6, SHOP = 9,
			FUTURE_UPDATES = 12, SOLOMANS_STORE = 13, TREASURE_HUNTER = 14,
			YOUR_FEEDBACK = 15, EVENTS = 16;

	public static final boolean SQL = false;
	public static final boolean HTTP = false;
	public static final boolean DAILY_BACKUP = false;

	public static final int STARTER_GUIDE = 0;
	public static final String WEBSITE_LINK = "";
	public static final String FORUMS_LINK = "";
	public static final String BUG_LINK = "";
	public static final String DISCORD_LINK = "";
	public static final String HIGHSCORES_LINK = "";
	public static final String VOTE_LINK = "";
	public static final String STORE_LINK = "";
	public static final String RULES_LINK = "";
	public static final String REGISTER_LINK = "";
	public static final String VOTE_HELP = "";
	public static final String[] RARE_DROPS = { "pernix", "torva", "virtus",
			"abyssal", "dark bow", "bandos", "steadfast", "glaiven",
			"ragefire", "spirit shield", "dragon claw", "berserker ring",
			"warrior ring", "archers' ring", "seers' ring", "hilt",
			"saradomin", "armadyl", "subjugation", "drygore",
			"draconic visage", "ascension", "tetsu", "death lotus",
			"seasinger's", "spider leg", "araxxi", "araxyte egg",
			"dragon pickaxe", "partyhat", "party hat", "cracker",
			"dragon hatchet", "sigil", "wand of treachery", "abyssal whip",
			"whip vine", "spirit shield", "seismic", "crest", "anima",
			"dragon rider", "shadow glaive", "cywir elders", "nymora",
			"avaryss", "zamorakian spear", "zaryte", "celestial handwrap",
			"razorback gauntlet", "blood necklace", "tetsu", "singer",
			"death lotus" };

	public static final String[] ANNOUNCEMENT_TEXTS = new String[] {

			" A Random Welcome message that can be added later" };

	public static final int MAJOR_VERSION = 876;
	public static final int MINOR_VERSION = 1;
	public static final int PACKET_SIZE_LIMIT = 15000;
	public static final int READ_BUFFER_SIZE = 200 * 1024; // 200kb
	public static final int WRITE_BUFFER_SIZE = 200 * 1024; // 200kb
	public static final int WORLD_CYCLE_TIME = 600; // the speed of world in ms
	public static final int[] MAP_SIZES = { 104, 120, 136, 168, 72 };
	public static final int PLAYERS_LIMIT = 2000;
	public static final int NPCS_LIMIT = Short.MAX_VALUE;
	public static final int LOCAL_NPCS_LIMIT = 400;
	static final int MIN_FREE_MEM_ALLOWED = 30000000; // 30mb
	public static final long LOGIN_SERVER_RETRY_DELAY = 1000;
	public static final long LOGIN_SERVER_FILE_TIMEOUT = 2000;
	public static final long LOGIN_SERVER_REQUEST_TIMEOUT = 3000;
	public static final long LOGIN_AUTOSAVE_INTERVAL = 500 * 60; // Default 1000
																	// * 60;
	public static final long LOGIN_BLOCKER_RESET_TIME = 1000 * 60 * 5;
	public static final int LOGIN_BLOCKER_MINIMUM_COUNT = 5;
	public static final long LOGIN_OFFENCES_CHECK_INTERVAL = 1000 * 60 * 30;
	public static final long LOGIN_FRIEND_CHATS_CHECK_INTERVAL = 1000 * 60;
	public static final String GRAB_SERVER_TOKEN = "fngDR7vSeguoCXAGiQM*DFVGv6SrfUbb";

	public static final String WORLD_SERVER_TOKEN = "3F110CFC079B70003DDFA581F69AF06E8D34A1418C593CC61BBE7C986041C46BC75A1074E9BCBCC0C15E5034192981D2";

	public static final String CLIENT_SETTINGS = "Ymi9Liy-EKAQPDzvIFDOawIZao205SgIjSoemJvZ5wo";

	public static final int CLIENT_LOGIN_ID = 1241012674;

	public static final int[] GRAB_SERVER_KEYS = { 3269, 69795, 41651, 35866,
			358716, 44375, 18239, 22668, 209410, 1155815, 463294, 597315,
			932750, 1247062, 37288, 920969, 1856, 21550, 1244, 76028, 2242,
			119, 1435171, 4510117, 9084, 23487 };

	public static final BigInteger GRAB_SERVER_PRIVATE_EXPONENT = new BigInteger(
			"37952323194930410014007478577313595429535985925786579609940606712850553335094656773153776498007258071864762773257091910728408524263381649029478057988929");
	public static final BigInteger GRAB_SERVER_MODULUS = new BigInteger(
			"7871143687424538864202557352915826277422468068412262873090751715633185803551126047872098304035825036280420995543699421150200902637147867439970995255532811");

	public static final BigInteger MODULUS = GRAB_SERVER_MODULUS;
	public static final BigInteger PRIVATE_EXPONENT = GRAB_SERVER_PRIVATE_EXPONENT;

	public static InetSocketAddress LOGIN_SERVER_ADDRESS_BASE;
	public static InetSocketAddress LOGIN_CLIENT_ADDRESS_BASE;
	public static WorldInformation[] WORLDS_INFORMATION;
	public static final InetSocketAddress GAME_ADDRESS_BASE = new InetSocketAddress(
			Settings.HOSTED ? "127.0.0.1" : "127.0.0.1", 43593);

	public static boolean underDevelopment(Player player) {
		if (!Settings.DEBUG) {
			player.getDialogueManager().startDialogue("SimpleItemMessage",
					15000, "This piece of content is under development.");
			return true;
		}
		return false;
	}

	static void init() {
		LOGIN_SERVER_ADDRESS_BASE = new InetSocketAddress(
				HOSTED ? "127.0.0.1" : "127.0.0.1", 7777);
		LOGIN_CLIENT_ADDRESS_BASE = new InetSocketAddress(
				HOSTED ? "127.0.0.1" : "127.0.0.1", 7778);
		
			WORLDS_INFORMATION = new WorldInformation[] {
					new WorldInformation(1, 0, "World1", 0, 0x2 | 0x8, "Nocturne :D", "127.0.0.1", 100),
					new WorldInformation(2, 0, "World2", 0, 0x2 | 0x8, "Nocturne :P", VPS1_IP, 100),};
	}

	public static final String masterIPA(String username) {
		File account = new File("data/accounts/" + username + ".acc");
		if (!account.exists())
			return ".";
		return MASTER_IP;
	}

	public static double getLampXpRate() {
		return 10;
	}

	public static String getDropboxLocation() {
		String host = "null";
		try {
			host = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return host.equalsIgnoreCase("Miles") ? "D:/Dropbox/" : System
				.getProperty("user.home") + "/Dropbox/";
	}

}
