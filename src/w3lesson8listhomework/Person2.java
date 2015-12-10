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
	System.out.println( firstName + " " + lastName+" "+ " "+ age);
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
private int size;
public PersonArrayOpe(int max) // constructor to initialize person array with size max and nElems;
{
	 nElems = 3;
	a = new Person2[max];
	size = nElems;
	
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
	int lastindex = a.length;
	resize();
	a[lastindex] = a1;
	++size;
	
}
public boolean delete(String searchName) // Shift down the elements. Argument should be lastname
{ 
	if(size == 0) return false;
	int index = -1;
	for(int i = 0; i < size; i++)
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
	--size;
	return true;
	
}
public void displayAll() // displays array contents
{
	for(int i = 0; i < size; i++){
		a[i].displayPerson();
	}
}
public int size() // Return the number of persons stored in the array
{
	return size;
}

private void resize()
{
	System.out.println("Array resizing:");
	int len = a.length;
	int newlen = 2 * len;
	Person2[] a1 = new Person2[newlen];
	System.arraycopy(a,0,a1,0 , len);
	a=a1;
} 
public static void main(String[] args)
{
	
	Person2 p1 = new Person2("Hadush", "Friat", 27);
	Person2 p2 = new Person2("Hirut", "Tinbit", 29);
	Person2 p3 = new Person2("Haile", "Eden", 16);
	
	PersonArrayOpe po= new PersonArrayOpe(4);
	po.a[0]=p1;
	po.a[1]=p2;
	po.a[2]=p3;
	
	System.out.println("Size of the array originally: "+ po.size());
	po.delete("Hadush");
	System.out.println("The size of list after deletion: "+ po.size());
	po.insert("Yonas", "Elnatan", 3);
	System.out.println("The size of list after insertion: "+ po.size());
	System.out.println("All Persons"); 
		//po.displayAll();
	
	
	
}
}

