package javaSolution.backTracking.permutationSequence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static String getPermutation(int n, int k) {
		// numbers
		List<Integer> numbers = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			numbers.add(i + 1);
		}
		// factorial
		int[] factorial = new int[n + 1];
		factorial[0] = 1;
		for (int i = 1; i < n + 1; i++) {
			factorial[i] = i * factorial[i - 1];
		}
		k -= 1;

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <n+1; i++) {
			int num = k / factorial[n-i];   //get the index of the number
			k = k -num*factorial[n-i];		//new k = whatever left in the list
			sb.append(numbers.get(num));
			numbers.remove(num);
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(getPermutation(4, 10));
	}
}
