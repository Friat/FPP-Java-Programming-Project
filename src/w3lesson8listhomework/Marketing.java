package w3lesson8listhomework;

import java.util.ArrayList;
import java.util.Comparator;

class ComparatorOverload implements Comparator <Marketing>
{
	// Consistent with equal
	@Override
	public int compare(Marketing m1, Marketing m2){
		String empName1 = m1.employeeName;
		String empName2 = m2.employeeName;
		double salesAmount1 = m1.salesAmount;
		double salesAmount2 = m2.salesAmount;
		
		if(empName1.compareTo(empName2) != 0){
			return empName1.compareTo(empName2);
		}
		return salesAmount1.compareTo(salesAmount2);
	}
	}
public class Marketing 
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
	
	public String toString(){
		return "Employee Name = " + employeeName + " " + "Product Name = " + productName +" " + "saleAmount = " + salesAmount;
	}

	public static void main(String[] args)
	{
		ArrayList <Marketing> mList = new ArrayList<Marketing>();
		System.out.println("Initial Size of mList = " + mList.size());
		
		Marketing m1 = new Marketing("Friat", "Apple Laptop",3000 );
		Marketing m2 = new Marketing("Tinbit", "Lenovo", 1000);
		Marketing m3 = new Marketing("Yordanos", "Mobile", 500);
		Marketing m4 = new Marketing("Kidist", "Book", 300);
		
		mList.add(m1);
		mList.add(m2);
		mList.add(m3);
		mList.add(m4);
		
		System.out.println("Size of mList after adding the objects = " + mList.size());
		
		mList.set(2,m1);// replace m2 with m1
		
		//System.out.println("The objects deletion = " + "\n"+ mList);
		
		Marketing[] temp = new Marketing[mList.size()];
		for(int k =0; k < mList.size(); k++){
			temp[k] = mList.get(k);
			
			System.out.println(mList.get(k)+ " ");
		}
		
		mList.remove(m2);
		//mList.remove(m4);
		
		// Sort
		//mList.so
		
		System.out.println("After removal");
		
		for(int k =0; k < mList.size(); k++){
			temp[k] = mList.get(k);
			
			System.out.println(mList.get(k)+ " ");
		}
		
		//System.out.println("Size of mList after deleting objects = " + mList.size());
	}

}
