package com.biancama.codility.pit;

/**
 * Created by massimo on 14/09/16.
 */
public class PitMinDepth {
	// Min depth
	public int solution(int[] A) {
		int P = -1, R = -1, Q = -1, depth = -1;
		int n = A.length;
		for(int i = 0; i < n - 1; i++){
			if(Q < 0){
				if(A[i] > A[i+1]){
					Q = i +1;
					P = i;
				}
			}
			else{
				if(R < 0){
					if(A[i] > A[i + 1])
						Q++;

					if(A[i] < A[i + 1])
						R = i + 1;

					if(A[i] == A[i + 1]){
						P = Q = R = -1;
					}
				}
				else{
					if(A[i] < A[i + 1])
						R++;
					else{
						depth = Math.max(depth, Math.min(A[P] - A[Q], A[R] - A[Q]));

						if(A[i] > A[i + 1]){
							P = i;
							Q = i + 1;
							R = -1;
						}
						else{
							P = Q = R = -1;
						}
					}
				}
			}
		}

		if(R > 0){
			depth = Math.max(depth, Math.min(A[P] - A[Q], A[R] - A[Q]));
		}

		return depth;
	}
}
