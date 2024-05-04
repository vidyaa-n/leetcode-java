package toDoTasks;

public class SplitStrings 
{
	public int balancedStringSplit(String s) 
	{
		int max=0;
		int balance = 0;
		char a = s.charAt(0);
        for(int i=0; i<s.length();i++)
        {        	
        	if(s.charAt(i) == a)
        	{
        		max++;         		    		
        	}
        	else 
        	{  
        		max--;
        		if(max == 0)
        		{
        			balance++;
        			try
        			{
        				a=s.charAt(i+1);
        			}
        			catch(StringIndexOutOfBoundsException e)
        			{
        				return balance;
        			}
        		}    
        	} 
        }
		return balance;
    }
	
	public static void main(String[] args) {
		
		String s = "LLLLRRRR";
		SplitStrings call = new SplitStrings();
		int result = call.balancedStringSplit(s);
		System.out.println(result);
	}
}
