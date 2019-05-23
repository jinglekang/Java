package base.base;

public class TryCatchFinally {
	public static void main(String[] args) throws InterruptedException {
		// new test().cloneTest();

		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("这是第" + i + "次循环");
//				if (i == 7) {
//					throw new Exception("我是一个异常");
//				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Thread.sleep(500L);
			System.out.println("我会在最后被执行");
		}

	}

}
