package java.string.reverseStringII;

public class StringBuilderSolution {
	public String reverseStr(String s, int k) {
		if (k > s.length()) {
			StringBuilder sb = new StringBuilder(s);
			return sb.reverse().toString();
		}
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < s.length()) {

			if (i + k > s.length()) {
				sb.append(reverseStr(s.substring(i)));
			} else {
				sb.append(reverseStr(s.substring(i, i + k)));
			}
			i += k;
			if (i > s.length())
				break;
			if (i + k > s.length()) {
				sb.append(s.substring(i));
			} else {
				sb.append(s.substring(i, i + k));
			}
			i += k;
		}
		return sb.toString();
	}

	public String reverseStr(String s) {
		StringBuilder sb = new StringBuilder();
		return sb.append(s).reverse().toString();
	}
}
