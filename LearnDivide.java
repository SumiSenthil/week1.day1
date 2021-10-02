package week1.day1;

public class LearnDivide {

	public static void main(String[] args) {
		
		//Give a number
		int number =18;
		
		//If number is divisible by 3 and 5
		if (number%3==0 && number%5==0) {
			System.out.println("TRIZZ-FIZZ");			
		}
		
		//If number is divisible by 5
		else if (number%5==0) {
			System.out.println("FIZZ");	
		}
		
		//If number is divisible by 3
		else if(number%3==0){
				System.out.println("TRIZZ");	
		}
		
		//If number is not divisible by 3 and 5
		else {
			System.out.println("Number is Not divisible by 3 and 5");	
	}
	}

}
