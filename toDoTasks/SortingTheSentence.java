package toDoTasks;

public class SortingTheSentence {

	public String sortSentence(String s) {
        
		String[] str = s.split(" ");
		String[] t = new String[str.length];
		for(int i =0; i<str.length; i++)
		{
			int index = str[i].charAt(str[i].length()-1) - '0';
			t[index-1]=str[i];
			t[index-1]=t[index-1].substring(0, t[index-1].length()-1);
		}
		
		return String.join(" ", t);
    }
	
	public static void main(String[] args) {
		
		SortingTheSentence sort = new SortingTheSentence();
		String s = "is2 sentence4 This1 a3";
		System.out.println(sort.sortSentence(s));
	}
}
