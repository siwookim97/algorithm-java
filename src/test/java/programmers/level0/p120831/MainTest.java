package programmers.level0.p120831;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MainTest {

    @Test
    @DisplayName("10입력 30출력")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(30);
    }

    @Test
    @DisplayName("4입력 6출력")
    void t2() {
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }
}