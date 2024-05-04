package toDoTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemsMatchingRule {

	 public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	        
		int matchFound = 0;
        for(List<String> item : items)
        {            
            if(ruleKey.equals("type") && item.get(0).equals(ruleValue))
            {
                matchFound++;
            }
            else if(ruleKey.equals("color") && item.get(1).equals(ruleValue))
            {
                matchFound++;
            }
            else if(ruleKey.equals("name") && item.get(2).equals(ruleValue))
            {
                matchFound++;
            }
        }
        return matchFound;
    }
	 
	public static void main(String[] args) {
		
		List<List<String>> items = new ArrayList<>();

        List<String> item1 = Arrays.asList("phone", "blue", "pixel");
        List<String> item2 = Arrays.asList("computer", "silver", "lenovo");
        List<String> item3 = Arrays.asList("phone", "gold", "iphone");

        items.add(item1);
        items.add(item2);
        items.add(item3);
		
        ItemsMatchingRule count = new ItemsMatchingRule();
        int result = count.countMatches(items, "color", "silver");
        System.out.println(result);
	}
}
