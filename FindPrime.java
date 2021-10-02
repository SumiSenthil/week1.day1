package week1.day1;

public class FindPrime {

	public static void main(String[] args) {
		
		//Initialize the variables
		int input=13,i;
		boolean flag=false;
		
		for(i=2;i<input/2;i++)
		{
			
				if(input%i==0) {
					System.out.println(input +" is not a Prime number");
				  flag=true;
				 break;}
		}
				if (flag==false) {				
					
					System.out.println(input +" is a Prime number");
				}
			
		
		}
	
	
}

