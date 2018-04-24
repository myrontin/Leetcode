package javaSolution.backTracking.permutationSequence;

import java.util.ArrayList;
import java.util.List;

public class BruteForceSolution {
	public static String getPermutation(int n, int k) {
		List<String> allPerm = getAllPerm(new ArrayList<>(), "", n, new int[n]);
		return allPerm.get(k - 1);
	}

	public static List<String> getAllPerm(List<String> result, String s, int end, int[] nums) {
		if (s.length() == end)
			result.add(new String(s));
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				continue;
			s = s + (i + 1);
			nums[i] = 1;
			getAllPerm(result, s, end, nums);
			nums[i] = 0;
			s = s.substring(0, s.length() - 1);
		}
		return result;
	}

	public static void main(String[] args) {


		System.out.println(getPermutation(9, 24));
	}

}
