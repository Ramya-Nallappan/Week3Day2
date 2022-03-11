package Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

     List<Integer> list = new ArrayList<Integer>();
     list.add(3);
     list.add(2);
     list.add(11);
     list.add(4);
     list.add(6);
     list.add(7);
     Collections.sort(list);
     System.out.println("The sorted list is: " + list);
     int count = list.size();
     System.out.println("The second largest number is: " + list.get(count-2));
     
	}

}

/* Appraoch 2: Passing all elements in a ArrayList
public class FindSecondLargest {

	public static void main(String[] args) {

     List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
     Collections.sort(list);
     System.out.println("The sorted list is: " + list);
     int count = list.size();
     System.out.println("The second largest number is: " + list.get(count-2));
     
	}

}
*/