package com.biancama.codility.increasingSequences;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Created by massimo.biancalani on 15/05/2018.
 */
public class IncreasingSequencesTest {
    @Test
    public void test01() {
        IncreasingSequences increasingSequences = new IncreasingSequences();
        int A[] = {5, 3, 7, 7, 10};
        int B[] = {1, 6, 6, 9, 9};
        assertThat(increasingSequences.solution(A, B)).isEqualTo(2);
    }

    @Test
    public void test02() {
        IncreasingSequences increasingSequences = new IncreasingSequences();
        int A[] = {5, -3, 6, 4, 8};
        int B[] = {2, 6, -5, 1, 0};
        assertThat(increasingSequences.solution(A, B)).isEqualTo(-1);
    }

    @Test
    public void test03() {
        IncreasingSequences increasingSequences = new IncreasingSequences();
        int A[] = {1, 5, 6};
        int B[] = {-2, 0, 2};
        assertThat(increasingSequences.solution(A, B)).isEqualTo(0);
    }

    @Test
    public void test04() {
        IncreasingSequences increasingSequences = new IncreasingSequences();
        int A[] = {5, 3, 7, 7, 10};
        int B[] = {1, 6, 6, 9, 9};
        assertThat(increasingSequences.solution(B, A)).isEqualTo(2);
    }

    @Test
    public void test05() {
        IncreasingSequences increasingSequences = new IncreasingSequences();
        int A[] = {1, 60, 58};
        int B[] = {-1, 55, 63};
        assertThat(increasingSequences.solution(B, A)).isEqualTo(1);
    }

    @Test
    public void test06() {
        IncreasingSequences increasingSequences = new IncreasingSequences();
        int A[] = {1, 60, 58, 98};
        int B[] = {-1, 55, 63, 100};
        assertThat(increasingSequences.solution(B, A)).isEqualTo(1);
    }

    @Test
    public void test07() {
        IncreasingSequences increasingSequences = new IncreasingSequences();
        int A[] = {1, 60, 60, 62};
        int B[] = {-1, 55, 63, 64};
        assertThat(increasingSequences.solution(B, A)).isEqualTo(1);
    }

    @Test
    public void test08() {
        IncreasingSequences increasingSequences = new IncreasingSequences();
        int A[] = {5, 3};
        int B[] = {6, 4};
        assertThat(increasingSequences.solution(B, A)).isEqualTo(-1);
    }

}
