import java.util.Scanner;

public class RecursionLab {
	public RecursionLab() {
		boolean runAgain;
		Scanner in = new Scanner(System.in);
		
		do {
			runAgain = true;
			System.out.println("\n---------------------------------");
			System.out.println("1 Fibonacci Sequence");
			System.out.println("2 Summation");
			System.out.println("3 Exponent");
			System.out.println("4 Reverse String");
			System.out.println("5 Palidrome\n");
			System.out.println("Enter any other character to exit");
			System.out.println("---------------------------------");
			System.out.print(": ");
			
			try {
				int input = Integer.parseInt(in.next());
				int input2;
				int input3;
				String strIn;
				in.nextLine();

				switch (input) {
					case 1:
						System.out.print("\nNumber of elements to output: ");
						input2 = Integer.parseInt(in.nextLine());
						System.out.println("Recursive: " + FibonacciSequence.recursiveMethod(input2));
						System.out.println("Iterative: " + FibonacciSequence.iterativeMethod(input2));
						break;
					case 2: 
						System.out.print("\nSum to #: ");
						input2 = Integer.parseInt(in.nextLine());
						System.out.println("Recursive: " + Summation.recursiveMethod(input2));
						System.out.println("Iterative: " + Summation.iterativeMethod(input2));	
						break;
					case 3:
						System.out.print("\nNumber: ");
						input2 = Integer.parseInt(in.nextLine());
						System.out.print("Power: ");
						input3 = Integer.parseInt(in.nextLine());
						System.out.println("Recursive: " + Exponent.recursiveMethod(input2, input3));
						System.out.println("Iterative: " + Exponent.iterativeMethod(input2, input3));
						break;
					case 4: 
						System.out.print("\nString: ");
						strIn = in.nextLine();
						System.out.println("Recursive: " + ReverseString.recursiveMethod(strIn));
						System.out.println("Iterative: " + ReverseString.iterativeMethod(strIn));
						break;
					case 5:
						System.out.print("\nCheck String: ");
						strIn = in.nextLine();
						System.out.println("Recursive: " + Palidrome.recursiveMethod(strIn));
						System.out.println("Iterative: " + Palidrome.iterativeMethod(strIn));
						break;
				}
			} catch(Exception e) {
				runAgain = false;
			}

		} while (runAgain);


	}

	public static void main(String[] args) {
		new RecursionLab();
	}
}

