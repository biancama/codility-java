package com.biancama.codility.multiplicativepair;

/**
 * Created by massimo on 14/09/16.
 */
public class MultiplicativePair {
	public static final long ONE_MILLION = 1000000;
	public static final int LIMIT = 1000000000;

	public int solution(int[] A, int[] B) {
		// need to redo algebra term is such that B >= A/A-1
		//so if A < 1 only possible if C[a] =0 and C[b] = 0
		//if A < 2 is impossible since sorted
		//if A > possible

		if (A.length < 2) { return 0;}
		int numberOfMultiplicativePairs = 0;
		int lowIndex = 0;
		int highIndex = A.length-1;

		if (A[0] == 0 && B [0] == 0) {
			int index = 1;
			int increaseAmount = 1;
			while (A[index] == 0 && B[index] == 0) {
				numberOfMultiplicativePairs += increaseAmount;
				increaseAmount++;
			}

		}

		while(lowIndex < highIndex){
			//don't convert to double to avoid precision errors
			long convertedLow = convertValue(A[lowIndex], B[lowIndex]);
			long convertedHigh;
			//avoid useless calculations for values we already know will fail
			if(convertedLow >= ONE_MILLION) {
				convertedLow = convertValue(A[lowIndex], B[lowIndex]);
				convertedHigh = convertValue(A[highIndex], B[highIndex]);
				//note that since both inputs to the product were scaled, we need to scale the sum twice
				//not a scaleable solution...
				if( convertedLow * convertedHigh >= (convertedLow + convertedHigh) * ONE_MILLION) {
					numberOfMultiplicativePairs += highIndex - lowIndex;
					highIndex--;
				}else{
					lowIndex++;
				}
			}else{
				lowIndex++;
			}
		}

		if (numberOfMultiplicativePairs > LIMIT) {
			return LIMIT;
		}
		return numberOfMultiplicativePairs;
	}

	private long convertValue(int a, int b) {
		return (long) a * ONE_MILLION + (long) b;
	}

}
