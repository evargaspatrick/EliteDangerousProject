package Engine1;
import java.util.Random;
import java.util.Scanner;
public class EliteDangerousExploreUI {
	
	static EliteDangerousHub hub = new EliteDangerousHub();
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);
	static String[] spaceSystems = {"Solar System","Alpha Centauri","Kepler-186","TRAPPIST-1","Proxima Centauri",
				"Gliese 581","HD 10180","55 Cancri","Upsilon Andromedae","Tau Ceti","Epsilon Eridani","Luhman 16",
			    "Wolf 1061","Gliese 667","HD 219134","Gliese 876","Gliese 163","Gliese 682","Gliese 832",
			    "Gliese 667"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Make a time estimate
	}
		
	public static void explore() {
			String system = (spaceSystems[random.nextInt(spaceSystems.length)]);
			System.out.println("You have targeted " + system + " would you like to fly there?");
			System.out.print("Y or N: ");
			String answer = scanner.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					System.out.println("Plotting course");
					System.out.println("Your estimated time of arrival is " + "blank for now");
				} else {
					System.out.println("The targetted system has been rejected.");
					hub.mainscreen();
				}
		}
}
