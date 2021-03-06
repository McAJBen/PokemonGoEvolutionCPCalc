

public class Variables {

	private static final double[] CPM = {
		0.0940000,	0.1351374,	0.1663979,	0.1926509,	0.2157325,
		0.2365727,	0.2557201,	0.2735304,	0.2902499,	0.3060574,
		0.3210876,	0.3354450,	0.3492127,	0.3624578,	0.3752356,
		0.3875924,	0.3995673,	0.4111936,	0.4225000,	0.4335117,
		0.4431076,	0.4530600,	0.4627984,	0.4723361,	0.4816850,
		0.4908558,	0.4998584,	0.5087018,	0.5173940,	0.5259425,
		0.5343543,	0.5426358,	0.5507927,	0.5588306,	0.5667545,
		0.5745692,	0.5822789,	0.5898879,	0.5974000,	0.6048188,
		0.6121573,	0.6194041,	0.6265671,	0.6336492,	0.6406530,
		0.6475810,	0.6544356,	0.6612193,	0.6679340,	0.6745819,
		0.6811649,	0.6876849,	0.6941437,	0.7005429,	0.7068842,
		0.7131691,	0.7193991,	0.7255756,	0.7317000,	0.7377735,
		0.7377695,	0.7407856,	0.7437894,	0.7467812,	0.7497610,
		0.7527291,	0.7556855,	0.7586304,	0.7615638,	0.7644861,
		0.7673972,	0.7702973,	0.7731865,	0.7760650,	0.7789328,
		0.7817901,	0.7846370,	0.7874736,	0.7903000,	0.7931164
	};
	
	private static final byte[][] dexPairs = {
		{1,2},		{2,3},		{4,5},		{5,6},		{7,8},
		{8,9},		{10,11},	{11,12},	{13,14},	{14,15},
		{16,17},	{17,18},	{19,20},	{21,22},	{23,24},
		{25,26},	{27,28},	{29,30},	{30,31},	{32,33},
		{33,34},	{35,36},	{37,38},	{39,40},	{41,42},
		{43,44},	{44,45},	{46,47},	{48,49},	{50,51},
		{52,53},	{54,55},	{56,57},	{58,59},	{60,61},
		{61,62},	{63,64},	{64,65},	{66,67},	{67,68},
		{69,70},	{70,71},	{72,73},	{74,75},	{75,76},
		{77,78},	{79,80},	{81,82},	{83,84},	{85,86},
		{87,88},	{89,90},	{91,92},	{92,93},	{94,95},
		{96,97},	{98,99},	{100,101},	{102,103},	{104,105},
		{106,107},	{108,109},	{110,111},	{112,113},	{114,115},
		{116,117},	{116,118},	{116,119},	{120,121},	{122,123},
		{124,125},	{125,126}
	};
	
