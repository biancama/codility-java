package com.biancama.codility.countingelements;

import java.util.Arrays;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        // Implement your solution here
        boolean[] visited = new boolean[X];
        Arrays.fill(visited, false);
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (!visited[A[i] - 1]) {
                visited[A[i] - 1] = true;
                counter++;
            }
            if (counter == X) {
                return i;
            }
        }
        return - 1;
    }
}
