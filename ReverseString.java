import java.util.function.*;

public class ReverseString {
	private static BiFunction<String, String, String> recursive;
	private static Function<String, String> iterative;

	static {
		recursive = (a, b) -> {
			return b.length() != a.length() ? recursive.apply(a, b += a.charAt(a.length() - (b.length() + 1))) : b;
		};

		iterative = (a) -> {
			String b = new String();
			for (; b.length() != a.length(); b += a.charAt(a.length() - (b.length() + 1)));
			return b;
		};
	}

	public static String recursiveMethod(String toReverse) {
		return recursive.apply(toReverse, new String());
	}

	public static String iterativeMethod(String toReverse) {
		return iterative.apply(toReverse);
	}
}

