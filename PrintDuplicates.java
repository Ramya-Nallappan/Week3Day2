package Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		System.out.println("The duplicate Arrays elements are: ");
		for (int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<(list.size()-1);j++)
			{
				if (list.get(i).equals(list.get(j)))
						System.out.println(list.get(i));
			}
		}

	}

}
