package programmers.level1.p160586;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("[ABACD, BCFED], [ABCD, AABB] -> [9, 4]")
    void t1() {
        assertThat(new Solution().solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"}))
                .isEqualTo(new int[] {9,4});
    }

    @Test
    @DisplayName("[AA], [B] -> [-1]")
    void t2() {
        assertThat(new Solution().solution(new String[]{"AA"}, new String[]{"B"}))
                .isEqualTo(new int[] {-1});
    }

    @Test
    @DisplayName("[AGZ, BSSS], [ASA, BGZ] -> [4,6]")
    void t3() {
        assertThat(new Solution().solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"}))
                .isEqualTo(new int[] {4, 6});
    }
}