package Engine1;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class EliteDangerousIntro {

	public static void main(String[] args) {
	
		
	}
		
		public static void elitestart() {
		EliteShips ships = new EliteShips();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] ship_list = {"ships.adder()", "ships.imperialeagle()", "ships.viperMkIII()", "ships.cobraMkIII()", "ships.viperMkIV()", 
			"ships.diamondbackscout()", "ships.cobraMkIV()", "ships.type6transporter()", "ships.dolphin()", "ships.diamondbackexplorer()",
			"ships.imperialcourier()", "ships.keelback()", "ships.aspscout()", "ships.vulture()", "ships.aspexplorer()", "ships.federaldropship()", 
			"ships.type7transporter()","ships.alliancechieftan()", "ships.federalassaultship()", "ships.imperialclipper()", "ships.alliancecrusader()",
			"ships.alliancechallenger()","ships.federalgunship()", "ships.kraitphantom()", "ships.kraitMkII()", "ships.orca()", "ships.ferdelance()",
			"ships.mamba()", "ships.python()","ships.type9heavy()", "ships.belugaliner()", "ships.type10defender()", "ships.anaconda()", "ships.federalcorvette()",
			"ships.imperialcutter()"};
		
		int A = 0;
		
		System.out.print("What is your name commander: ");
		String user_name = scanner.nextLine();
		
		while (A < 1) {
			System.out.println("\n" + "Commander " + user_name + "\n" + "Your setup is: " + "\n");
			String player_ship = ship_list[random.nextInt(ship_list.length)];
			
			if (player_ship == "ships.SidewinderMkI()") {
				ships.sidewinderMkI();
			}
			if (player_ship == "ships.eagleMkII()") {
				ships.eagleMkII();
			}
			if (player_ship == "ships.hauler()") {
				ships.hauler();
			}
			if (player_ship == "ships.adder()") {
				ships.adder();
			}
			if (player_ship == "ships.imperialeagle()") {
				ships.imperialeagle();
			}
			if (player_ship == "ships.viperMkIII()") {
				ships.viperMkIII();
			}
			if (player_ship == "cobraMkIII()") {
				ships.cobraMkIII();
			}
			if (player_ship == "ships.viperMkIV()") {
				ships.viperMkIV();
			}
			if (player_ship == "ships.diamondbackscout()") {
				ships.diamondbackscout();
			}
			if (player_ship == "ships.cobraMkIV") {
				ships.cobraMkIV();
			}
			if (player_ship == "ships.type6transporter()") {
				ships.type6transporter();
			}
			if (player_ship == "ships.dolphin()") {
				ships.dolphin();
			}
			if (player_ship == "ships.diamondbackexplorer()") {
				ships.diamondbackexplorer();
			}
			if (player_ship == "ships.imperialcourier()") {
				ships.imperialcourier();
			}
			if (player_ship == "ships.keelback()") {
				ships.keelback();
			}
			if (player_ship == "ships.aspscout()") {
				ships.aspscout();
			}
			if (player_ship == "ships.aspexplorer()") {
				ships.aspexplorer();
			}
			if (player_ship == "ships.federaldropship()") {
				ships.federalgunship();
			}
			if (player_ship == "ships.type7transporter()") {
				ships.type7transporter();
			}
			if (player_ship == "ships.alliancechieftan()") {
				ships.alliancechieftan();
			}
			if (player_ship == "ships.federalassaultship()") {
				ships.federalassaultship();
			}
			if (player_ship == "ships.imperialclipper()") {
				ships.imperialclipper();
			}
			if (player_ship == "ships.alliancecrusader()") {
				ships.alliancecrusader();
			}
			if (player_ship == "ships.alliancechallenger()") {
				ships.alliancechallenger();
			}
			if (player_ship == "ships.federalgunship()") {
				ships.federalgunship();
			}
			if (player_ship == "ships.kraitphantom()") {
				ships.kraitphantom();
			}
			if (player_ship == "ships.kraitMkII()") {
				ships.kraitMkII();
			}
			if (player_ship == "ships.orca()") {
				ships.orca();
			}
			if (player_ship == "ships.ferdelance()") {
				ships.ferdelance();
			}
			if (player_ship == "ships.mamba()") {
				ships.mamba();
			}
			if (player_ship == "ships.python()") {
				ships.python();
			}
			if (player_ship == "ships.type9heavy()") {
				ships.type9heavy();
			}
			if (player_ship == "ships.belugaliner()") {
				ships.belugaliner();
			}
			if (player_ship == "ships.type10defender()") {
				ships.type10defender();
			}
			if (player_ship == "ships.anaconda()") {
				ships.anaconda();
			}
			if (player_ship == "ships.federalcorvette()") {
				ships.federalcorvette();
			}
			if (player_ship == "ships.imperialcutter()") {
				ships.imperialcutter();
			}
			A += 1;
		
	
}
	
}
}