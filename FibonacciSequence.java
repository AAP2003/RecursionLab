import java.util.function.*;
import java.util.List;
import java.util.ArrayList;

public class FibonacciSequence {
		
	private static BiFunction<List<Integer>, Integer, List<Integer>> recursive;
	private static Function<Integer, List<Integer>> iterative;

	static {
		recursive = (a, b) -> {
			if (a.size() >= b)
				return a;
			List<Integer> c = new ArrayList<Integer>(a);
			c.add(a.get(a.size() - 1) + a.get(a.size() - 2));
			return recursive.apply(c, b);
		};

		iterative = (a) -> {
			List<Integer> b = new ArrayList<Integer>(List.of(0, 1));
			for (; b.size() < a; b.add(b.get(b.size() - 1) + b.get(b.size() - 2)));
			return b;
		};
	}

	public static List<Integer> recursiveMethod(Integer length) {
		return recursive.apply(List.of(0, 1), length);
	}

	public static List<Integer> iterativeMethod(Integer length) {
		return iterative.apply(length);
	}
}

