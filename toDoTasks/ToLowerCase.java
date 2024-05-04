package toDoTasks;

public class ToLowerCase {

	public String toLowerCase(String s) {

		/*
		 * StringBuilder str = new StringBuilder();
		 * 
		 * for(int i =0; i < s.length(); i++) { char ch = (char) (s.charAt(i)+32); str =
		 * str.append(ch); }
		 * 
		 * return str.toString();
		 */
		
		char[] str=s.toCharArray();
        for (int i=0;i<str.length;i++){
            if('A'<=str[i] && str[i]<='Z'){
                str[i]+=32;
            }
        }
        String word="";
        for(char c:str){
            word+=c;
        }
        return word;
    }
	
	public static void main(String[] args) {
		
		ToLowerCase lc = new ToLowerCase();
		String s = "HELLO";
		System.out.println(lc.toLowerCase(s));
	}
}
