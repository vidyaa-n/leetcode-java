package toDoTasks;

public class ReverseString {
	
	public char[] reverseString(char[] s) {
        
		char temp = '0';
        int n = s.length;
        for(int i = 0; i < n/2; i++) {
            temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return s;  
		
    }
}
