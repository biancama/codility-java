package com.biancama.codility.pascaltriangle;

/**
 * Created by massimo.biancalani on 15/05/2018.
 */
public class PascalTriangle {

    public int solution(boolean[] P) {
        int numberOfFalseConsecutive = !P[0] ? 1 : 0;
        int numberOfFalse = 0;
        for (int i = 1; i < P.length; i++) {
            if (P[i]) {
                numberOfFalse += (numberOfFalseConsecutive +1) * numberOfFalseConsecutive / 2;
                numberOfFalseConsecutive = 0;
            } else {
                numberOfFalseConsecutive++;
            }
        }
        numberOfFalse += (numberOfFalseConsecutive +1) * numberOfFalseConsecutive / 2;
        return  (P.length +1) * P.length /2 - numberOfFalse;
    }
}
