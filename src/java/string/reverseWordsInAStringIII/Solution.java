package java.string.reverseWordsInAStringIII;

public class Solution {
	public String reverseWords(String s) {
		StringBuffer sb = new StringBuffer();
		for (String rev : s.split(" ")) {
			StringBuffer temp = new StringBuffer(rev);
			temp.reverse();
			sb.append(temp + " ");
		}
		return sb.deleteCharAt(sb.length() - 1).toString();
	}
}
