package java.backTracking.combinationSumIII;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<>();
		boolean[] isUsed = new boolean[9];
		combinationSum3(result, new ArrayList<>(), isUsed, k, n, 0);

		return result;
	}

	public static void combinationSum3(List<List<Integer>> result, List<Integer> temp, boolean[] isUsed, int k, int n,
			int start) {
		if (temp.size() == k) {
			int sum = 0;
			for (Integer i : temp) {
				sum += i;
			}
			if (sum == n)
				result.add(new ArrayList<>(temp));
		}
		for (int i = start; i <isUsed.length; i++) {
			if (isUsed[i])
				continue;
			temp.add(i + 1);
			isUsed[i] = true;
			combinationSum3(result, temp, isUsed, k, n, i + 1);
			temp.remove(temp.size() - 1);
			isUsed[i] = false;
		}

	}

	public static void main(String[] args) {
		combinationSum3(2, 6);
	}
}
