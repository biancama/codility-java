// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


class Solution {

	public int solution(int N) {
		int maxBinaryGaps = 0;
		boolean isInAGap = false;
		int binaryGap = 0;
		while (N > 0) {
			if (N % 2 == 0) {
				if (isInAGap) {
					binaryGap++;
				}
			} else {
				isInAGap = true;
				if (binaryGap > maxBinaryGaps) {
					maxBinaryGaps = binaryGap;
				}
				binaryGap = 0;
			}
			N = N / 2;
		}
		return maxBinaryGaps;
	}


}