package toDoTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodes {

	/**
	 * @param words
	 * @return
	 */
	@SuppressWarnings("unlikely-arg-type")
	public int uniqueMorseRepresentations(String[] words) {

		Map<String, String> morsemap = new HashMap<String, String>();
		String alph = "abcdefghijklmnopqrstuvwxyz";
		String[] morsecodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String[] wordscode = new String[words.length];
		for (int i = 0; i < 26; i++) {
			if (morsemap.get(alph.charAt(i)) == null) {
				morsemap.put("" + alph.charAt(i), morsecodes[i]);
			}
		}

		for (int j = 0; j < words.length; j++) {
			wordscode[j] = "";
			for (int k = 0; k < words[j].length(); k++) {
				wordscode[j] = wordscode[j].concat("" + morsemap.get("" + words[j].charAt(k)));
			}
		}
		Set<String> uniqueElements = new LinkedHashSet<>(Arrays.asList(wordscode));
		return uniqueElements.toArray(new String[0]).length;
	}

	public static void main(String[] args) {

		UniqueMorseCodes morse = new UniqueMorseCodes();
		String[] s = { "gin", "zen", "gig", "msg" };
		System.out.println(morse.uniqueMorseRepresentations(s));
	}
}
