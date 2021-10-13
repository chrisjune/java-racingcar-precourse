package racinggame;

import java.util.List;

public class CarGame {
    private final List<String> driverNameList;
    private final Cars cars;

    public CarGame(List<String> gamerNameList) {
        this.driverNameList = gamerNameList;
        this.cars = new Cars(gamerNameList);
    }

    public String getGamerNames() {
        return String.join(",", driverNameList);
    }

    public String playMultiplesBy(int times) {
        for (int i = 0; i < times; i++) {
            this.cars.runOneTimes();
        }
        return getGameResult();
    }

    private String getGameResult() {
        return cars.getTopDriverNameList();
    }
}
