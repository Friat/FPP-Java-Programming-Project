		package w3lesson8listhomework;
		
		class Directory {
			String name;
			long pno; // Phone number
			Directory next;
			
			// Initialize values
			public Directory(String name, long pno)
			{ 
				
				this.name = name;
				this.pno = pno;
				
			}
		
			// -------------------------------------------------------------
			public void displayDirectory() // display values of single element
			{
			}
		}
		
		class DirectoryOpr {
			private Directory first; // ref to first Directory
			private Directory last; // ref to last Directory
		
			// -------------------------------------------------------------
			public DirectoryOpr() // constructor
			{
				
			}
		
			// -------------------------------------------------------------
			public boolean isEmpty() // true if no Directory in your list
			{
				
			}
		
			// -------------------------------------------------------------
			public void insertFirst(String name, long pno) // insert at front of list
			{
				
			}
		
			// -------------------------------------------------------------
			public void insertLast(String name, long pno) // insert at end of list
			{
			}
		
			// -------------------------------------------------------------
			public Directory deleteFirst() // delete first Directory
			{	
				
				return 
			}
		// -------------------------------------------------------------
			public int size() {
				
				return 0;
					}
		// -------------------------------------------------------------
			public void displayList() {
			}
		// -------------------------------------------------------------
		public Directory find(String key)      // find link with given key
		    	{
			       return next;
			
		  	}
		public static void main(String[] args)
		{
			
			DirectoryOpr dir = new DirectoryOpr("David", 345364512);
		}
		
		 }
		
