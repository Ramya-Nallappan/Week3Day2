package Week3Day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_Set {

	public static void main(String[] args) {
		Set<Integer> list1 = new HashSet<Integer>(Arrays.asList(3,2,11,4,6,7));
		Set<Integer> list2 = new HashSet<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		for (int l1 : list1)
		{
			for (int l2 : list2 )
			{
				if (l1==l2)
				
					System.out.println(l1);
			}
				
				
		}

	}

}
