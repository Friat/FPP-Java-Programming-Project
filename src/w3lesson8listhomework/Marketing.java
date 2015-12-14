package w3lesson8listhomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Marketing implements Comparator<Marketing>
{
	String employeeName;
	String productName;
	double salesAmount;
    
	public Marketing(String employeeName, String productName, int salesAmount)
	{
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}
	
	public Marketing() {
		// TODO Auto-generated constructor stub
	}

	public String getemployeeName() {
		return employeeName;
	}

	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getsalesAmount() {
		return salesAmount;
	}

	public void setsalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}

	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Marketing)) return false;
		Marketing e = (Marketing)ob;
		return e.employeeName.equals(employeeName) && e.productName.equals(productName) && Double.doubleToLongBits(e.salesAmount) != Double
				.doubleToLongBits(salesAmount);
	}
	
	public static final Comparator ENAME = new Comparator(){
		public int compare(Object o1, Object o2){

			String name1 = ((Marketing)o1).getemployeeName();
			String name2 = ((Marketing)o1).getemployeeName(); 
			return name1.compareTo(name2);
		}
	};
	
	public static final Comparator SALESAMT = new Comparator(){
		public int compare(Object o1, Object o2){
	
			Double amt1 =new Double(((Marketing)o1).getsalesAmount());
			Double amt2 =new Double(((Marketing)o1).getsalesAmount());
			return amt1.compareTo(amt2);
		}
	};
	public String toString()
	{
		return "Employee Name = " + employeeName + " " + "Product Name = " + productName +" " + "saleAmount = " + salesAmount;
	}
	
	@Override
	public int compare(Marketing o1, Marketing o2) {
		// TODO Auto-generated method stub
		return o1.getemployeeName().compareTo(o2.getemployeeName());
	}
	

	public static void main(String[] args)
	{
		ArrayList <Marketing> mList = new ArrayList<Marketing>();
		System.out.println("Initial Size of mList = " + mList.size());
		
		Marketing m1 = new Marketing("Friat", "Apple Laptop",3000 );
		Marketing m2 = new Marketing("Tinbit", "Lenovo", 1000);
		Marketing m3 = new Marketing("Yordanos", "Mobile", 500);
		Marketing m4 = new Marketing("Kidist", "Book", 300);
		
		System.out.print("Adding the objects to the array list");
		mList.add(m1);
		mList.add(m2);
		mList.add(m3);
		mList.add(m4);
		
		System.out.println();
		System.out.println("Size of mList after adding the objects = " + mList.size());
		
		System.out.println();
		System.out.println("After removing index 1 from the ArrayList");
		mList.remove(1);//removing at index 1
		System.out.println(mList);
		
		mList.set(2,m1);// replace m2 with m1
		
		System.out.println();
		System.out.println("list of the available objects");
		System.out.println();
		
		Marketing[] temp = new Marketing[mList.size()];
		for(int k =0; k < mList.size(); k++){
			temp[k] = mList.get(k);
			
			System.out.println(mList.get(k)+ " ");
		}
		
				
		// System.out.println("The list of objects after removing some elements: ");
		System.out.println();
		
		for(int k =0; k < mList.size(); k++){
			temp[k] = mList.get(k);
			
			System.out.println(mList.get(k)+ " ");
		}
		
		Marketing market = new Marketing();
		SalesComparator sales = new SalesComparator();
		//Sorting by employee name
		Collections.sort(mList, market);// Marketing.ENAME);
		
		System.out.println("After sort by Employee Name: ");
		for(int i=0; i<mList.size(); i++){
			Marketing mk = mList.get(i);
			System.out.println(mk.getemployeeName());
		}
		
		
		Collections.sort(mList,sales);//Marketing.SALESAMT);
		System.out.println("After sort by sales amount: ");
		for(int i=0; i<mList.size(); i++){
			Marketing mk = mList.get(i);
			System.out.println(mk.getsalesAmount());
		}   
	
		
		System.out.println();
		System.out.println("Size of mList after deleting objects = " + mList.size());
	}

}
