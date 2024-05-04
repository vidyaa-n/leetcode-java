package toDoTasks;

public class ReverseStringInSentence {

	public String reverseWords(String s) {
        
		String[] str = s.split(" ");
		String sentence = "";
		for(int i = 0; i<str.length; i ++)
		{
			for(int j =str[i].length()-1; j>=0; j--)
			{
				sentence+=str[i].charAt(j);
			}
			sentence+=" ";
		}
		
		return sentence.trim();
    }
	
	public static void main(String[] args) {
		
		ReverseStringInSentence rev = new ReverseStringInSentence();
		String s = "Let's take LeetCode contest";
		System.out.println(rev.reverseWords(s));
	}
}
