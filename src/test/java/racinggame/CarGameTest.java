package racinggame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarGameTest {
    List<String> gamerNameList;
    CarGame carGame;

    @BeforeEach
    void init() {
        gamerNameList = Arrays.asList("pobi", "woni", "chris");
        carGame = new CarGame(gamerNameList);
    }

    @Test
    void printName() {
        assertThat(carGame.getGamerNames()).isEqualTo("pobi,woni,chris");
    }

    @Test
    void playMultiplesBy() {
        Assertions.assertDoesNotThrow(() -> carGame.playMultiplesBy(5));
    }
}
