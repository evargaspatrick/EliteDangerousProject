package Engine1;
import java.util.Scanner;

public class EliteDangerousGame {
	
	static EliteUserLogin login = new EliteUserLogin();
	static EliteDangerousIntro intro = new EliteDangerousIntro();
//	static EliteGui mssn = new EliteGui();
	static EliteDangerousHub hub = new EliteDangerousHub();
	public static void main (String[] args) {
	
		//This is supposed to be the game class, it's going to call all other classes and their methods here
				// Going to have to rename the other class titled "EliteDangerous"
				// Thinking about adding an interface for this screen and of course images for other classes and methods to represent menu options.
				// Would like to add images of each ship along with images of upgrade components for future development.
//		login.loginmenu(); 
		intro.elitestart();
		hub.mainscreen();
	}
}