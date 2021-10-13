package racinggame;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class CarTest {
    @Test
    void goOrStop() {
        MockedStatic<Randoms> a = Mockito.mockStatic(Randoms.class);
        when(Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(3);
        assertThat(new Car().goOrStop()).isEqualTo(false);

        when(Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(4);
        assertThat(new Car().goOrStop()).isEqualTo(true);

        when(Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(0);
        assertThat(new Car().goOrStop()).isEqualTo(false);

        when(Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(9);
        assertThat(new Car().goOrStop()).isEqualTo(true);
    }

    @Test
    void start() {
        Car a = Mockito.spy(Car.class);

        when(a.goOrStop()).thenReturn(true);
        a.start();
        assertThat(a.getResult()).isEqualTo(1);

        when(a.goOrStop()).thenReturn(false);
        a.start();
        assertThat(a.getResult()).isEqualTo(1);
    }
}
