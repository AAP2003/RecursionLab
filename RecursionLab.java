public class RecursionLab {
	public RecursionLab() {
		System.out.println("Fibonacci Sequence (Recursive): " + FibonacciSequence.recursiveMethod(10));
		System.out.println("Fibonacci Sequence (Iterative): " + FibonacciSequence.iterativeMethod(10));
		System.out.println("Summation (Recursive): " + Summation.recursiveMethod(10));
		System.out.println("Summation (Iterative): " + Summation.iterativeMethod(10));
	
	}

	public static void main(String[] args) {
		new RecursionLab();
	}
}

