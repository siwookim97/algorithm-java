package programmers.level1.p155652;

import org.assertj.core.api.SoftAssertionError;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("aukks, wbqd, 5 -> happy")
    void t1() {
        assertThat(new Solution().solution("aukks", "wbqd", 5)).isEqualTo("happy");
    }

    @Test
    @DisplayName("zzz, abc, 3 -> fff")
    void t2() {
        assertThat(new Solution().solution("zzz", "abc", 3)).isEqualTo("fff");
    }

    @Test
    @DisplayName("zzz, a, 1 -> bbb")
    void t3() {
        assertThat(new Solution().solution("zzz", "a", 1)).isEqualTo("bbb");
    }

    @Test
    @DisplayName("abc, d, 2 -> cef")
    void t4() {
        assertThat(new Solution().solution("abc", "d", 2)).isEqualTo("cef");
    }

    @Test
    @DisplayName("zzz, h, 1 -> aaa")
    void t5() {
        assertThat(new Solution().solution("zzz", "h", 1)).isEqualTo("aaa");
    }
}