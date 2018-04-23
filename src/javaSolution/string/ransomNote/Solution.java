package javaSolution.string.ransomNote;

public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		StringBuilder sb = new StringBuilder(magazine);
		for (int i = 0; i < ransomNote.length(); i++) {
			if (sb.toString().indexOf(ransomNote.charAt(i)) == -1)
				return false;
			if (sb.toString().indexOf(ransomNote.charAt(i)) != -1) {
				sb.deleteCharAt(sb.toString().indexOf(ransomNote.charAt(i)));
			}
		}
		return true;
	}
}
