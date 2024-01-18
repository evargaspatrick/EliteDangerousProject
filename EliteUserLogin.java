package Engine1;
import java.util.Scanner;
public class EliteUserLogin {
static Scanner scanner = new Scanner(System.in);

	public static void main (String[] args) {
		
	}
		public static void loginmenu() {
		System.out.println("Welcome!");
		System.out.println("Which of these are you?");
		System.out.println("1. Newcomer ready to traverse the stars.");
		System.out.println("2. Experienced commander used to sailing the Milkyway.");
		System.out.print("1 or 2: ");
		int answer = scanner.nextInt();
			if (answer == 1) {
				EliteUserLogin.newuser();
			} else if (answer == 2) {
				EliteUserLogin.currentuser();
			} else {
				EliteUserLogin.loginmenu();
			}
		}
	
		private static void newuser() {
			System.out.println("Hello New User!");
			System.out.print("What would you like your name to be: ");
			String username = scanner.next();
			System.out.println("Your name is Commander: " + username.toString());
			String nmanswer = scanner.nextLine();
			System.out.println("Please input your account password. Make sure it's not simple!");
			System.out.print("Password: ");
			String password = scanner.nextLine();
			// Need to be able to export to a user account
		}
		
		private static void currentuser() {
			System.out.println("Hello Commander");
			System.out.println("Please input your credentials");
			System.out.print("Username: ");
			String usernamecheck = scanner.next();
			// Need to be able to export to a user account
		}
// Currently not in use.		
}