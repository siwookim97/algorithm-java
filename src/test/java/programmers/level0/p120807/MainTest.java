package programmers.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {

    @Test
    @DisplayName("2, 3입력, -1반환")
    void t1() {
        assertThat(new Solution().solution(2, 3)).isEqualTo(-1);
    }
}
