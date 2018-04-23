package java.array.oneBitAndTwoBitCharacters;

public class Solution {
	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		while (i < bits.length) {
			if (bits[i] == 0) {
				bits[i] = 3;
				i++;
			} else {
				bits[i] = 2;
				bits[i + 1] = 2;
				i += 2;
			}
		}
		return (bits[bits.length - 1] == 3);
	}
}
