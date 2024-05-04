package toDoTasks;

public class JewelsAndStones 
{
	public int numJewelsInStones(String jewels, String stones) {
        
		int numOfStones = 0;
		for(char i =0; i < jewels.length(); i++)
		{
			for(char j =0; j < stones.length(); j++)
			{
				if(jewels.charAt(i) == stones.charAt(j))
				{
					numOfStones++;
				}
			}
		}
		return numOfStones;
    }
	
	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		JewelsAndStones jewelNstones = new JewelsAndStones();
		int result = jewelNstones.numJewelsInStones(jewels, stones);
		System.out.println(result);
	}
}
