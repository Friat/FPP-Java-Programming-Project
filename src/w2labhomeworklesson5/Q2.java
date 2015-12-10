package w2labhomeworklesson5;


//class Computer

class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;

	Computer(String manufacturer, String processor, int ramsize,int disksize, double processorSpeed)
	{
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramsize;
		this.diskSize = disksize;
		this.processorSpeed = processorSpeed;
	}
	
	public int getRamSize() {
		return ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	double computePower()
	{
		// return ramSize multiplied by processorSpeed
		return ramSize*processorSpeed;
	}

}

//NoteBook
class NoteBook extends Computer {
	double height;
	double width;
	double weight;
	
	NoteBook(double height, double width, double weight,String manufacturer, String processor, int ramsize,int disksize, double processorSpeed)
	{
		super(manufacturer, processor,ramsize,disksize,processorSpeed);
		this.height = height;
		this.width = width;
		this.weight = weight;
	}

	double screensize()
	{
		
		return height*width;
	}

}

//Main class
class Q2 {

	public static void main(String[] args)
	{
		NoteBook obj = new NoteBook(3.2, 4.0, 10.0,"Apple", "Lenovo", 8,450, 2.1);
		
		System.out.println("Ram size: "+obj.getRamSize());
		System.out.println("Disk size: "+obj.getDiskSize());
		System.out.println("Processor speed: "+obj.getProcessorSpeed());
		
		System.out.println("Computer Power: "+obj.computePower());
		System.out.println("Screen size :"+obj.screensize());
	}
}

