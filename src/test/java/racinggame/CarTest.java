package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void speedTest() {
        Car slowCar = new Car("a", 0);
        Car fasterCar = new Car("b", 1);
        assertThat(slowCar.isFasterThan(fasterCar)).isFalse();
        assertThat(fasterCar.isFasterThan(slowCar)).isTrue();
    }

    @Test
    void positionPrintTest() {
        Car car = new Car("a", 0);
        assertThat(car.getPositionString()).isEqualTo("");

        car = new Car("a", 1);
        assertThat(car.getPositionString()).isEqualTo("-");

        car = new Car("a", 3);
        assertThat(car.getPositionString()).isEqualTo("---");
    }
}
