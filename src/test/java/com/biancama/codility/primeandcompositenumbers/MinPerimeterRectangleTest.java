package com.biancama.codility.primeandcompositenumbers;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 14/09/16.
 */
public class MinPerimeterRectangleTest {
	@Test
	public void test01() {
		MinPerimeterRectangle solution = new MinPerimeterRectangle();
		assertThat(solution.solution(30)).isEqualTo(22);
	}


	@Test
	public void test02() {
		MinPerimeterRectangle solution = new MinPerimeterRectangle();
		assertThat(solution.solution(32)).isEqualTo(24);
	}
}
