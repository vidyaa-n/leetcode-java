package toDoTasks;

public class GoalParser 
{
	public String interpret(String command) 
	{
		String goal="";
		
		for(int i =0; i< command.length(); i++)
		{
			if(command.charAt(i) == '(' && command.charAt(i+1) == ')')
			{
				goal=goal.concat("o");
			}
			else if(command.charAt(i) == 'a' && command.charAt(i+1) == 'l')
			{
				goal=goal.concat("al");
			}
			else if(command.charAt(i) == 'G')
			{
				goal=goal.concat("G");
			}
		}
		return goal;
    }
	
	public static void main(String[] args) {
		
		String command = "G()(al)";
		GoalParser interpret = new GoalParser();
		String goal = interpret.interpret(command);
		System.out.println(goal);
	}
}
