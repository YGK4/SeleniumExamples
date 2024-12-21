package UltimateQA;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class FindingMidnumbers {
   
	ArrayList<Integer> arrayList = new ArrayList<Integer>();

	
	@Test
	public void findingMidnumbers () {
		
	for (int i = 4; i < 45; i++) {
		arrayList.add(i);
		
	}
	int pos=arrayList.size()/2;
	arrayList.get(pos);
	    
	    System.out.println(arrayList.get(arrayList.size()/2));
		
	}	
}
