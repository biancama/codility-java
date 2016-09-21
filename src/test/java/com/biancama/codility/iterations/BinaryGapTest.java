package com.biancama.codility.iterations;


import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class BinaryGapTest {
	@Test
	public void test01() {
		BinaryGap binaryGap = new BinaryGap();
		assertThat(binaryGap.solution(9)).isEqualTo(2);
		assertThat(binaryGap.solution(10)).isEqualTo(1);
	}
}