	private static final short[][] baseiv = {
		{90, 126, 126},		{120, 156, 158},	{160, 198, 200},	{78, 128, 108},		{116, 160, 140},
		{156, 212, 182},	{88, 112, 142},		{118, 144, 176},	{158, 186, 222},	{90, 62, 66},
		{100, 56, 86},		{120, 144, 144},	{80, 68, 64},		{90, 62, 82},		{130, 144, 130},
		{80, 94, 90},		{126, 126, 122},	{166, 170, 166},	{60, 92, 86},		{110, 146, 150},
		{80, 102, 78},		{130, 168, 146},	{70, 112, 112},		{120, 166, 166},	{70, 124, 108},
		{120, 200, 154},	{100, 90, 114},		{150, 150, 172},	{110, 100, 104},	{140, 132, 136},
		{180, 184, 190},	{92, 110, 94},		{122, 142, 128},	{162, 204, 170},	{140, 116, 124},
		{190, 178, 178},	{76, 106, 118},		{146, 176, 194},	{230, 98, 54},		{280, 168, 108},
		{80, 88, 90},		{150, 164, 164},	{90, 134, 130},		{120, 162, 158},	{150, 202, 190},
		{70, 122, 120},		{120, 162, 170},	{120, 108, 118},	{140, 172, 154},	{20, 108, 86},
		{70, 148, 140},		{80, 104, 94},		{130, 156, 146},	{100, 132, 112},	{160, 194, 176},
		{80, 122, 96},		{130, 178, 150},	{110, 156, 110},	{180, 230, 180},	{80, 108, 98},
		{130, 132, 132},	{180, 180, 202},	{50, 110, 76},		{80, 150, 112},		{110, 186, 152},
		{140, 118, 96},		{160, 154, 144},	{180, 198, 180},	{100, 158, 78},		{130, 190, 110},
		{160, 222, 152},	{80, 106, 136},		{160, 170, 196},	{80, 106, 118},		{110, 142, 156},
		{160, 176, 198},	{100, 168, 138},	{130, 200, 170},	{180, 110, 110},	{190, 184, 198},
		{50, 128, 138},		{100, 186, 180},	{70, 126, 96},		{120, 182, 150},	{130, 104, 138},
		{180, 156, 192},	{160, 124, 110},	{210, 180, 188},	{60, 120, 112},		{100, 196, 196},
		{60, 136, 82},		{90, 172, 118},		{120, 204, 156},	{120, 104, 140},	{170, 162, 196},
		{60, 116, 110},		{110, 178, 168},	{80, 102, 124},		{120, 150, 174},	{120, 110, 132},
		{190, 232, 164},	{100, 102, 150},	{120, 140, 202},	{80, 136, 142},		{130, 190, 198},
		{160, 110, 116},	{210, 166, 160},	{60, 122, 100},		{110, 176, 150},	{90, 112, 126},
		{160, 172, 160},	{60, 130, 128},		{120, 194, 192},	{40, 42, 84},		{190, 192, 196},
		{110, 114, 128},	{260, 186, 168},	{130, 192, 174},	{130, 238, 178},	{70, 132, 160},
		{140, 180, 202},	{60, 148, 142},		{120, 190, 190},	{82, 128, 110},		{122, 170, 152},
		{182, 250, 212},	{212, 284, 202},	{200, 220, 220}
	};
	
	public static final String[] pokemonNames = {
		"Bulbasaur",		"Ivysaur",			"Charmander",		"Charmeleon",	"Squirtle",
		"Wartortle",		"Caterpie",			"Metapod",			"Weedle",		"Kakuna",
		"Pidgey",			"Pidgeotto",		"Rattata",			"Spearow",		"Ekans",
		"Pikachu",			"Sandshrew",		"Nidoran F",		"Nidorina",		"Nidoran M",
		"Nidorino",			"Clefairy",			"Vulpix",			"Jigglypuff",	"Zubat",
		"Oddish",			"Gloom",			"Paras",			"Venonat",		"Diglett",
		"Meowth",			"Psyduck",			"Mankey",			"Growlithe",	"Poliwag",
		"Poliwhirl",		"Abra",				"Kadabra",			"Machop",		"Machoke",
		"Bellsprout",		"Weepinbell",		"Tentacool",		"Geodude",		"Graveler",
		"Ponyta",			"Slowpoke",			"Magnemite",		"Doduo",		"Seel",
		"Grimer",			"Shellder",			"Gastly",			"Haunter",		"Drowzee",
		"Krabby",			"Voltorb",			"Exeggcute",		"Cubone",		"Koffing",
		"Rhyhorn",			"Horsea",			"Goldeen",			"Staryu",		"Magikarp",
		"Eevee(Vaporeon)",	"Eevee(Jolteon)",	"Eevee(Flareon)",	"Omanyte",		"Kabuto",
		"Dratini",			"Dragonair"
	};
	
	private static final short[] stardustAmounts = {
		200,	400,	600,	800,	1000,
		1300,	1600,	1900,	2200,	2500,
		3000,	3500,	4000,	4500,	5000,
		6000,	7000,	8000,	9000,	10000
	};
	
	public static int[] getDexPair(int i) {
		return new int[] {dexPairs[i][0], dexPairs[i][1]};
	}
	
	public static double getCPM(int j) {
		return CPM[j - 1];
	}
	
	public static int[] getBaseIV(int dex) {
		return new int[] {baseiv[dex - 1][0], baseiv[dex - 1][1], baseiv[dex - 1][2]};
	}

	public static int getLevel(String text) {
		int dustAmount = Integer.parseInt(text);
		
		for (int i = 0; i < stardustAmounts.length; i++) {
			if (dustAmount == stardustAmounts[i]) {
				return i * 4;
			}
		}
		return 80;
	}
}