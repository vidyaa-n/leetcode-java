package toDoTasks;

public class FinalValueOfStrArr {

	 public int finalValueAfterOperations(String[] operations) 
	 {
		  int val = 0;
	      for(String ch : operations)
	      {
	    	  if(ch.equals("X++") || ch.equals("++X"))
	    	  {
	    		  val=val+1;
	    	  }
	    	  else
	    	  {
	    		  val=val-1;
	    	  }
	      }
	      return val;
	 }
	 
	 public static void main(String[] args) 
	 {
		 FinalValueOfStrArr finalVal = new FinalValueOfStrArr();
		 String[] strArr = {"--X","X++","X++"};
		 int result = finalVal.finalValueAfterOperations(strArr);
		 System.out.println(result);		
	 }
}
