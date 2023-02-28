package programmers.level0.p120830;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("10,3 -> 124000")
    void t1() {
        assertThat(new Solution().solution(10, 3)).isEqualTo(124000);
    }

    @Test
    @DisplayName("64, 6 -> 768000")
    void t2() {
        assertThat(new Solution().solution(64, 6)).isEqualTo(768000);
    }
}