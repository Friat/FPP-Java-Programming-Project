package w2labhomeworklesson5;

import java.time.LocalDate;
import java.util.Scanner;

//DeptEmployee class
class DeptEmployee {

	String name;
	LocalDate hireDate;
	protected double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	double computeSalary()
	{
		return salary;
	}
}

//Class Professor 
class Professor extends DeptEmployee {
	int numberOfPublications;
	
	Professor(String name,LocalDate hireDate,double salary,int n)
	{
		this.name=name;
		this.hireDate = hireDate;
		this.salary = salary;
		numberOfPublications = n;
	}
	
	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
		
}

//Secretary class
class Secretary extends DeptEmployee {
	double oTHours;

	Secretary(String name, LocalDate hireDate,double salary,double overTime)
	{
		this.name=name;
		this.hireDate = hireDate;
		this.salary = salary;
		oTHours = overTime;
	}
	public double getOvertimeHours() {
		return oTHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.oTHours = overtimeHours;
	}
	
	double computeSalary()
	{
		return salary +(12*oTHours);
	}
	
}

//Main class
class Q1 {

	public static void main(String[] args)
	{
		Professor prof1 = new Professor("Yonas Gebremariam", LocalDate.of(2010,10,2),5000,4);
		Professor prof2 = new Professor("Friat Mehari", LocalDate.of(2011,9,05),6000,6);
		Professor prof3 = new Professor("Elnatan Yonas", LocalDate.of(2012,10,2),1000,5);
		Secretary sec1 = new Secretary("Meareg Mehari", LocalDate.of(2013,11,15),2000,5);
		Secretary sec2 = new Secretary("Yordanos Mehari", LocalDate.of(2014,1,1),3000,7);
		
		DeptEmployee[] dept = new DeptEmployee[5];
		dept[0]=prof1;
		dept[1]=prof2;
		dept[2]=prof3;
		dept[3]=sec1;
		dept[4]=sec2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Do you want to see sum of salaries of all professors and secretaries in the department (Y/N):");
		char ch =in.nextLine().toLowerCase().charAt(0);
		if(ch=='y')
		{
			double profSalary=0,secSalary = 0,totalSalary;
			for(DeptEmployee d:dept)
			{
				if(d instanceof Secretary)
				{
					Secretary s = (Secretary) d;
					secSalary=secSalary+s.computeSalary();
				}
				else
					profSalary= profSalary+d.computeSalary();
			}
			totalSalary = profSalary + secSalary;
			
			System.out.println("Sum of all professors salary = "+profSalary);
			System.out.println("Sum of all secretary salary  = "+secSalary);
			System.out.println("Sum of total salary = "+totalSalary);
		}
		
	}
}
