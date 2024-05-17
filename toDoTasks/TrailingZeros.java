package toDoTasks;

public class TrailingZeros {

	public String removeTrailingZeros(String num) {
        
        int len = num.length();
        for(int i=len-1; i >=0; i--)
        {
            if(num.charAt(i) == '0')
            {
                num = num.substring(0,i);
            }
            else
            {
                break;
            }
        }
        return num;
    }
}
