package racinggame;

import nextstep.utils.Randoms;

public class Car {
    private int position;
    private final String gamerName;
    private final Engine engine;

    public int getPosition() {
        return position;
    }

    public Car(String gamerName, int position) {
        this.gamerName = gamerName;
        this.position = position;
        this.engine = new Engine();
    }

    public String getGamerName() {
        return gamerName;
    }


    public void run() {
        if (engine.canGo()){
            this.position += 1;
        }
        printStatus();
    }

    public boolean isEqualTo(Car targetCar) {
        return position == targetCar.position;
    }

    public boolean isFasterThan(Car targetCar) {
        return position > targetCar.position;
    }

    public void printStatus() {
        System.out.println(gamerName + " : " + getPositionString());
    }

    public String getPositionString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < position; i++) {
            result.append("-");
        }
        return result.toString();
    }
}
