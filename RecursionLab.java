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
				in.nextLine();

				switch (input) {
					case 1:
						System.out.print("\nNumber of elements to output: ");
						
						break;
					case 2: 
						break;
					case 3:
						break;
					case 4: 
						break;
					case 5:
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

