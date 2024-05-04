package toDoTasks;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {

	public List<Integer> findWordsContaining(String[] words, char x) {
        
		List<Integer> index = new ArrayList<>();
		CharSequence charSequence = String.valueOf(x);
		for(int i=0; i<words.length;i++)
		{
			if(words[i].contains(charSequence))
			{
				index.add(i);
			}
		}
		return index;
    }
	
	public static void main(String[] args) {
		String[] words = {"leet","code"};
		char x = 'e';
		FindWordsContaining findWrds = new FindWordsContaining();
		List<Integer> result = findWrds.findWordsContaining(words, x);
		System.out.println(result);
	}
}
