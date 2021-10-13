package racinggame;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class EngineTest {
    @Test
    void canGo() {
        MockedStatic<Randoms> randomsMocked = Mockito.mockStatic(Randoms.class);
        when(Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(3);
        assertThat(new Engine().canGo()).isEqualTo(false);

        when(Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(4);
        assertThat(new Engine().canGo()).isEqualTo(true);

        when(Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(0);
        assertThat(new Engine().canGo()).isEqualTo(false);

        when(Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(9);
        assertThat(new Engine().canGo()).isEqualTo(true);
    }
}
