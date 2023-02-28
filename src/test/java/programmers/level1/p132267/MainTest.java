package programmers.level1.p132267;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("2,1,20 -> 19")
    void t1() {
        assertThat(new Solution().solution(2,1,20)).isEqualTo(19);
    }

    @Test
    @DisplayName("3,1,20 -> 9")
    void t2() {
        assertThat(new Solution().solution(3,1,20)).isEqualTo(9);
    }
}