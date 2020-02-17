public class RecursionLab {
	public RecursionLab() {
		System.out.println("Fibonacci Sequence (Recursive): " + FibonacciSequence.recursiveMethod(10));
		System.out.println("Fibonacci Sequence (Iterative): " + FibonacciSequence.iterativeMethod(10));
		System.out.println("Summation (Recursive): " + Summation.recursiveMethod(10));
		System.out.println("Summation (Iterative): " + Summation.iterativeMethod(10));
		System.out.println("Exponent (Recursive): " + Exponent.recursiveMethod(2, 3));
		System.out.println("Exponent (Iterative): " + Exponent.iterativeMethod(2, 3));	
		System.out.println("Reverse String (Recursive): " + ReverseString.recursiveMethod("Hello, World!"));
		System.out.println("Reverse String (Iterative): " + ReverseString.iterativeMethod("Hello, World!"));
		System.out.println("Palidrome (Recursive) << \"racecar\": " + Palidrome.recursiveMethod("racecar"));
		System.out.println("Palidrome (Iterative) << \"racecar\": " + Palidrome.iterativeMethod("racecar"));
		System.out.println("Palidrome (Recursive) << \"false\": " + Palidrome.recursiveMethod("false"));
		System.out.println("Palidrome (Iterative) << \"false\": " + Palidrome.iterativeMethod("false"));
	}

	public static void main(String[] args) {
		new RecursionLab();
	}
}

