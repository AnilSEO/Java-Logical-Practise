package sv.javatest.pattern;

import java.util.HashMap;
import java.util.Map;

public class FindLastDuplicateChar {

	public FindLastDuplicateChar() {
		// TODO Auto-generated constructor stub
	}
	
	public void printlastRepeatingChar(String str) {
		//ignore white spaces and cases
		str = str.replaceAll("\\s", "").toLowerCase();
		
		char[] charArr = str.toCharArray();
		
		Map<Character,Integer> charCountmap = new HashMap<>();
		
		for (int i = 0; i < charArr.length; i++) {
			if (charCountmap.containsKey(charArr[i])) {
				charCountmap.put(charArr[i], charCountmap.get(charArr[i]) + 1);
			} else {
				charCountmap.put(charArr[i], 1);
			}
		} 
		
		for (int i = charArr.length - 1; i >= 0 ; i--) {
			if (charCountmap.get(charArr[i]) > 1) {
				System.out.println("Last repeating char:"+charArr[i]+" having count:"+charCountmap.get(charArr[i]));
				break;
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		String str = "ADP is a product based company";
		
		FindLastDuplicateChar obj = new FindLastDuplicateChar();
		obj.printlastRepeatingChar(str);
	}

}
