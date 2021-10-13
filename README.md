# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능목록
* Car 클래스, 한 명의 사용자의 자동차를 의미.
  * goOrStop 메서드, 전진할 것인지 후진 할 것인지 결정
  * start 메서드, goOrStop메서드를 활용하여 현재 위치를 조정
* Cars 클래스, 여러 Car클래스 자동차들을 묶음
  * start 메서드, 각각의 Car클래스의 start 메서드를 실행
* CarGame 클래스, 게임유저를 입력받아 게임을 진행
  * run 메서드, 게임횟수를 입력받고 게임 우승자를 반환
