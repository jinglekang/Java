package base.base;

/**
 * Created by kangtaiyang on 2018/6/8.
 */
public class Tuple {

	public static <A, B> TwoTuple getTuple(A a, B b) {
		return new TwoTuple(a, b);
	}

	public static <A, B, C> ThreeTuple getTuple(A a, B b, C c) {
		return new ThreeTuple(a, b, c);
	}

	public static <A, B, C, D> FourTuple getTuple(A a, B b, C c, D d) {
		return new FourTuple(a, b, c, d);
	}

	static class TwoTuple<A, B> {
		public final A a;
		public final B b;

		public TwoTuple(A a, B b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public String toString() {
			return "TwoTuple{" + "a=" + a + ", b=" + b + '}';
		}
	}

	static class ThreeTuple<A, B, C> extends TwoTuple {
		public final C c;

		public ThreeTuple(A a, B b, C c) {
			super(a, b);
			this.c = c;
		}

		@Override
		public String toString() {
			return "ThreeTuple{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
		}
	}

	static class FourTuple<A, B, C, D> extends ThreeTuple {
		public final D d;

		public FourTuple(A a, B b, C c, D d) {
			super(a, b, c);
			this.d = d;
		}

		@Override
		public String toString() {
			return "FourTuple{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + '}';
		}
	}
}
