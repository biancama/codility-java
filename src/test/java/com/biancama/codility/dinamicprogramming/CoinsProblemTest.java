package com.biancama.codility.dinamicprogramming;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CoinsProblemTest {

    @Test
    public void test01() {
        CoinsProblem coins = new CoinsProblem();

        int[] input = {1, 3, 4};
        assertThat(coins.minimumCoins(input, input.length, 6)).isEqualTo(2);
    }
}
