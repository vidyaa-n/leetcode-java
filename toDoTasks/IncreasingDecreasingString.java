package toDoTasks;

public class IncreasingDecreasingString {

	public String sortString(String s) {
		
		String str ="";
		int slen = s.length();
		int strlen = 0;
		while(slen != strlen)
		{
			for(char ch = 'a'; ch<='z'; ch++)
			{
                int index = s.indexOf(ch);
				if(index != -1)
				{
		            s = s.substring(0, index) + s.substring(index + 1);
		            str = str.concat(""+ch);
				}					
			}	
			
			for(char ch = 'z'; ch>='a'; ch--)
			{
                int index = s.indexOf(ch);
				if(index != -1)
				{
					s = s.substring(0, index) + s.substring(index + 1);
					str = str.concat(""+ch);
				}					
			}		
			strlen = str.length();
		}		
		return str;  
	}
	
	public static void main(String[] args) {
		IncreasingDecreasingString st = new IncreasingDecreasingString();
		String str = st.sortString("rat");
		System.out.println(str);
	}
}
