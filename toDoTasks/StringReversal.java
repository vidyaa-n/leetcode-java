package toDoTasks;

import java.util.Scanner;

public class StringReversal {
	
	public static void main(String[] args) 
	{
		String reverseStr = "";
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A String To Reverse: ");
        String myStr = scanner.nextLine();
        scanner.close();
		
		for(int i = myStr.length()-1; i>=0; i--)
		{
			reverseStr=reverseStr.concat(String.valueOf(myStr.charAt(i)));
		}
		
		/*
			Another efficient way of solving this - using StringBuilder for performing String manipulations
			
			 StringBuilder reverseStr= new StringBuilder(myStr).reverse();			
		*/
		
		System.out.println(myStr);
		System.out.println(reverseStr);
	}	
}
 
