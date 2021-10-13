package racinggame;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

public class CarsTest {
    List<Car> carList;
    Cars cars;

    @Test
    void getTopDriverNameList() {
        MockedStatic<Cars> mockedCar = Mockito.mockStatic(Cars.class);

        when(Cars.mapCars(anyList()))
                .thenReturn(Arrays
                        .asList(new Car("pobi", 0), new Car("woni", 0)));
        cars = new Cars(Arrays.asList("pobi", "woni"));
        assertThat(cars.getTopDriverNameList()).isEqualTo("pobi,woni");

        when(Cars.mapCars(anyList()))
                .thenReturn(Arrays
                        .asList(new Car("pobi", 1), new Car("woni", 0)));
        cars = new Cars(Arrays.asList("pobi", "woni"));
        assertThat(cars.getTopDriverNameList()).isEqualTo("pobi");

        when(Cars.mapCars(anyList()))
                .thenReturn(Arrays
                        .asList(new Car("pobi", 2), new Car("woni", 0), new Car("chris", 2)));
        cars = new Cars(Arrays.asList("pobi", "woni", "chris"));
        assertThat(cars.getTopDriverNameList()).isEqualTo("pobi,chris");
    }
}
