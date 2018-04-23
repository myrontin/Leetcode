package javaSolution.hashTable.groupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BruteForceSolution {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		Map<Map<Character, Integer>, ArrayList<Integer>> map = new HashMap<>();
		List<Map<Character, Integer>> type = new ArrayList<>();
		for (int x = 0; x < strs.length; x++) {
			Map<Character, Integer> tempMap = new HashMap<>();
			for (int i = 0; i < strs[x].length(); i++) {
				if (!tempMap.containsKey(strs[x].charAt(i)))
					tempMap.put(strs[x].charAt(i), 1);
				else
					tempMap.put(strs[x].charAt(i), tempMap.get(strs[x].charAt(i)) + 1);
			}
			if (map.containsKey(tempMap)) {
				map.get(tempMap).add(x);
			} else {
				map.put(tempMap, new ArrayList<>());
				map.get(tempMap).add(x);
				type.add(tempMap);
			}
		}

		for (Map<Character, Integer> temp : type) {
			List<String> strings = new ArrayList<>();
			for (int j : map.get(temp)) {
				strings.add(strs[j]);
			}
			result.add(strings);
		}

		return result;
	}
}
