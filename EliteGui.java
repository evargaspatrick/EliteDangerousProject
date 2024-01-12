package Engine1;
import java.util.Random;
import java.util.Scanner;
public class EliteGui {

	public static void main(String[] args) {
	
	}
	
	public static void mssnslct() {
	EliteMissions mission = new EliteMissions(); 
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
		while (true) {
			System.out.println("\n" + "What kind of mission would you like to take: ");
			System.out.println("1. Courier" + "\n" + "2. Supply" + "\n" + "3. Assasination" + "\n" + "4. passenger" + "\n" + "5. Massacre" + "\n" + 
			"6. Theft" + "\n" + "7. Recovery" + "\n" + "8. Surface Operations" + "\n" + "9. Liberation");
			System.out.print("Which job would you like: ");
			int jobslct = scanner.nextInt();
			
			//Job selections for users.
			if (jobslct == 1) {
				mission.courier();
				break;
			}
			if (jobslct == 2) {
				mission.supply();
				break;
			}
			if (jobslct == 3) {
				mission.assassination();
				break;
			}
			if (jobslct == 4) {
				mission.passenger();
				break;
			}
			if (jobslct == 5) {
				mission.massacre();
				break;
			}
			if (jobslct == 6) {
				mission.theft();
				break;
			}
			if (jobslct == 7) {
				mission.recovery();
				break;
			}
			if (jobslct == 8) {
		//		mission.surfaceops();
				System.out.println("\n" + "This is still a Work in progress" + "\n");
			} else if (jobslct == 9) {
		//		mission.liberation();
				System.out.println("\n" + "This is still a work in progress" + "\n");
			} else {
				System.out.println("\n" + "An invalid input was made. Please try again." + "\n");
			}
		// Should I make classes per each mission?
		}
		
	}
}