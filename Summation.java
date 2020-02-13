import java.util.function.*;

public class Summation {
	private static BiFunction<Integer, Integer, Integer> recursive;
	private static Function<Integer, Integer> iterative;

	static {
		recursive = (a, b) -> {
			return a == 0 ? b : recursive.apply(a - 1, b + a);
		};	
		
		iterative = (a) -> {
			int b = 0;
			for(; a != 0; b += a--);
			return b;
		};
	}

	public static Integer recursiveMethod(int sumTo) {
		return recursive.apply(sumTo, 0);
	}

	public static Integer iterativeMethod(int sumTo) {
		return iterative.apply(sumTo);
	}
}

