package java.hashTable.findTheDifference;

import java.util.Arrays;

public class CompareCharArraySolution {
	public char findTheDifference(String s, String t) {
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		Arrays.sort(cs);
		Arrays.sort(ct);
		for (int i = 0; i < ct.length; i++) {
			try {
				if (cs[i] != ct[i])
					return ct[i];
			} catch (ArrayIndexOutOfBoundsException e) {
				return ct[ct.length - 1];
			}
		}
		return cs[0];

	}
}
