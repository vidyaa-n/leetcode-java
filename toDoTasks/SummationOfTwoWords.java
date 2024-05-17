package toDoTasks;

public class SummationOfTwoWords {

	public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
		String first = "";
		String second = "";
		String third = "";
		for(int i=0; i<firstWord.length();i++)
		{
			first += ""+(firstWord.charAt(i) - '`'-1);
		}
		for(int i=0; i<secondWord.length();i++)
		{
			second += ""+(secondWord.charAt(i) - '`'-1);
		}
		for(int i=0; i<targetWord.length();i++)
		{
			third += ""+(targetWord.charAt(i) - '`'-1);
		}
		return Integer.parseInt(first) + Integer.parseInt(second) == Integer.parseInt(third) ? true : false;
    }
	
	public static void main(String[] args) {
		boolean res = isSumEqual("acb", "cba", "cdb");
		System.out.println(res);
	}
}
