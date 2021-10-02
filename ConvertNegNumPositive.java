package week1.day1;

public class ConvertNegNumPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-40;
		if (num<0) {
			num=num*(-1);
			System.out.println("The number is Negative and converted to positive and number is " + num);			
		}
		else if(num>0) {
			System.out.println("The number is Positive " + num);			
		}
		else {
			System.out.println("The number is neutral");
		}
				
	}

}
