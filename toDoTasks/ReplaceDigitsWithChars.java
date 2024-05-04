package toDoTasks;

public class ReplaceDigitsWithChars {

	public String replaceDigits(String s) {
      
		String str="";
		for(int i = 0; i < s.length(); i++)
		{
			if(i%2 != 0)
			{
				char ch = (char) (s.charAt(i-1)+ (s.charAt(i) -'0'));
				str = str.concat(""+ch);
			}	
			else
			{
				str = str.concat(""+s.charAt(i));
			}			
		}
		return str;
    }
	
	public static void main(String[] args) {
		
		ReplaceDigitsWithChars rep = new ReplaceDigitsWithChars();
		String s = "a1c1e1";
		System.out.println(rep.replaceDigits(s));
	}
}
