package Engine1;
import java.util.Random;
import java.util.Scanner;
public class EliteGui {

	public static void main(String[] args) {
	 
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	System.out.println("What kind of mission would you like to take: ");
	System.out.println("1. Courier" + "\n" + "2. Supply" + "\n" + "3. Assasination" + "\n" + "4. Massacre" + "\n" + 
	"5. Theft" + "\n" + "6. Recovery" + "\n" + "7. Surface Operations" + "\n" + "8. Liberation");
	
	int jobslct = scanner.nextInt();
	
	//Job selections for users.
	if (jobslct == 1) {
		System.out.println("A Courier mission has been selected");
	}
	if (jobslct == 2) {
		System.out.println("A Supply mission has been selected");
	}
	if (jobslct == 3) {
		System.out.println("A Assasination mission has been selected");
	}
	if (jobslct == 4) {
		System.out.println("A Massacre mission has been selected");
	}
	if (jobslct == 5) {
		System.out.println("A Theft mission has been selected");
	}
	if (jobslct == 6) {
		System.out.println("A Recovery mission has been selected");
	}
	if (jobslct == 7) {
		System.out.println("A Surface Operations mission has been selected");
	}
	if (jobslct == 8) {
		System.out.println("A Liberation mission has been selected");
	}
// Should I make classes per each mission?
}
}