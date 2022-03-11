//Classroom Assignment 2 - Print the number of times the name "Adam" occurred = {Adam,Ben,Zara,Adam,Charlie,James,Ben,Adam,George,Adam}
package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class ClassroomAssignment1_List_ForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
		list.add("Adam");
		list.add("George");
		list.add("Adam");
		System.out.println(list);

		int count = 0;
		/*
		 * for (int i=0;i<list.size();i++)
		 */
		for (String name : list)
		{
			if(name=="Adam")
				count =count+1;
		
}
		System.out.println("The no.of times the name Adam has occured is " +count);
}
}
