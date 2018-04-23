package javaSolution.string.Solution;

public class StudentAttendanceRecordI {
	public boolean checkRecord(String s) {
		int L = 0;
		int A = 0;
		for (int i = 0; i < s.length(); i++) {

			if (i >= 2) {
				if (s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {
					L = 1;
				}
			}

			if (s.charAt(i) == 'A') {
				A++;
			}

		}
		if (L == 1 || A > 1)
			return false;

		return true;

	}
}
