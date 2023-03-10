package programmers.level1.p133502;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("[2,1,1,2,3,1,2,3,1] -> 2")
    void t1() {
        assertThat(new Solution().solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1})).isEqualTo(2);
    }

    @Test
    @DisplayName("[1,3,2,1,2,1,3,1,2] -> 0")
    void t2() {
        assertThat(new Solution().solution(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2})).isEqualTo(0);
    }
}