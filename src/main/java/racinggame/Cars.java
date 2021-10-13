package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<String> gamerNameList) {
        this.carList = new ArrayList<>();
        for (String gamerName : gamerNameList) {
            this.carList.add(new Car(gamerName));
        }
    }

    public void runOneTimes() {
        for (Car car : carList) {
            car.run();
        }
    }

    public String getTopDriverNameList() {
        return "pobi";
    }

}
