package programmers.level1.p161990;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("[.#..., ..#.., ...#.] -> [0,1,3,4]")
    void t1() {
        assertThat(new Solution().solution(new String[]{".#...", "..#..", "...#."})).isEqualTo(new int[]{0, 1, 3, 4});
    }

    @Test
    @DisplayName("... -> [1,3,5,8]")
    void t2() {
        assertThat(new Solution().solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."}))
                .isEqualTo(new int[]{1, 3, 5, 8});
    }

    @Test
    @DisplayName("... -> [0,0,7,9]")
    void t3() {
        assertThat(new Solution().solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."}))
                .isEqualTo(new int[]{0, 0, 7, 9});
    }

    @Test
    @DisplayName("... -> [1,0,2,1]")
    void t4() {
        assertThat(new Solution().solution(new String[]{"..", "#."}))
                .isEqualTo(new int[]{1, 0, 2, 1});
    }
}