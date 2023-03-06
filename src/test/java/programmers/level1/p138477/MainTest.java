package programmers.level1.p138477;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("3, [10, 100, 20, 150, 1, 100, 200] -> [10, 10, 10, 20, 20, 100, 100]")
    void t1() {
        assertThat(new Solution().solution(3, new int[] {10, 100, 20, 150, 1, 100, 200}))
                .isEqualTo(new int[] {10, 10, 10, 20, 20, 100, 100});
    }

    @Test
    @DisplayName("4, [0, 300, 40, 300, 20, 70, 150, 50, 500, 1000] -> [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]")
    void t2() {
        assertThat(new Solution().solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}))
                .isEqualTo(new int[] {0, 0, 0, 0, 20, 40, 70, 70, 150, 300});
    }

}