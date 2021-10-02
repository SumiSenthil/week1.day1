package week1.day1;

public class Fibbonacciseries {
	public static void main(String[] args) {
		
			
					//Initialize the variables
					int firstnum=0,secondnum=1,Output, i;
					
					for(i=0;i<=8;i++)
					{
						
					Output= firstnum+secondnum;
					firstnum=secondnum;
					secondnum=Output;
					
					//Print Fibonacci Series
					System.out.println(Output);
	}
}
	
}
