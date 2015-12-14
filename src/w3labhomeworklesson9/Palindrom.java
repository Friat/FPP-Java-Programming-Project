	package w3labhomeworklesson9;
	
	import java.util.Scanner;
	import java.util.Stack;
	
	public class Palindrom {
				
				
	public static void main(String[] args) 
	{
			
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Text for Palindrom test");
		String input = in.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < input.length(); i++)
		{
			stack.push(input.charAt(i));
			
		}
		String reverseInput = "";
		
		while(!stack.isEmpty())
		{
			reverseInput += stack.pop();
		}
		
		if(input.equals(reverseInput))
		{
			System.out.println("The word is Palindrom");
		}
		else
			System.out.println("The word is not Palindrom");
			
	}
	}
			
			
