package toDoTasks;

import java.util.HashMap;

public class DecodeTheMessage {

	public String decodeMessage(String key, String message) {
        
		HashMap<String,String> msg = new HashMap<String,String>();
		char ch = 'a';
		String str = ""; 
		String key2 = key.replaceAll(" ","");
		for(int i =0; i < key2.length(); i++)
		{
			String getKey = msg.get(""+key2.charAt(i));
			
			if( getKey == null)
			{
				msg.put(""+key2.charAt(i), ""+ch++ );
			}	
		}
		
		for(int j =0; j < message.length(); j++)
		{
			if(msg.get(""+message.charAt(j)) != null)
				str = str.concat(msg.get(""+message.charAt(j)));	
			else
				str = str.concat(" ");
		}
		
		return str;
    }
	
	public static void main(String[] args) {
		
		DecodeTheMessage decode = new DecodeTheMessage();
		String key = "the quick brown fox jumps over the lazy dog";
		String message = "vkbs bs t suepuv";
		System.out.println(decode.decodeMessage(key, message));
	}
}
