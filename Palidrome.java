import java.util.function.*;

public class Palidrome {
	private static Predicate<String> recursive;
	private static Predicate<String> iterative;

	static {
		recursive = (a) -> {
			return a.equals(" ") || a.length() < 2 ? true :
				(Character.toLowerCase(a.charAt(0)) == Character.toLowerCase(a.charAt(a.length() - 1))
					? recursive.test(a.substring(1, a.length() - 2)) : false);
		};

		iterative = (a) -> {
			boolean out = true;
			for (int i = 0; i < (a.length() - a.length() % 2) / 2 && a.length() - 2 * i < 2; i++)
				out = out && Character.toLowerCase(a.charAt(i)) == Character.toLowerCase(a.charAt(a.length() - i));
			return out;
		};
	}

	public static boolean recursiveMethod(String checkPalidrome) {
		return recursive.test(checkPalidrome);
	}

	public static boolean iterativeMethod(String checkPalidrome) {
		return iterative.test(checkPalidrome);
	}
}

