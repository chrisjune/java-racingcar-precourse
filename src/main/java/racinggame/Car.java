package racinggame;

import nextstep.utils.Randoms;

public class Car {
    private int index=0;

    public boolean goOrStop() {
        int randomInt = Randoms.pickNumberInRange(0, 9);
        return randomInt > 3;
    }

    public void start() {
        if (goOrStop()){
            this.index+=1;
        }
    }

    public int getResult() {
        return this.index;
    }
}
