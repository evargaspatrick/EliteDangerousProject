package Engine1;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EliteMissions {
	
	static Random random = new Random();
	static DecimalFormat df = new DecimalFormat("#,###");
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	assasination();
	//This class contains all jobs and their aspects
	//Includes their pay ranges and their rewards, and possibly job descriptions
	}
	public static void courier() {
	String job = "Courier";
	int payout = 100000;
	String[] mssnobjs = {"Units" + "" + ""};
	System.out.println("You have chosen a" + job + "mission.");
	}
	public static void supply() {
	String job = "Supply";
	String[] mssnobjs = {};
		System.out.println("You have chosen a" + job + "mission.");
	}
	public static void assasination() {
	String job = "Assasination";
	String[] threat_lvl = {"Weak", "Low", "Easy", "Strong", "Difficult", "Hard", "Dangerous", "Deadly", "Lethal", "Impossible"};
	int guards = random.nextInt(12);
	String[] targetnames = {
		    "Warren Hodge", "Frederic Sutherland", "Laurie Combs", "Jaxson Jennings", "Joel Stephenson",
		    "Wojciech Li", "Woody Dixon", "Sienna Todd", "Glenn Burns", "Blake Trujillo",
		    "Laurence Leon", "Moshe Hogan", "Henri Olsen", "Keenan Mayo", "Jayden Joyce",
		    "Yunus Rojas", "Jamal Acosta", "Omer King", "Nicola Terrell", "Rhys Peck",
		    "Marion Waller", "Owais Hoffman", "Cain Cabrera", "Dennis White", "Ma Hu’ge Rock",
		    "Moby Huge", "Bob Swanson", "Rod Thompson", "Leepin Lerry", "Jerry De Sperry",
		    "Mowry L Towry", "Alison Banks", "Kaiden Livingston", "Bertha Levy", "Melody Stanley",
		    "Jazmin Sharpe", "Isra Hartley", "Beth Merritt", "Oakley Owens", "Gail Nicholson",
		    "Sasha Morrison", "Jaya Mosley", "Nancy Cole", "Carter Meza", "Isabel Browning",
		    "Molly Prince", "Zaynab O'Brien", "Alexandra England", "Christine Kane", "Ophelia Blanchard",
		    "Gracie Cordova", "Zarah Haas", "Addie Nielsen", "Cruz Davis", "Aneesa Ayala",
		    "Janice De Lerice", "Merry Le Carie", "Tracy Mc Grady", "Lima Jestima", "Parish Lentonknov",
		    "Margaret forthwith", "Dedra Cunningham"};
		
		int weakX = 35000;
		int lowX = 43000;
		int easyX = 50000;
		int strongX = 60000;
		int difficultX = 70000;
		int hardX = 90000;
		int dangerousX = 120000;
		int deadlyX = 150000;
		int lethalX = 200000;
		int impossibleX = 400000;
		String Threat = threat_lvl [random.nextInt(threat_lvl.length)];
		String target = targetnames [random.nextInt(targetnames.length)];
		int payout = 0;
		
		if (Threat == "Weak") {
			payout = weakX * (guards + 1);
		} else if (Threat == "Low") {
			payout = lowX * (guards + 1);
		} else if (Threat == "Easy") {
			payout = easyX * (guards + 1);
		} else if (Threat == "Strong") {
			payout = strongX * (guards + 1);
		} else if (Threat == "Difficult") {
			payout = difficultX * (guards + 1);
		} else if (Threat == "Hard") {
			payout = hardX * (guards + 1);
		} else if (Threat == "Dangerous") {
			payout = dangerousX * (guards + 1);
		} else if (Threat == "Deadly") {
			payout = deadlyX * (guards + 1);
		} else if (Threat == "Lethal") {
			payout = lethalX * (guards + 1);
		} else {
			Threat = "Impossible";
			payout = impossibleX * (guards + 1);
		}
		
		String formattedPayout = df.format(payout);
		System.out.println("You have chosen an " + job + " mission.");
		System.out.println("Your target is: " + target);
		System.out.println("Reports say " + target + " has " + guards + " guards.");
		System.out.println("They are considered threat level: " + Threat);
		System.out.println("Due to " + target + "'s" + " threat level, your compensation will be " + formattedPayout + " credits.");
		System.out.println("Do you accept?: Y/N");
	}
	
	public static void passenger() {
		String job = "Passenger";
		String[] distances = {"close", "nearby", "around the way", "far", "long ways away", "DAMN"};
		int closeX = 50000;
		int nearbyX = 75000;
		int aroundX = 100000;
		int farX = 130000;
		int longX = 170000;
		int damnX = 250000;
		int payout = 0;
		int pass_count = random.nextInt(32); 
		String distance = distances [random.nextInt(distances.length)];
		
		if (distance == "close") {
			payout = closeX * pass_count;
		} else if (distance == "nearby") {
			payout = nearbyX * pass_count;
		} else if (distance == "around the way") {
			payout = aroundX * pass_count;
		} else if (distance == "far") {
			payout = farX * pass_count;
		} else if (distance == "long ways away") {
			payout = longX * pass_count;
		} else {
			distance = "DAMN";
			payout = damnX * pass_count;
		}
		
		String formattedPayout = df.format(payout);	
		System.out.println("You have chosen a " + job + " mission.");
		System.out.println("This passenger mission will require the transportation of " + pass_count + " people");
		System.out.println("Your passenger travel distance is: " + distance);
		System.out.println("Your payout is: " + formattedPayout + " credits");
		
	}
	
	public static void massacre() {
	    String job = "Massacre";
	    int payout = 0;
	    int easy = 35000;
	    int medium = 50000;
	    int high = 65000;
	    int dangerous = 80000;
	    int deadly = 95000;
	    int trgtcount = random.nextInt(124);
	    double easyX = 0.03125;
	    double mediumX = 0.06257;
	    double highX = 0.0125;
	    double dangerousX = 0.02517;
	    double deadlyX = 0.0573;
	    
	    String missiondiff = "";
	    if (trgtcount <= 6) {
	        missiondiff = "Easy";
	    } else if (trgtcount >= 7 && trgtcount <= 32) {
	        missiondiff = "Medium";
	    } else if (trgtcount >= 33 && trgtcount <= 68) {
	        missiondiff = "High";
	    } else if (trgtcount >= 69 && trgtcount <= 92) {
	        missiondiff = "Dangerous";
	    } else {
	        missiondiff = "Deadly";
	    }
	    if (missiondiff == "Easy") {
	    	int p1 = 0;
	    	int p2 = 0;
	    	p1 = easy * trgtcount;
	    	p2 = (int) (p1 * easyX);
	    	payout = p1 + p2;
	    } else if (missiondiff == "Medium") {
	    	int p1 = 0;
	    	int p2 = 0;
	    	p1 = medium * trgtcount;
	    	p2 = (int) (p1 * mediumX);
	    	payout = p1 + p2;
	    } else if (missiondiff == "High") {
	    	int p1 = 0;
	    	int p2 = 0;
	    	p1 = high * trgtcount;
	    	p2 = (int) (p1 * highX);
	    	payout = p1 + p2;
	    } else if (missiondiff == "Dangerous") {
	    	int p1 = 0;
	    	int p2 = 0;
	    	p1 = dangerous * trgtcount;
	    	p2 = (int) (p1 * dangerousX);
	    	payout = p1 + p2;
	    } else if (missiondiff == "Deadly") {
	    	int p1 = 0;
	    	int p2 = 0;
	    	p1 = deadly * trgtcount;
	    	p2 = (int) (p1 * deadlyX);
	    	payout = p1 + p2;
	    }
	    System.out.println("You have chosen a " + job + " mission.");
	    String formattedPayout = df.format(payout);
	    System.out.println("This missions diffulty is: " + missiondiff);
		System.out.println("You have to eliminate: " + trgtcount + " targets.");
		System.out.println("This job will pay: " + formattedPayout + " credits.");
		System.out.println("Do you accept?: Y/N");
;	}
	
	public static void theft() {
	String job = "Theft";
		System.out.println("You have chosen a" + job + "mission.");
	}
	public static void recovery() {
	String job = "Recovery";
		System.out.println("You have chosen a" + job + "mission.");
	}
	public static void surfaceops() {
	String job = "Surfaceops";
		System.out.println("You have chosen a" + job + "mission.");
	}
	public static void liberation() {
	String job = "liberation";
		System.out.println("You have chosen a" + job + "mission.");
	}
}