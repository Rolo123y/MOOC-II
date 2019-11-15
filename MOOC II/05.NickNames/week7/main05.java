package week7;

import java.util.HashMap;

public class main05 {

	public static void main(String[] args) {
		HashMap<String, String> Nicknames = new HashMap<>();

		Nicknames.put("matti", "mage");
		Nicknames.put("mikael", "mixu");
		Nicknames.put("arto", "arppa");
		
		String mikaelNickname = Nicknames.get("mikael");
		System.out.println("mikale's nickname is "+ mikaelNickname);

	}

}
