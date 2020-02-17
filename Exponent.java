import java.util.function.*;

public class Exponent {
	private static BiFunction<Integer, Integer, Integer> recursive;
	private static BiFunction<Integer, Integer, Integer> iterative;

	static {
		recursive = (a, b) -> {
			return  b == 1 ? a : a * recursive.apply(a, b - 1);
		};

		iterative = (a, b) -> {
			int c = a;
			for (int d = 1; d < b; d++)
			       	c *= a;
		       return c;	
		};
	}

	public static Integer recursiveMethod(Integer number, Integer power) {
		return recursive.apply(number, power);
	}

	public static Integer iterativeMethod(Integer number, Integer power) {
		return iterative.apply(number, power);
	}
}

