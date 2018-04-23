package java.hashTable.findTheDifference;

public class BitManipulationSolution {
	public char findTheDifference(String s, String t) {
		int sVal = 0;
		int tVal = 0;
		for (int i = 0; i < s.length(); i++) {
			sVal += s.charAt(i);
		}
		for (int i = 0; i < t.length(); i++) {
			tVal += t.charAt(i);
		}
		return (char) ((char) tVal - sVal);

	}
}
