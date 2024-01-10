package Engine1;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class EliteDangerousIntro {

	public static void main(String[] args) {
		EliteShips Bruh1 = new EliteShips();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
	
		
		String[] ship_list = {"Bruh1.adder()", "Bruh1.imperialeagle()", "Bruh1.viperMkIII()", "Bruh1.cobraMkIII()", "Bruh1.viperMkIV()", 
			"Bruh1.diamondbackscout()", "Bruh1.cobraMkIV()", "Bruh1.type6transporter()", "Bruh1.dolphin()", "Bruh1.diamondbackexplorer()",
			"Bruh1.imperialcourier()", "Bruh1.keelback()", "Bruh1.aspscout()", "Bruh1.vulture()", "Bruh1.aspexplorer()", "Bruh1.federaldropship()", 
			"Bruh1.type7transporter()","Bruh1.alliancechieftan()", "Bruh1.federalassaultship()", "Bruh1.imperialclipper()", "Bruh1.alliancecrusader()",
			"Bruh1.alliancechallenger()","Bruh1.federalgunship()", "Bruh1.kraitphantom()", "Bruh1.kraitMkII()", "Bruh1.orca()", "Bruh1.ferdelance()",
			"Bruh1.mamba()", "Bruh1.python()","Bruh1.type9heavy()", "Bruh1.belugaliner()", "Bruh1.type10defender()", "Bruh1.anaconda()", "Bruh1.federalcorvette()",
			"Bruh1.imperialcutter()"};

		int A = 0;
		
		System.out.print("What is your name commander: ");
		String user_name = scanner.nextLine();
		
		while (A < 1) {
			System.out.println("Commander " + user_name + "\n" + "Your setup is: " + "\n");
			String player_ship = ship_list[random.nextInt(ship_list.length)];
			
			if (player_ship == "Bruh1.SidewinderMkI()") {
				Bruh1.sidewinderMkI();
			}
			if (player_ship == "Bruh1.eagleMkII()") {
				Bruh1.eagleMkII();
			}
			if (player_ship == "Bruh1.hauler()") {
				Bruh1.hauler();
			}
			if (player_ship == "Bruh1.adder()") {
				Bruh1.adder();
			}
			if (player_ship == "Bruh1.imperialeagle()") {
				Bruh1.imperialeagle();
			}
			if (player_ship == "Bruh1.viperMkIII()") {
				Bruh1.viperMkIII();
			}
			if (player_ship == "cobraMkIII()") {
				Bruh1.cobraMkIII();
			}
			if (player_ship == "Bruh1.viperMkIV()") {
				Bruh1.viperMkIV();
			}
			if (player_ship == "Bruh1.diamondbackscout()") {
				Bruh1.diamondbackscout();
			}
			if (player_ship == "Bruh1.cobraMkIV") {
				Bruh1.cobraMkIV();
			}
			if (player_ship == "Bruh1.type6transporter()") {
				Bruh1.type6transporter();
			}
			if (player_ship == "Bruh1.dolphin()") {
				Bruh1.dolphin();
			}
			if (player_ship == "Bruh1.diamondbackexplorer()") {
				Bruh1.diamondbackexplorer();
			}
			if (player_ship == "Bruh1.imperialcourier()") {
				Bruh1.imperialcourier();
			}
			if (player_ship == "Bruh1.keelback()") {
				Bruh1.keelback();
			}
			if (player_ship == "Bruh1.aspscout()") {
				Bruh1.aspscout();
			}
			if (player_ship == "Bruh1.aspexplorer()") {
				Bruh1.aspexplorer();
			}
			if (player_ship == "Bruh1.federaldropship()") {
				Bruh1.federalgunship();
			}
			if (player_ship == "Bruh1.type7transporter()") {
				Bruh1.type7transporter();
			}
			if (player_ship == "Bruh1.alliancechieftan()") {
				Bruh1.alliancechieftan();
			}
			if (player_ship == "Bruh1.federalassaultship()") {
				Bruh1.federalassaultship();
			}
			if (player_ship == "Bruh1.imperialclipper()") {
				Bruh1.imperialclipper();
			}
			if (player_ship == "Bruh1.alliancecrusader()") {
				Bruh1.alliancecrusader();
			}
			if (player_ship == "Bruh1.alliancechallenger()") {
				Bruh1.alliancechallenger();
			}
			if (player_ship == "Bruh1.federalgunship()") {
				Bruh1.federalgunship();
			}
			if (player_ship == "Bruh1.kraitphantom()") {
				Bruh1.kraitphantom();
			}
			if (player_ship == "Bruh1.kraitMkII()") {
				Bruh1.kraitMkII();
			}
			if (player_ship == "Bruh1.orca()") {
				Bruh1.orca();
			}
			if (player_ship == "Bruh1.ferdelance()") {
				Bruh1.ferdelance();
			}
			if (player_ship == "Bruh1.mamba()") {
				Bruh1.mamba();
			}
			if (player_ship == "Bruh1.python()") {
				Bruh1.python();
			}
			if (player_ship == "Bruh1.type9heavy()") {
				Bruh1.type9heavy();
			}
			if (player_ship == "Bruh1.belugaliner()") {
				Bruh1.belugaliner();
			}
			if (player_ship == "Bruh1.type10defender()") {
				Bruh1.type10defender();
			}
			if (player_ship == "Bruh1.anaconda()") {
				Bruh1.anaconda();
			}
			if (player_ship == "Bruh1.federalcorvette()") {
				Bruh1.federalcorvette();
			}
			if (player_ship == "Bruh1.imperialcutter()") {
				Bruh1.imperialcutter();
			}
			A += 1;
		
	
}
	}
}