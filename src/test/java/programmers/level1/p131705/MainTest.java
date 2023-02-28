package programmers.level1.p131705;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("[-2,3,0,2,-5] -> 2")
    void t1() {
        assertThat(new Solution().solution(new int[]{-2,3,0,2,-5})).isEqualTo(2);
    }

    @Test
    @DisplayName("[-3,-2,-1,0,1,2,3] -> 5")
    void t2() {
        assertThat(new Solution().solution(new int[]{-3,-2,-1,0,1,2,3})).isEqualTo(5);
    }

    @Test
    @DisplayName("[-1,1,-1,1] -> 0")
    void t3() {
        assertThat(new Solution().solution(new int[]{-1,1,-1,1})).isEqualTo(0);
    }
}