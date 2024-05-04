package toDoTasks;

public class StringHalves {

	public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int countFirst = countVowels(s.substring(0, s.length() / 2), vowels);
        int countSecond = countVowels(s.substring(s.length() / 2), vowels);
        return countFirst == countSecond;
    }
    
    private int countVowels(String str, String vowels) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
