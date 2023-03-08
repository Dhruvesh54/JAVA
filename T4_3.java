//3.Create a java application to count factorial of a number entered through command line argument.
class T4_3  {
	
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int factorial = 1;
		for(int i = 1; i<=number ; i++){
				factorial*= i;
		}
		System.out.println("Factorial = "+  factorial);
	}

}