package toDoTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingsAndRods {

	 public int countPoints(String rings) {
	 
		 Map<Integer, ArrayList<String>> count = new HashMap<Integer, ArrayList<String>>();
		 List<String> myList = new ArrayList<>();
	     int rodCount = 0;
         myList.add("B");
         myList.add("G");
         myList.add("R");
		 for(int i = 0; i < rings.length(); i++)
		 {
			 if((rings.charAt(i) - '0') >= 0 && (rings.charAt(i) - '0') <= 9 )
			 {
				 ArrayList<String> str = new ArrayList<>();
				 if(count.get(rings.charAt(i) - '0') == null)
				 {
					 str.add(""+rings.charAt(i-1));
				 }
				 else
				 {
					 str = count.get(rings.charAt(i) - '0');
					 str.add(""+rings.charAt(i-1));									 
				 }
				 count.put(rings.charAt(i) - '0', str);	
			 }
		 }
		 System.out.println(count);
		 for(Integer k : count.keySet())
		 {
			 if(count.get(k) != null)
			 {
				 ArrayList<String> values = count.get(k);
				 if(values.containsAll(myList) && values.size() >= 3)
				 {
					 rodCount++;
				 }
			 }
		 }		
		 
		 count.clear();
		 myList.clear();
		 return rodCount;
	 }
	 
	 public static void main(String[] args) {
		
		 RingsAndRods rr = new RingsAndRods();
		 String str = "B0R0G0R9R0B0G0";
		 System.out.println(rr.countPoints(str));
	}
	 
}
