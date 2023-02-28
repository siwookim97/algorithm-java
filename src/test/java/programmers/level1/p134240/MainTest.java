package programmers.level1.p134240;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("[1,3,4,6] -> 1223330333221")
    void t1() {
        assertThat(new Solution().solution(new int[]{1,3,5,6})).isEqualTo("1223330333221");
    }

    @Test
    @DisplayName("[1, 7, 1, 2] -> 111303111")
    void t2() {
        assertThat(new Solution().solution(new int[]{1,7,1,2})).isEqualTo("111303111");
    }
}