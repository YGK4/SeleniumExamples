package returntype.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionExamples {
	
	public ArrayList<Integer> table(int [] tableName) {
		System.out.println("))))))))"+tableName.length);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0; i<tableName.length;i++)
		{
				for (int j = 0; j <= 10; j++) {
					
			//		System.out.println( tableName[i]+" * "+j + "  =  "+    tableName[i]*j);
					arrayList.add(tableName[i]*j);
				}
		}
		
				return arrayList;
	}
	
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,25,56,89,36};
		
		for (int i = 0; i < a.length; i++) {
			
		//	System.out.println(a[i]);
		}
		System.out.println(5*20);

	CollectionExamples collectionExamples	=new CollectionExamples();
	
	
	ArrayList<Integer> ls=collectionExamples.table(a);
	//System.out.println(ls);
	for (int i = 0; i < ls.size(); i++) {
		
		
		System.out.println(ls.get(i));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.get(1);
	}
	}

}
