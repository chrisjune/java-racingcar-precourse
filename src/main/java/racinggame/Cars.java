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
        for (Car car : getFastestDriverList()) {
            nameList.add(car.getGamerName());
        }
        return String.join(",", nameList);
    }

    private List<Car> getFastestDriverList() {
        List<Car> fastestDriverList = new ArrayList<>();
        for (Car car : carList) {
            fastestDriverList = calculatePositionByCar(fastestDriverList, car);
        }
        return fastestDriverList;
    }

    private List<Car> calculatePositionByCar(List<Car> topDriverList, Car car) {
        if (topDriverList.isEmpty()){
            topDriverList.add(car);
            return topDriverList;
        }

        Car maxPositionCar = topDriverList.get(0);
        if (car.isEqualTo(maxPositionCar)) {
            topDriverList.add(car);
        }
        if (car.isFasterThan(maxPositionCar)) {
            topDriverList = new ArrayList<>();
            topDriverList.add(car);
        }
        return topDriverList;
    }

}
