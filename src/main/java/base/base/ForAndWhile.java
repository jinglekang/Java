package base.base;

public class ForAndWhile {

	public static void main(String[] args) {
		int num = 5;
		for (int a = 1; a <= num; a++) {
			for (int b = 1; b <= num-a; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= a * 2 - 1; c++) {
				System.out.print("*");
			}

			System.out.println();
		}
		int x, y, z;
		x = 1;
		while (x <= 5) {
			y = 1;
			while (y <= (5 - x)) {
				System.out.print(" ");
				y++;
			}
			z = 1;
			while (z <= (2 * x - 1)) {
				System.out.print("*");
				z++;
			}
			x++;
			System.out.println();

		}
	}
}