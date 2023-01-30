package ControlStatement;

public class SwitchEg {
	public static void main(String[] args) {
		int nol=10;
		switch(nol) {
		case 20:
			System.out.println("20 is wrong");
			break;
		case 30:
			System.out.println("30 is wrong");
			break;
		case 50:
			System.out.println("50 is wrong");
			break;
		case 90:
			System.out.println("90 is wrong");
			break;
		case 10:
			System.out.println("10 is right number");
			break;
		default:System.out.println("invalid number");

		}
	}

}
