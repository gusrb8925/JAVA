
public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;

		for (a = 0; a < 6; a++) {
			for (b = 0; b < 5 - a; b++) {
				System.out.print(" ");
			}
			for (c = 0; c <= a; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (a = 0; a < 5; a++) {
			for (b = 0; b <= a; b++) {
				System.out.print(" ");
			}
			for (c = 0; c <5- a; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}