package Engine1;
import java.util.Scanner;
public class EliteDangerousHub {
	
	static EliteDangerousExploreUI ui = new EliteDangerousExploreUI();
	static EliteGui gui = new EliteGui();
	static EliteUserLogin login = new EliteUserLogin();
	static Scanner scanner = new Scanner(System.in);
		// This will serve as the hub screen for players. I.e. the main menu of all in-game decisions.
	
	public static void main(String[] args) {
	}
	// TODO Auto-generated method stub
	static void mainscreen() {
	System.out.println("\n" + "Action List:");
		System.out.println("1. Explore" + "\n" + "2. Take on a mission" + "\n" + "3. Customize Ship" + "\n" + "4. Resupply ship" + "\n" + "5. Log out" + "\n" 
							+ "6. Quit");
		System.out.print("Choice: ");
		int action = scanner.nextInt();
			
			if (action == 1) {
				ui.explore();
			}else if (action == 2) {
				gui.mssnslct();
			}else if (action == 3) {
				System.out.println("Function currently disabled.");
				mainscreen();
			}else if (action == 4) {
				System.out.println("Function currently disabled.");
				mainscreen();
			}else if (action == 5) {
				System.out.println("Logging out now..." + "\n");
				login.loginmenu();
			}else if (action == 6){
				System.out.println("Closing application now.");
				System.exit(0);
			}else { // This captures an error I can't yet fathom the player made.
				System.out.println("You've entered the forbidden world");
				System.out.println("Stranger: You're not supposed to be here.");
				System.out.println("System Message: You have been returned to safety.");
				mainscreen();
			}
			
	}
}