package toDoTasks;

public class SpecialTypeWriter {

	public static int minTimeToType(String word) {
     
		int len = word.length();
		int count = 0;
		char prev = 'a';
		for(int i=0; i<len;i++) 
		{
			char ch = word.charAt(i);
			int diff = Math.abs(ch - prev);
            count += Math.min(diff, 26 - diff);
            prev = ch;
            count++;
		}
		return count;
    }
	
	public static void main(String[] args) {
		 
		int res = minTimeToType("bza");
		System.out.println(res);
	}
}
