package toDoTasks;

import java.util.ArrayList;

public class WordsInSentence {

	 public int mostWordsFound(String[] sentences) {
	        
        int noOfWords =0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(String words1 : sentences)
        {
        	noOfWords=0;
            for(int i = 0; i<words1.length(); i++)
            {
                if(words1.charAt(i) == ' ')
                {
                	noOfWords=noOfWords+1;
                }
            }
            arrayList.add(noOfWords+1);
        }
        int max=0;
        for(int i=0; i<arrayList.size();i++)
        {
        	int current = arrayList.get(i);
            if (current > max) {
                max = current; 
            }
        }
        
        return max;
    }
	 
	public static void main(String[] args) {
		
		String[] sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		WordsInSentence mostWords = new WordsInSentence();
		int result = mostWords.mostWordsFound(sentence);
		System.out.println(result);
	}
}
