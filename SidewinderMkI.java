package Engine1;

public class SidewinderMkI {

	public static void main(String[] args) {
	int a = 0;
		while (a < 10) {
			if (a == 3) {
				adder();
			}
			a += 1;
			
			if (a == 4) {
				eagleMkII();
			}
		}
			
	}
	
	public static void sidewinderMkI() {
		String shipname = "Sidewinder Mk I";
		int shipprice = 32000;
		System.out.println(shipname + " Price: " + "\n" + shipprice + "Cr");
	}
	
	public static void eagleMkII() {
		String shipname = "Eagle Mk II";
		int shipprice = 44800;
		System.out.println(shipname + " Price: " + "\n" + shipprice + "Cr");
	}
	
	public static void hauler() {
		String shipname = "Hauler";
		int shipprice = 52720;
		System.out.println(shipname + " Price: " + "\n" + shipprice + "Cr");
	
	}
	
	public static void adder() {
		String shipname  = "Adder";
		int shipprice = 87810;
		System.out.println(shipname + " Price: " + "\n" + shipprice + "Cr");
	}
	
	public static void imperialeagle() {
		String shipname = "Imperial Eagle";
		int shipprice = 110830;
		System.out.println(shipname + " Price: " + "\n" + shipprice + "Cr");
	}
}
