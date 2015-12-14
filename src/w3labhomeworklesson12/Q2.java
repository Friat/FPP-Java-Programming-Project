	package w3labhomeworklesson12;
	
	import java.util.Scanner;
	
	public class Q2 {
	
		public static void main(String[] args) {
				
			int number = 0;
			Scanner input = new Scanner(System.in);
	      		try {
			    System.out.print("Enter a possitive Number between 0 and 100: ");
			    number = input.nextInt();
			    if( number > 100 || number < 0 )
			    {
				throw new Exception("Number Should be between 0 and 100");
			    }
			    
			    System.out.println("Input Number = " + number);
			    System.out.println("End");
			    
			    //number = Integer.parseInt(input);
			}
			catch(Exception exc)
			{
			    System.out.println("Please enter digits only:" + exc.getMessage());
			}
	      		
		}
		}
	
	
