package base.base;

public class ReturnRide {

	public static void main(String[] args) {
		class Ride {
			public int num(int a) {
				for (int x = 1; x <= a; x++) {
					for (int y = 1; y <= x; y++) {
						System.out.print(y + "*" + x + "=" + 1 * x * y + "\t");
					}
					System.out.println();
				}
				return a;
			}
		}
		Ride ride1 = new Ride();
		ride1.num(6);
	}
}
