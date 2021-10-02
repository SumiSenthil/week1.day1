package week1.day1;

public class FindFactorial {

	public static void main(String[] args) {
		// Declare your input as 5
		
		
				// Declare an integer variable fact as 1
				

				// Iterate from 1 to your input (tip: using loop concept)
				

					// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
					

				//End of loop
				

				// Print factorial (fact)
			int input=5,fact=1;
			for (int i = 1; i <=input; i++) {
				fact = fact*i;							
			}
			System.out.println("The factorial of "+input +" is " +fact);
	} 

}
