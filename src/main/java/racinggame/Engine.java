package racinggame;

import nextstep.utils.Randoms;

public class Engine {
    private final int startInclusive = 0;
    private final int endInclusive = 9;
    private final int runnableCriteria = 3;


    public boolean canGo() {
        int random = getRandomNumber();
        return random <= runnableCriteria;
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(startInclusive, endInclusive);
    }
}
