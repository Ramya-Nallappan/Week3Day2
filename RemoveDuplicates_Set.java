package Week3Day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates_Set {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] word = text.split(" ");
		Set<String> setText = new LinkedHashSet<String>(Arrays.asList(word));
		
		for (String i : setText)
		{
		System.out.print(i+" ");
		}
	}

}
