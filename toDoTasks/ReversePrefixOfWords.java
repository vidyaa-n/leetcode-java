package toDoTasks;

public class ReversePrefixOfWords {

	public String reversePrefix(String word, char ch) {
        String str="";
        int index = word.indexOf(""+ch, 0);
        if(index != -1)
        {
        	for(int i=index; i>=0;i--)
            {
                str = str.concat(""+word.charAt(i));
            }
            for(int j=index; j<word.length();j++)
            {
                str = str.concat(""+word.charAt(j));
            }
        }
        else
        {
        	str=word;
        }
        return str;
    }
	
	public static void main(String[] args) {
		
		ReversePrefixOfWords rev = new ReversePrefixOfWords();
		String words = "abcd";
		char ch = 'z';
		System.out.println(rev.reversePrefix(words, ch));
	}
}
