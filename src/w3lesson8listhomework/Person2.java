	package w3lesson8listhomework;
	
	
	class Person2
	{
	private String lastName;
	private String firstName;
	private int age;
	public Person2(String last, String first, int a)
	{ 
		// constructor to initialize the values
		lastName = last;
		firstName = first;
		age = a;
	}
	public void displayPerson() 
	{
		// Display fisrtName, lastName and age
		System.out.println("First Name: "+ firstName + "Last Name:" + lastName+ "Age:"+ age);
	}
	public String getLastName() // get only the last name
	{
		return lastName;
	}
	} 
	// end class Person
	
	class PersonArrayOpe
	{
		
	private Person2[] a; // reference to array
	private int nElems; // number of data items
	//private int size;
	public PersonArrayOpe(int max) // constructor to initialize person array with size max and nElems;
	{
		a = new Person2[max];
		//size = nElems;
		
	}
	
	public PersonArrayOpe() {
		// TODO Auto-generated constructor stub
	}
	
	public Person2 find(String searchName) // Pass Lastname as an argument
	{ 
		for(Person2 temp: a){
			if(temp.getLastName().equals(searchName)){
				return temp;
			}
				}
		return null;
	} 
	public void insert(String last, String first, int age)// Insert at last
	{
		Person2 a1 = new Person2( last, first, age);
		if(nElems == a.length)
		{
		 resize();
		a[nElems++] = a1;
		nElems++;
		}
		
			a[nElems] = a1;
			nElems++;
		
		}
	{
		
	}
	public boolean delete(String searchName) // Shift down the elements. Argument should be lastname
	{ 
		if(nElems == 0) return false;
		int index = -1;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i].getLastName().equals(searchName))
			{
				index = i;
			break;
		}
		}
		if(index == -1) 
			return false;
		Person2[] temp = new Person2[a.length];
		System.arraycopy(a,0, temp, 0,index );
		System.arraycopy(a, index + 1, temp, index, a.length - (index + 1));
		a = temp;
		nElems--;
		return true;
		
	}
	public void displayAll() // displays array contents
	{
		for(int i =0; i < nElems; i++)
		{
			a[i].displayPerson();
		}
	}
	public int size() // Return the number of persons stored in the array
	{
		return nElems;
	}
	
	private void resize()
	{
		System.out.println("Array resizing:");
		int len = a.length;
		int newlen = 2 * len;
		Person2[] a1 = new Person2[newlen];
		System.arraycopy(a,0,a1,0 , len);
	} 
	public static void main(String[] args)
	{
				
		PersonArrayOpe po= new PersonArrayOpe(10);
			
		
		po.insert("Hadush", "Friat", 27);
		po.insert("Hirut", "Tinbit", 29);
		po.insert("Haile", "Eden", 16);
		
		System.out.println("The Orginal Size of the List"+ po.size());
		
		po.delete("Hadush");
		
		po.insert("John", "David", 23);
		po.insert("Mehari", "Yordanos", 21);
		po.insert("Hagos", "Kahsa", 45);
		
		System.out.println("The person with the given last Name: ");
		System.out.println();
		po.find("Hirut").displayPerson();
		System.out.println();
		
		System.out.println("All Persons in the List"); 
		po.displayAll();
		System.out.println();
		
		System.out.println("The list of size: "+ po.size());
		
		
		
	}
	}
	
