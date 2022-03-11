//Classroom Assignment 1 - Print Duplicate names in the List = {Adam,Ben,Zara,Adam,Charlie,James,Ben}
package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class ClassroomAssignment1_List {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
		System.out.println(list);
		
		for (int i=0;i<list.size();i++)
		{
			for (int j=i+1;j<list.size();j++)
			{
			
			if (list.get(i).equals(list.get(j)))
				System.out.println(list.get(i));
		
			}}
	}

}
