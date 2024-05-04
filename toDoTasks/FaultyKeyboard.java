package toDoTasks;

public class FaultyKeyboard {

	 public String finalString(String s) {
	 
		 StringBuilder st=new StringBuilder();
		 for(int i =0; i< s.length(); i++)
		 {
			 if(s.charAt(i) != 'i')
				 st = st.append(""+s.charAt(i));
			 else
				st= st.reverse();
		 }
		 return st.toString();
	 }
	 
	 public static void main(String[] args) {
		
		 FaultyKeyboard key = new FaultyKeyboard();
		 String s = "string";
		 System.out.println(key.finalString(s));
	 }
}
