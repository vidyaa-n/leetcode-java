package toDoTasks;

public class PanagramSentence {

	 public boolean checkIfPangram(String sentence) {
		 
		 String aph = "abcdefghijklmnopqrstuvwxyz";
		 
		 for(int i = 0; i<aph.length(); i++)
		 {
			 if(!sentence.contains(""+aph.charAt(i)))
				 return false;
		 }
         return true;
	 }
}
