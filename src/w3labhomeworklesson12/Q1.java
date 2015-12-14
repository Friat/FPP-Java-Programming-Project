	package w3labhomeworklesson12;
	
	public class Q1 {
		
	 	public static void main(String[] args)
		{
			int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
			int denom[] = { 2,0, 4, 4,0, 8 };
			int result;
			
			try
			{
				
			for(int i = 0; i < numer.length; i++)
			{
				result = numer[i] / denom[i];
				System.out.println("Result of "+ numer[i] + "/"+ denom[i]+ " = " + result);
			}
			
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array is out of Bounds"+ e);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Can't divide by Zero");
				
			}
			//System.out.println("End of the Program");
		}
	
	}
