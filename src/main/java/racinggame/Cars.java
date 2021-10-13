package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public static List<Car> mapCars(List<String> gamerNameList) {
        List<Car> carList = new ArrayList<>();
        for (String gamerName : gamerNameList) {
            carList.add(new Car(gamerName, 0));
        }
        return carList;
    }

    public void runOneTimes() {
        for (Car car : carList) {
            car.run();
        }
    }

    public String getTopDriverNameList() {
        List<String> nameList = new ArrayList<>();
        for (Car car : getTopDriverList()) {
            nameList.add(car.getGamerName());
        }
        return String.join(",", nameList);
    }

    private List<Car> getTopDriverList() {
        Car maxPositionCar = new Car("", 0);
        List<Car> topDriverList = new ArrayList<>();
        for (Car car : carList) {
            if (car.isEqualTo(maxPositionCar)) {
                topDriverList.add(car);
            }
            if (car.isFasterThan(maxPositionCar)) {
                topDriverList = new ArrayList<>();
                topDriverList.add(car);
                maxPositionCar = car;
            }
        }
        return topDriverList;
    }

}
