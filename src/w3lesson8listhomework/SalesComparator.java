package w3lesson8listhomework;

import java.util.Comparator;


public class SalesComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing o1, Marketing o2) {
		// TODO Auto-generated method stub
		Double amt1= o1.getsalesAmount();
		Double amt2 = o2.getsalesAmount();
		return amt1.compareTo(amt2);
	}

}