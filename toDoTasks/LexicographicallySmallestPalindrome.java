package toDoTasks;

import java.util.ArrayList;

public class LexicographicallySmallestPalindrome {

	public String makeSmallestPalindrome(String s) {
        
		int strLen = s.length();
		String[] str = new String[s.length()];
		for(int i =0; i<s.length(); i++)
		{
			
			if(s.charAt(i) - '0' < s.charAt(strLen-1) - '0' )
			{
				str[i]=""+s.charAt(i);
				str[strLen-1]=""+s.charAt(i);
			}
			else 
			{
				str[i]=""+s.charAt(strLen-1);
				str[strLen-1]=""+s.charAt(strLen-1);
			}
			
			strLen--;
		}
		return str.toString().join("", str);
    }
	
	public static void main(String[] args) {
		
		LexicographicallySmallestPalindrome s =  new LexicographicallySmallestPalindrome();
		String str1 = "egcfe";
		System.out.println(s.makeSmallestPalindrome(str1));
	}
}
