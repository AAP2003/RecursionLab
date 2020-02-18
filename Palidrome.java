import java.util.function.*;

public class Palidrome {
	private static Predicate<String> recursive;
	private static Predicate<String> iterative;

	static {
		recursive = (a) -> {
			return a.equals(" ") || a.length() < 2 ? true :
				(Character.toLowerCase(a.charAt(0)) == Character.toLowerCase(a.charAt(a.length() - 1))
					? recursive.test(a.substring(1, a.length() - 1)) : false);
		};

		iterative = (a) -> {
			for (int i = 0; a.length() - 2 * i > 2; i++)
				if (a.charAt(i) != a.charAt(a.length() - (i + 1)))
				       	return false;
			return true;
		};
	}

	public static boolean recursiveMethod(String checkPalidrome) {
		return recursive.test(checkPalidrome.toLowerCase());
	}

	public static boolean iterativeMethod(String checkPalidrome) {
		return iterative.test(checkPalidrome.toLowerCase());
	}
}

