package java.bitManipulation.primeNumberOfSetBitsInBinaryRepresentation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int countPrimeSetBits(int L, int R) {
		int result = 0;
		Set<Integer> set = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
		while (L <= R) {
			if (set.contains(Integer.bitCount(L)))
				result++;
			L++;
		}
		return result;
	}
}
