import java.util.Scanner;

public class Ex1019 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String[] ar = a.split("\\.");
		int A = Integer.valueOf(ar[0]);
		int B = Integer.valueOf(ar[1]);
		int C = Integer.valueOf(ar[2]);
		System.out.printf("%04d.%02d.%02d", A, B, C);

	}

}
