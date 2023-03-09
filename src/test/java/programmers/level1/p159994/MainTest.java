package programmers.level1.p159994;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class MainTest {

    @Test
    @DisplayName("[i, drink, water], [want, to] -> [i, want, to, drink, water] -> Yes")
    void t1() {
        assertThat(new Solution().solution(new String[] {"i", "drink", "water"}, new String[] {"want", "to"}
                , new String[] {"i", "want", "to", "drink", "water"})).isEqualTo("Yes");
    }

    @Test
    @DisplayName("[i, water, drink], [want, to] -> [i, want, to, drink, water] -> No")
    void t2() {
        assertThat(new Solution().solution(new String[] {"i", "water", "drink"}, new String[] {"want", "to"}
                , new String[] {"i", "want", "to", "drink", "water"})).isEqualTo("No");
    }
}