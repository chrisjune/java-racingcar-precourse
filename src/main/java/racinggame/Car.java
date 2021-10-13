package racinggame;

public class Car {
    private final int position;
    private final String gamerName;

    public int getPosition() {
        return position;
    }

    public Car(String gamerName, int position) {
        this.gamerName = gamerName;
        this.position = position;
    }

    public String getGamerName() {
        return gamerName;
    }


    public void run() {

    }

    public boolean isEqualTo(Car targetCar) {
        return position == targetCar.position;
    }
    public boolean isFasterThan(Car targetCar) {
        return position > targetCar.position;
    }
    public boolean isFasterThanOrEqualTo(Car targetCar) {
        return position >= targetCar.position;
    }
}
