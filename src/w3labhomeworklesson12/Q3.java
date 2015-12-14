		package w3labhomeworklesson12;
	
	import java.util.Scanner;
	
	public class Q3 extends Exception 
		{
			String cusName;
			String accNumber;
		    double balance;
			
			public Q3(String cusName, String accNum, double balance)
			{
				this.cusName = cusName;
				this.accNumber = accNum;
				this.balance = balance;
			}
			public Q3()
			{
				System.out.println("Withdraw amount exceed the balance");
			}
			
			public Q3(double balance)
			{
				System.out.print("Balance reach below 100$");
			}
			
			public double deposit(double deposite){
				
				return deposite + balance;
				
			}
			
			public double withDraw(double withDraw)
			{
				return (balance - withDraw);
			}
		
			public static void main(String[] args) throws Throwable{
				
		
				Q3 customer = new Q3("John","ba1234", 100 );
				System.out.println("Your Current Balance is = "+ customer.balance);
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("How much money do u want to withdraw: ");
				double withdraw = input.nextDouble();
				
				double remainBalance = customer.withDraw(withdraw);
				System.out.println("Your Current Balance is = "+ remainBalance);
				
				if(remainBalance < 0)
				{
					throw new Q3();
					
				}
				
			}
	
			
			}
