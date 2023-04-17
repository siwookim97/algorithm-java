package programmers.level2.p87377;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("[[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12], [5, 8, 12]] -> ...")
    void t1() {
        assertThat(new Solution().solution(new int[][]{{2,-1,4}, {-2,-1,4}, {0,-1,1}, {5,-8,-12}, {5,8,12}}))
                .isEqualTo(new String[]{"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"});
    }

    @Test
    @DisplayName("[[0, 1, -1], [1, 0, -1], [1, 0, 1]]-> ...")
    void t2() {
        assertThat(new Solution().solution(new int[][]{{0,1,-1},{1,0,-1},{1,0,1}}))
                .isEqualTo(new String[]{"*.*"});
    }

    @Test
    @DisplayName("[[1, -1, 0], [2, -1, 0]]-> ...")
    void t3() {
        assertThat(new Solution().solution(new int[][]{{1,-1,0}, {2,-1,0}}))
                .isEqualTo(new String[]{"*"});
    }

    @Test
    @DisplayName("[[1, -1, 0], [2, -1, 0], [4, -1, 0]]-> ...")
    void t4() {
        assertThat(new Solution().solution(new int[][]{{1,-1,0}, {2,-1,0}, {4,-1,0}}))
                .isEqualTo(new String[]{"*"});
    }
}