package Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
public class RemoveDuplicates_List {

	public static void main(String[] args) 
	{
		String text = "I I am am Ramya Ramya";	
         String word[] =text.split(" ");
         List<String> list = new ArrayList<String>(Arrays.asList(word));
         
        System.out.println(list);
        
        for (int i=0;i<list.size();i++)
        {
        	for(int j=i+1;j<list.size();j++)
        	{
        		if (list.get(i).equals(list.get(j)))
        		{
        			list.remove(j);
        			
        		}
        			
        	}
        	System.out.println(list.get(i));
        }
        
        
	}
}

*/

public class RemoveDuplicates_List {

	public static void main(String[] args) {
		String text = "I am Ramya I am Ramya";	
         String word[] =text.split(" ");
         
         
         for (int i=0;i<word.length;i++)
         {
        	
        	 for (int j=i+1;j<word.length;j++)
        	 {
        		
        		 if ((word[i]).equals(word[j]))
        		 
        			 {
             		       
             		    	  word[j]= "";
        			 }           		 
        		     
        	 }
        	 
        	 System.out.print(word[i]+" ");
        	 
         }
         
    		 
         }
	
	}
	


