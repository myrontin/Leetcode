package javaSolution.string.reverseStringII;

public class CharArraySolution {
	public String reverseStr(String s, int k) {
		char[] ch = s.toCharArray();
		int n = ch.length - 1;
		int i = 0;
		while (i < n) {
			int j = Math.min(i + k - 1, ch.length - 1);
			swap(ch, i, j);
			i += 2 * k;
		}
		return String.valueOf(ch);
	}

	public void swap(char[] ch, int start, int end) {
		while (start < end) {
			char temp = ch[start];
			ch[start++] = ch[end];
			ch[end--] = temp;
		}
	}
}
