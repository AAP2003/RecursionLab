import java.util.function.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class RecursionLab {
	
	public BiFunction<List<Integer>, Integer, List<Integer>> fibonacciSequence;

	{
		fibonacciSequence = (a, b) -> {
			int al = a.size();

			if (al >= b)
				return a;

			List<Integer> a2 = new ArrayList<Integer>(a);
			a2.add(a.get(al - 1) + a.get(al - 2));

			return fibonacciSequence.apply(a2, b);
		};
	}

	public RecursionLab() {
	
	}

	public static void main(String[] args) {
		RecursionLab recursion = new RecursionLab();
		System.out.println("Fibonacci Sequence: " + recursion.fibonacciSequence.apply(List.of(0, 1), 10));
	}
}

