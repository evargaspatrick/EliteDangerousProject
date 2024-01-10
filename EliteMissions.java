package Engine1;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EliteMissions {
	
	static Random random = new Random();
	static DecimalFormat df = new DecimalFormat("#,###"); // Allows for the proper comma placement for higher numbers
	
	public static void main(String[] args) {
	recovery();
	//This class contains all jobs and their aspects
	//Includes their pay ranges and their rewards, and possibly job descriptions
	}
	
	static Scanner scanner = new Scanner(System.in);
	public static void courier() {
		
	int payout1 = 30000;
	int payout2 = 50000;
	int payout3 = 70000;
	int payout4 = 120000;
	
	String[] courierItems1 = {"Envelopes", "Documents", "Parcels", "Packages", "Letters",
			"Legal Papers", "Medical Supplies", "Prescription Medication", "Laboratory Samples",
			"Electronics"};
	String[] courierItems2 = {"Clothing and Apparel", "Books and Magazines", "Personal Care Products",
		    "Cosmetics", "Jewelry", "Artwork", "Musical Instruments", "Flowers and Gifts",
		    "Food and Beverages", "Pet Supplies", "Cash and Valuables", "Pharmaceuticals"};
    String[] courierItems3 = {"Hazardous Materials", "Firearms and Ammunition", "Illegal Drugs", "Stolen Goods",
    		"Counterfeit Merchandise", "Confidential Documents", "Classified Information", "Precious Metals", "Antiques"};
    String[] courierItems4 = {"Rare Collectibles", "Explosives", "Fake IDs and Passports", "Pirated Media",
		    "Endangered Species", "Unmarked Packages", "Suspicious Packages", "Radioactive Materials",
		    "Biological Samples"};
    	int itemquant = random.nextInt(1,12);
        int randomArrayIndex = random.nextInt(4); 
        
        String[] selectedArray = null;
        int pay;
        switch (randomArrayIndex) {
            case 0:
                selectedArray = courierItems1;
                pay = payout1 * itemquant;
                break;
            case 1:
                selectedArray = courierItems2;
                pay = payout2 * itemquant;
                break;
            case 2:
                selectedArray = courierItems3;
                pay = payout3 * itemquant;
                break;
            case 3:
                selectedArray = courierItems4;
                pay = payout4 * itemquant;
                break;
            default:
                selectedArray = courierItems1; // Defaults back to courierItems1
                pay = payout1 * itemquant;
                break;
        }
    
    String formattedPayout = df.format(pay);
	String jobitem = (selectedArray[random.nextInt(selectedArray.length)]);
	
	System.out.println("You have chosen a courier mission.");
	System.out.println("This run will require you to move " + itemquant + " units of" + " " + jobitem);
	System.out.println("For your professionalism you will be compensated " + formattedPayout);
	System.out.println("Would you like to accept this mission?");
	System.out.print("Y or N: ");
	String answer = scanner.nextLine();
	
	if (answer.equalsIgnoreCase("y")) {
		System.out.println("This job has been accepted.");
		System.out.println("Credits will be paid once the delivery is finished.");
		System.out.println("Good luck!");
	} else {
		System.out.println("This job has been axed.");
	}
	}
	
	public static void supply() {
	String[] supplyObj = {"Fruits & Vegetables","Spices and Herbs", "Fresh Meat", "Seafood", "Dairy Products", "Baked Goods", "Snacks", "Beverages", 
			"Canned Goods", "Frozen Foods", "Household essentials", "Kitchenware", "Utensils", "Cookware", "Small Applications", "Clothing and Apparel", 
			"Footwear", "Handicrafts", "Jewelry", "Flowers and plants", "Electronics", "Office Supplies", "POWs", "Slaves", "Prisoners", "Suspicious goods",
			 "Illicit Goods", "Safety Equipment", "Air Compressors", "Protective Clothing"};
	
	int quantity = random.nextInt(10,100); // Quantity of the items
	int price = random.nextInt(20000,180000); // The possible price of the items
	int payment = price * quantity; // The calculation for the total sum of the supply run
	
	String formattedPayout = df.format(payment);
	String supplyobjct = supplyObj [random.nextInt(supplyObj.length)]; // Randomly selects objects to serve as the job item.
	System.out.println("You have chosen a supply mission.");
	System.out.println("This will require you to move " + quantity + " crates of " + supplyobjct + ".");
	System.out.println("Your payment is based on current market trends, this job is worth: " + formattedPayout + " credits.");
	
	if (payment >= 3000000) {
		System.out.println("Wow " + supplyobjct + " is boomin right now!");
	}
	
	System.out.println("Do you want to take on this supply run?");
	System.out.print("Y or N: ");
	String answer = scanner.nextLine();
	
	if (answer.equalsIgnoreCase("Y")) {
		System.out.println("This mission has been accepted");
		System.out.println("Payment will be received upon delivery completetion and arrival.");
	} else {
		System.out.print("This mission has been rejected.");
	}
	
	if (payment <= 3000000) {
		System.out.println("Wow " + supplyobjct + " is boomin right now");
	}
	}
	
	public static void assassination() {
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
		
		// Difficulty pay multipliers
	
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
		System.out.println("Do you accept?");
		System.out.print("Y or N: ");
		String answers = scanner.nextLine();
		
		if (answers.equalsIgnoreCase("Y")) {
			System.out.println("This job has been accepted.");
			System.out.println("Payment will be received upon mission completion, good hunting cmdr.");
		} else {
			System.out.println("This job has been rejected");
			System.out.println("Too much blood for your hands?");
		}
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
		int pass_count = random.nextInt(1,32); 
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
		System.out.println("Do you accept this mission?");
		System.out.print("Y or N: ");
		String answers = scanner.nextLine();
		System.out.println("The safe arrival of all passengers will determine your total compensation cmdr, safe travels. o7");
		
		if (answers.equalsIgnoreCase("Y")) {
			System.out.println();
		} else {
			System.out.println("This job has been rejected");
		}
		
		
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
		System.out.println("Do you accept?");
		System.out.print("Y or N: ");
		String answer = scanner.nextLine();
		
		if (answer.equalsIgnoreCase("Y")) {
			System.out.println("This job has been accepted.");
			System.out.println("They'll be ready cmdr. Good luck. o7");
		} else {
			System.out.println("This job has been rejected.");
			System.out.println("Too much blood for your hands?");
		}
	}
	
	public static void theft() {
	String[] lowtier = {"Cybernetic Implants" ,"Data chips", "Low-grade energy weapons", "VR headsets", "Augmented Reality lenses", 
			"Holographic Jewelry", "Portable Energy Cells", "Designer Tech cloths", "Genetic Modification Serums", "Antique Tech Relics"};
			
	String[] midtier = {"Advanced Cyber Limbs and Organs", "Corpo Data servers", "Neural interface devices", 
			"Quantum Encryption Keys", "Rare Alient Artifacts", "Stolen startship components"};
	
	String[] hightier = {"Orbital Defense System blueprints","Military-grade starship prototypes","Quantum Teleportation technology",
			"Black market wormhole coordinates","Experimental AI Cores","Genetic engineering research data","Planetary terraforming devices"
			,"Quantum Entanglement Communicators","Stolen Alien spacecraft","Time Manipulation devices"};
	
	String[] legendtier = {"Glactic Government documents","Ancient Alient artifacts of Immense Powers","Interstellar Peace Treaty Documents",
			"Quantum Singularity Containment Technology","Infinite energy resouce prototypes","Reality-altering nanotech",
			"Universal Consciousness interface","Multiverse Travel Technology","Celestial map of wormhole network",
			"The original Starship Enterprise",}; 
	
	int itemquant = random.nextInt(1,14);
	int randomArrayIndex = random.nextInt(4);
	String[] selectedArray = null;
	double pay = 0;
	double p1 = 0;
	double p2 = 0;
	int lowX = 80000;
	int midX = 135000;
	int highX = 160000;
	int legendX = 225000;
	
	double lowM = 0.06257;
	double midM = 0.0125;
	double highM = 0.02517;
	double legendM = 0.0573;
	
	switch (randomArrayIndex) {
		case 0:
			selectedArray = lowtier;
			p1 = lowX * lowM;
			p2 = lowX * itemquant;
			pay = p1 + p2;
			break;
		case 1:
			selectedArray = midtier;
			p1 = midX * midM;
			p2 = midX * itemquant;
			pay = p1 + p2;
			break;
		case 2:
			selectedArray = hightier;
			p1 = highX * highM;
			p2 = highX * itemquant;
			pay = p1 + p2;
			break;
		case 3:
			selectedArray = legendtier;
			p1 = legendX * legendM;
			p2 = legendX * itemquant;
			pay = p1 + p2;
			break;
		case 4:
			break;
	}
	String jobitem = (selectedArray[random.nextInt(selectedArray.length)]);
	String formattedPayout = df.format(pay);
	System.out.println("You have chosen a theft job.");
	System.out.println("You think you have swift hands?");
	System.out.println("This job will require you to take " + itemquant + " " + jobitem);
	System.out.println("If you succeed, you'll be paid " + formattedPayout + " credits.");
	System.out.println("You got what it takes?");
	System.out.print("Y or N: ");
	String answer = scanner.nextLine();
	
	if (answer.equalsIgnoreCase("y")) {
		System.out.println("A fixer has accpeted the contract.");
		System.out.println("You'll get paid once the job is finished.");
		System.out.println("Good luck. You'll need it.");
	} else {
		System.out.println("Contracts been rejected.");
		System.out.println("What? Couldn't cut it?");
	}
	
	
	
	}
	public static void recovery() {
		
	int item1X = 75000;
	int item2X = 100000;
	int item3X = 140000;
	int item4X = 195000;
	
	double item1M = 0.40;
	double item2M = 0.65;
	double item3M = 0.85;
	double item4M = 1.25;
	
	String[] recovitem1 = {"Classified documents","Stolen weapons","Encryption keys","Stolen art",
			"Surveillance equipment","Explosives","Stolen jewelry","Chemical agents",
		    "Stolen assets"};
	String[] recovitem2 = {"High-profile prisoners","Stolen sensitive technology",
		    "Counterfeit currency","Stolen government property","Kidnapped individuals",
		    "Stolen sensitive data","Illegal drugs","Missing persons","Stolen military equipment"};
		    
	String[] recovitem3 = {"Illegal firearms","Missing evidence","Stolen sensitive information",
		    "Illegal contraband","Missing diplomatic documents","Stolen prototypes","Illegal immigrants",
		    "Missing intelligence files","Stolen research data"};
		    
	String[] recovitem4 = {"Illegal wildlife products","Missing historical artifacts","Stolen confidential files",
		    "Illegal technology","Missing sensitive equipment","Stolen government secrets",
		    "Illegal trade goods","Missing classified materials","Stolen diplomatic pouches"};
	
	int itemquant = random.nextInt(1,12);
    int randomArrayIndex = random.nextInt(4); 
    
    String[] selectedArray = null;
    int pay = 0;
    double p1= 0;
    int p2 = 0;
    switch (randomArrayIndex) {
        case 0:
            selectedArray = recovitem1;
            p1 = item1X * item1M;
            p2 = item1X * itemquant;
            pay = (int) p1 + p2; 
            break;
        case 1:
            selectedArray = recovitem2;
            p1 = item2X * item2M;
            p2 = item2X * itemquant;
            pay = (int) p1 + p2; 
            break;
        case 2:
            selectedArray = recovitem3;
            p1 = item3X * item3M;
            p2 = item3X * itemquant;
            pay = (int) p1 + p2; 
            break;
        case 3:
            selectedArray = recovitem4;
            p1 = item4X * item4M;
            p2 = item4X * itemquant;
            pay = (int) p1 + p2; 
            break;
    }
	
	String formattedPayout = df.format(pay);
	String jobitem = (selectedArray[random.nextInt(selectedArray.length)]);
	
	System.out.println("You hava chosen a recovery job.");
	System.out.println("This job will require you to recover " + itemquant + " " + jobitem + ".");
	System.out.println("The " + jobitem + " are worth " + formattedPayout + " credits.");
	System.out.println("Can you handle this or not?");
	System.out.print("Y or N: ");
	String answer = scanner.nextLine();
	
	if (answer.equalsIgnoreCase("y")) {
		System.out.println("A fixer has accpeted the contract.");
		System.out.println("You'll get paid once the job is finished.");
		System.out.println("Don't mess up...");
	} else {
		System.out.println("Shame.. We were counting on you.");
	}
	
	}
	
	public static void surfaceops() {
	String job = "Surfaceops"; // Being ignored now due to how complex and intricate this job is.
		System.out.println("You have chosen a" + job + "mission.");
	}
	public static void liberation() {
	String job = "liberation"; // Being ignored now due to how complex and intricate this job is.
		System.out.println("You have chosen a" + job + "mission.");
	}
}