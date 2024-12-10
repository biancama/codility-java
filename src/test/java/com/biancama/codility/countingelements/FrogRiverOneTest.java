package com.biancama.codility.countingelements;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FrogRiverOneTest {
    @Test
    public void test01() {
        FrogRiverOne solution = new FrogRiverOne();
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        assertThat(solution.solution(5, A)).isEqualTo(6);
    }
}
