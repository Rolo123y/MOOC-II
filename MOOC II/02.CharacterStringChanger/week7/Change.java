package week7;

public class Change {
	
	private char fromCharacter;
	private char toCharacter;

	public Change(char fromCharacter, char toCharacter) {
		this.fromCharacter = fromCharacter;
		this.toCharacter = toCharacter;
	}

	public String change(String word) {
		// String newWord = "";
		// for (int i = 0; i < word.length(); i++) {
		// char n = word.charAt(i);
		// if (n == fromCharacter) {
		// newWord += toCharacter;
		// } else {
		// newWord += word.charAt(i);
		// }
		// }
		// return newWord;
		return word.replace(fromCharacter, toCharacter);
	}
}
