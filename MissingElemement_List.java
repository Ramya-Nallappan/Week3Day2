package Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElemement_List {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		Collections.sort(list);
		
		for (int i=0;i<list.size();i++)
		{
			if ((i+1)!=(list.get(i)))
			{	System.out.println("The misisng Element is: " +(i+1));
			     break;
			}
		}
          
          
	}

}
