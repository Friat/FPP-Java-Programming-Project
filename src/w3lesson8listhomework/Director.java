		package w3lesson8listhomework;
		
		class Director {
			String name;
			long pno; // Phone number
			Director next;

			public Director(String name, long pno) { // Initialize values
				this.name=name;
				this.pno = pno;
				this.next = null;
			}

			// -------------------------------------------------------------
			public void displayDirectory() // display values of single element
			{
				System.out.println("Name:-"+name+",PhoneNo:-"+pno);
			}
			public String toString()
			{
				return "Name:-"+name+",PhoneNo:-"+pno;
			}
		}

		class DirectoryOpr {
			private Director first; // ref to first Directory
			private Director last; // ref to last Directory


			public DirectoryOpr() // constructor
			{
				first=null;
				last=null;
			}

			public boolean isEmpty() // true if no Directory in your list
			{
				if(first==null)
					return true;
				else
					return false;
			}

			public void insertFirst(String name, long pno) // insert at front of list
			{
				Director front = new Director(name,pno);
				if(first==null)
					first = front;
				else
				{
					front.next=first;
					first = front;
				}
			}


			public void insertLast(String name, long pno) // insert at end of list
			{
				Director lastNode = new Director(name,pno);
				if(first==null)
				{
					first=lastNode;
				}
				else
				{
					Director temp = first;
					while (temp.next != null)
						temp = temp.next;
					
					temp.next = lastNode;
				}
			}


			public Director deleteFirst() // delete first Directory
			{		
				if(first == null)
					return null;
				else if(first.next ==null)//only one element in the linked list
				{
					Director temp = first;
					first=null;
					return temp;
				}
				else
				{
					Director temp = first.next;
					first.next =null;
					first=temp;
					return first;
				}
			}

			public int size() {
				int count=0;
				if(first == null)
					return count;
				else
				{
					count++;
					Director temp=first.next;
					while(temp !=null)
					{
						count++;
						temp = temp.next;
					}
				}
				return count;
			}

			public void displayList() {
				String str =""; 
				Director temp = first; //findLast();
				while (temp != null) {
					str = str + "==>[" + temp.toString() + "]";
					temp = temp.next;
				}
				str = str + "==>[" + "NULL" + "]";
				System.out.println(str);
			}

			public Director find(String key)      // find link with given key
		    {
				if(first == null)
					return null;
				else
				{
					Director temp = first;
					while(temp != null)
					{
						if(temp.name.equals(key))
							return temp;
						else
							temp=temp.next;
					}
						
					return null;
				}
		    }
		}
		 

	 class PhoneDirectoryApp
		{
			public static void main(String[] args)
			{
				DirectoryOpr obj = new DirectoryOpr();
				System.out.println("Is List empty--"+obj.isEmpty());
				
				obj.insertFirst("Friat mehari", 251669078);
				obj.displayList();
				
				obj.insertLast("Yonas", 251643620);
				obj.displayList();
				
				System.out.println();
				System.out.println("Inserting at last");
				obj.insertLast("Elnatan",251335616);
				obj.displayList();
				
				System.out.println();
				System.out.println("Inserting at first");
				obj.insertFirst("Teddy",251535676);
				obj.displayList();
				
				System.out.println();
				System.out.println("Deleting first element");
				obj.deleteFirst();
				obj.displayList();
				
				System.out.println("Found object is ["+obj.find("Gebre")+"]");
				
				System.out.println("Size of list is= "+obj.size());
				obj.displayList();
			}
			
		}