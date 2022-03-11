package Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection_List {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		for (int i=0;i<list1.size();i++)
		{
			if (list1.get(i).equals(list2.get(i)))
					System.out.println(list1.get(i));
					
		}
	}

}
