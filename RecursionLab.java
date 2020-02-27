import java.util.Scanner;

public class RecursionLab {
	public RecursionLab() {
		boolean runAgain;
		Scanner in = new Scanner(System.in);
		
		do {
			runAgain = true;
			System.out.println("---------------------------------");
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
						System.out.println(FibonacciSequence.recursiveMethod(input2));
						System.out.println(FibonacciSequence.iterativeMethod(input2));
						break;
					case 2: 
						input2 = Integer.parseInt(in.nextLine());
						System.out.println(Summation.recursiveMethod(input2));
						System.out.println(Summation.iterativeMethod(input2));	
						break;
					case 3:
						input2 = Integer.parseInt(in.nextLine());
						input3 = Integer.parseInt(in.nextLine());
						System.out.println(Exponent.recursiveMethod(input2, input3));
						System.out.println(Exponent.iterativeMethod(input2, input3));
						break;
					case 4: 
						strIn = in.nextLine();
						System.out.println(ReverseString.recursiveMethod(strIn));
						System.out.println(ReverseString.iterativeMethod(strIn));
						break;
					case 5:
						strIn = in.nextLine();
						System.out.println(Palidrome.recursiveMethod(strIn));
						System.out.println(Palidrome.iterativeMethod(strIn));
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

