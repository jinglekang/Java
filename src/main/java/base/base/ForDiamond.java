package base.base;

public class ForDiamond {
	public static void main(String[] args) {
		int num = 10;
		for (int a = 1; a <= num; a++) {
			for (int b = 1; b <= num - a; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= a * 2 - 1; c++) {
				if (a == 1) {
					System.out.print("*");
				} else {
					if (c == 1 || c == (a - 1) * 2 + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		for (int x = num + 1; x <= num * 2 - 1; x++) {
			for (int y = num + 1; y <= x; y++) {
				System.out.print(" ");
			}
			for (int z = num * 2 - 1; z >= 1; z--) {
				if (z == num * 2 - 1 || z == (x - num) * 2 + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}