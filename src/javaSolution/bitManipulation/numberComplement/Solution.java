package javaSolution.bitManipulation.numberComplement;

public class Solution {
	public static int findComplement(int num) {
		String s = Integer.toBinaryString(num);
		s = s.replace('1', '2');
		s = s.replace('0', '1');
		s = s.replace('2', '0');
		return Integer.parseInt(s, 2);
	}
}
