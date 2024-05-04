package toDoTasks;

public class CountAsterisks {

	public int countAsterisks(String s) {
        
		int count =0;
		int aster = 0;
		for(int i =0; i<s.length(); i++)
		{
			if(s.charAt(i) == '|')
				count++;
			
			if(count%2 == 0 && s.charAt(i) == '*')
				aster++;
			
		}
		return aster;
    }
	
	public static void main(String[] args) {
		
		CountAsterisks ast = new CountAsterisks();
		String s = "yo|uar|e**|b|e***au|tifu|l";
		System.out.println(ast.countAsterisks(s));
		
	}
}
