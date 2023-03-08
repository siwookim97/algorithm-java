package programmers.level1.p136798;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("5, 3, 2 -> 10")
    void t1() {
        assertThat(new Solution().solution(5,3,2)).isEqualTo(10);
    }

    @Test
    @DisplayName("10, 3, 2 -> 21")
    void t2() {
        assertThat(new Solution().solution(10,3,2)).isEqualTo(21);
    }
}