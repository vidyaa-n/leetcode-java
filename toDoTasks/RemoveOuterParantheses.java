package toDoTasks;

public class RemoveOuterParantheses {

	public String removeOuterParentheses(String s) 
	{  
		String[] str = new String[s.length()];
		String st ="";
		int count = 0;
		int index = 0;
		for(int i=0; i<s.length(); i++)
		{	
			if(s.charAt(i) == '(')
				count++;
			else
				count--;
			
			if(str[index] == null) str[index] = "";		
			str[index] = str[index].concat(""+s.charAt(i));
			if(count == 0)
			{						
				index++;
			}						
		}
		
		for(int j =0; j<str.length;j++)
		{
			if(str[j] != null)
				st= st.concat(str[j].substring(1, str[j].length()-1));
		}
		return st;
    }
	
	public static void main(String[] args) {
		
		RemoveOuterParantheses removeOuter = new RemoveOuterParantheses();
		String str = "(()())(())";
		System.out.println(removeOuter.removeOuterParentheses(str));
	}
}
