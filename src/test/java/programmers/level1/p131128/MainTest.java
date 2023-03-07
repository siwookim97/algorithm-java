package programmers.level1.p131128;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("100, 2345 -> -1")
    void t1() {
        assertThat(new Solution().solution("100","2345")).isEqualTo("-1");
    }

    @Test
    @DisplayName("100, 203045 -> 0")
    void t2() {
        assertThat(new Solution().solution("100","203045")).isEqualTo("0");
    }

    @Test
    @DisplayName("100, 123450 -> 10")
    void t3() {
        assertThat(new Solution().solution("100","123450")).isEqualTo("10");

    }

    @Test
    @DisplayName("12321, 42531 -> 321")
    void t4() {
        assertThat(new Solution().solution("12321","42531")).isEqualTo("321");
    }
}