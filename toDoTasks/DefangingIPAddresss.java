package toDoTasks;

public class DefangingIPAddresss {

	 public String defangIPaddr(String address) 
	 {
		 return address.replace(".", "[.]");
	 }
	
	public static void main(String[] args) 
	{
		DefangingIPAddresss defang = new DefangingIPAddresss();
		String address = "1.1.1.1";
		String result = defang.defangIPaddr(address);	
		System.out.println(result);		
	}
}
