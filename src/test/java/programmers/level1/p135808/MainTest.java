package programmers.level1.p135808;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("3,4,[1,2,3,1,2,3,1] -> 8")
    void t1() {
        assertThat(new Solution().solution(3,4, new int[]{1,2,3,1,2,3,1})).isEqualTo(8);
    }

    @Test
    @DisplayName("4,3,[4,1,2,2,4,4,4,4,1,2,4,2] -> 33")
    void t2() {
        assertThat(new Solution().solution(4, 3, new int[]{4,1,2,2,4,4,4,4,1,2,4,2})).isEqualTo(33);
    }
}