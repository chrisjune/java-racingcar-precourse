package racinggame;

import nextstep.utils.Console;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<String> driverNameList = getDriverNameList();
        System.out.println("시도할 회수는 몇회인가요?");
        int timesLeft = getTimesLeft();
        System.out.println("pobi : -");
        System.out.println("woni : ");
        System.out.println("최종 우승자는 pobi 입니다.");
    }

    private static int getTimesLeft() {
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자를 입력해주세요");
            return getTimesLeft();
        }
    }

    private static List<String> getDriverNameList() {
        List<String> nameList = Arrays.asList(Console.readLine().split(","));
        for (String name : nameList) {
            nameList = validateNameList(nameList, name);
        }
        return nameList;
    }

    private static List<String> validateNameList(List<String> nameList, String name) {
        if (name.length() > 5) {
            System.out.println("[ERROR] 이름은 다섯자 이하만 가능합니다");
            nameList = getDriverNameList();
        }
        return nameList;
    }
}
