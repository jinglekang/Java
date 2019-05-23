package base.base;

public class ForExtend {

	public static void main(String[] args) {
		// 定义金字塔层数
		int num = 6;
		for (int a = 1; a <= num; a++) {
			// 打印倒三角空格
			for (int b = 1; b <= num - a; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= a * 2 - 1; c++) {
				// 打印第一行和最后一行星号
				if (a == 1 || a == num) {
					System.out.print("*");
				} else {
					// 打印其他行第一个星号和最后一个星号
					if (c == 1 || c == (a - 1) * 2 + 1) {
						System.out.print("*");
					} else {
						// 其他行中间插入空格，空格数量==a * 2 - 3
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
