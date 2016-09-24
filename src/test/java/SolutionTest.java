import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class SolutionTest {
	@Test
	public void test01() {
		Solution solution = new Solution();
		int N = 9;
		assertThat(solution.solution(N)).isEqualTo(2);
	}

	@Test
	public void test02() {
		Solution solution = new Solution();
		int N = 529;
		assertThat(solution.solution(N)).isEqualTo(4);
	}


	@Test
	public void test03() {
		Solution solution = new Solution();
		int N = 20;
		assertThat(solution.solution(N)).isEqualTo(1);
	}

	@Test
	public void test04() {
		Solution solution = new Solution();
		int N = 15;
		assertThat(solution.solution(N)).isEqualTo(0);
	}

	@Test
	public void test05() {
		Solution solution = new Solution();
		int N = 0;
		assertThat(solution.solution(N)).isEqualTo(0);
	}

}
