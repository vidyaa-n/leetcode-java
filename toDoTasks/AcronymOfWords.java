package toDoTasks;

import java.util.ArrayList;
import java.util.List;

public class AcronymOfWords {

	public boolean isAcronym(List<String> words, String s) {
     
		String str ="";
		for(int i = 0; i<words.size(); i++)
		{
			str = str.concat(""+words.get(i).charAt(0));
		}
		return s.equals(str);
    }
	
	public static void main(String[] args) {
		
		AcronymOfWords acr = new AcronymOfWords();
		List<String> words= new ArrayList<>();
		words.add("alice");
		words.add("bob");
		words.add("charles");
		String s = "abc";
		System.out.println(acr.isAcronym(words, s));
				
	}
}
