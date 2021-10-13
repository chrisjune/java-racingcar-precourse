package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    List<Car> carList;
    Cars cars;

    @Test
    void getTopDriverNameList() {
        carList = Arrays.asList(new Car("pobi", 0),
                new Car("woni", 0));
        cars = new Cars(carList);
        assertThat(cars.getTopDriverNameList()).isEqualTo("pobi,woni");

        carList = Arrays.asList(new Car("pobi", 1),
                new Car("woni", 0));
        cars = new Cars(carList);
        assertThat(cars.getTopDriverNameList()).isEqualTo("pobi");

        carList = Arrays.asList(new Car("pobi", 2),
                new Car("woni", 1),
                new Car("chris", 2));
        cars = new Cars(carList);
        assertThat(cars.getTopDriverNameList()).isEqualTo("pobi,chris");
    }
}
