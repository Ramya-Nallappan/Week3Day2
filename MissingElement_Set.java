package Week3Day2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement_Set {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<Integer>(Arrays.asList(2,3,1,4,7,6,8));
		int count =0;
		System.out.println("The sorted elements are" +set1);
		for(int i : set1)
		{
			count=count+1;
			if (count!=i)
			{
				System.out.println("The Missing number is " + count);
			break;
		}
		
		}

	}

}
