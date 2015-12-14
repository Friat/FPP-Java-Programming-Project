package w3labhomeworklesson9;

public class PriorityQueue 
{
	PriorityQueue next;
	int data;
	
	PriorityQueue()
	{
		this.next = null;
	}
}
class LinkedList
{
	PriorityQueue first = null;
	PriorityQueue last = null;
	
	public void add(int value)
	{
		
		PriorityQueue node = new PriorityQueue();
		if(first == null)
		{
			first = node;			
			}
		else if(last == null)
		{
		  if(first.data > value)
		  {
			  PriorityQueue n1 = first;
			  first.data = value;
			  last = n1;  
		  }
		  else{
			  PriorityQueue tempprev = first;
			  PriorityQueue temp = first;
			  
			  while(value > temp.data )
			  {
				  temp = temp.next;
				  tempprev = temp;
			 }
			  tempprev.next = node;
			  node.next= temp; 
			  
			  
			  
		  }
		}
		else
		{
			
		}
	}
	
	public static void main(String[] args) {
		

	}
}

