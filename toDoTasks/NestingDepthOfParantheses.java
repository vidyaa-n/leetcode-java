package toDoTasks;

public class NestingDepthOfParantheses {

	public int maxDepth(String s) {
       
		int res =0;
		int curr =0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == '('){ 
		         res=Math.max(res,++curr);
		     }
		     if(s.charAt(i) == ')'){
		         curr--;
		     }
		}
		return res;
    }
	
	public int numberOfLeftBrackets(int index, String s)
	{
		int leftCount = 0;
		for(int i =index; i >= 0; i--)
		{
			if(s.charAt(i) == '(')
			{
				leftCount++;
			}
			else if(s.charAt(i) == ')')
			{
				leftCount--;
			}
		}
		return leftCount;
	}
	
	public int numberOfRightBrackets(int index, String s)
	{
		int rightCount = 0;
		int leftCount = 0;
		for(int i =index; i < s.length(); i++)
		{
			if(s.charAt(i) == ')')
			{
				rightCount++;
			}
		}
		return rightCount-leftCount;
	}

	
	public static void main(String[] args) {
		
		NestingDepthOfParantheses vpa = new NestingDepthOfParantheses();
		String str = "8*((1*(5+6))*(8/6))";
		System.out.println(vpa.maxDepth(str));

	}
}