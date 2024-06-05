package toDoTasks;

public class PrefixOfWordsInSentence {

	public static int isPrefixOfWord(String sentence, String searchWord) {
        
        String[] words = sentence.split(" ");
        int len = searchWord.length();
        for(int i=0; i< words.length;i++)
        {
        	if(words[i].length() >= len && words[i].substring(0, len).contains(searchWord))
        		return i+1;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int val =isPrefixOfWord("i love eating burger", "burg");
		System.out.println(val);
	}
}
