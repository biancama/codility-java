import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class SolutionTest {
	@Test
	public void test01() {
		Solution solution = new Solution();
		int N = 8;
		assertThat(solution.solution(N)).isEqualTo(21);
	}

	@Test
	public void test02() {
		Solution solution = new Solution();
		int N = 36;
		assertThat(solution.solution(N)).isEqualTo(930352);
	}


	@Test
	public void test03() {
		Solution solution = new Solution();
		int N = 0;
		assertThat(solution.solution(N)).isEqualTo(0);
	}

	@Test
	public void test04() {
		Solution solution = new Solution();
		int N = 100000;
		assertThat(solution.solution(N)).isEqualTo(876091);
	}

	@Test
	public void test05() {
		Solution solution = new Solution();
		int N = 10000000;
		assertThat(solution.solution(N)).isEqualTo(876091);
	}

}
