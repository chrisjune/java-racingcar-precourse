package racinggame;

import nextstep.utils.Randoms;

public class Car {
    public boolean goOrStop() {
        int randomInt = Randoms.pickNumberInRange(0, 9);
        return randomInt > 3;
    }
}
