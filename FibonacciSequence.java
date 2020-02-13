import java.util.function.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class FibonacciSequence {
		
	private static BiFunction<List<Integer>, Integer, List<Integer>> recursive;

	static {
		recursive = (a, b) -> {
			int al = a.size();

			if (al >= b)
				return a;

			List<Integer> a2 = new ArrayList<Integer>(a);
			a2.add(a.get(al - 1) + a.get(al - 2));

			return recursive.apply(a2, b);
		};
	}

	public static List<Integer> recursiveMethod(Integer length) {
		return recursive.apply(List.of(0, 1), length);
	}
}

