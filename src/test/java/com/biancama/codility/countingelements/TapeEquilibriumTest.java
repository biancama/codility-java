package com.biancama.codility.countingelements;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 21/09/16.
 */
public class TapeEquilibriumTest {

	@Test
	public void test01(){
		TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
		int[] input = {3, 1, 2, 4, 3};
		assertThat(tapeEquilibrium.solution(input)).isEqualTo(1);
	}


	@Test
	public void test02(){
		TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
		int[] input = {1, 1};
		assertThat(tapeEquilibrium.solution(input)).isEqualTo(0);
	}

	@Test
	public void test03(){
		TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
		int[] input = {1, -1};
		assertThat(tapeEquilibrium.solution(input)).isEqualTo(2);
	}


}
