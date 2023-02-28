package programmers.level0.p120841;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("[2,4] -> 1")
    void t1() {
        assertThat(new Solution().solution(new int[]{2,4})).isEqualTo(1);
    }

    @Test
    @DisplayName("[-7, 9] -> 2")
    void t2() {
        assertThat(new Solution().solution(new int[]{-7,9})).isEqualTo(2);
    }
}