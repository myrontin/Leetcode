package java.string.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> fizzBuzz(int n) {

		List<String> list = new ArrayList<>();
		for (int i = 1; i < n + 1; i++) {

			if (i % 3 != 0 && i % 5 != 0) {
				list.add(Integer.toString(i));
			} else if (i % (3 * 5) == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			}
		}
		return list;
	}
}
