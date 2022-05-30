# 로또
## 진행 방법
* [x] 로또 요구사항을 파악한다.
* [x] 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* [x] 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* [x] 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [x] [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## 1단계
### String 클래스에 대한 학습 테스트
* [x] "1,2"을 ,로 split 했을 때 1과 2로 잘 준비되는지 확인하는 학습 테스트를 구현한다.
* [x] "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.

* [x] "(1,2)"값이 주어졌을 때 String의 substring() 메소드를 확용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.

* [x] "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
* [x] String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
* [x] JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.

### Set Collection에 대한 학습 테스트
* [x] Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.
* [x] Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다. 구현하고 보니 다음과 같이 중복 코드가 계속해서 발생한다. JUnit의 ParameterizedTest를 활용해 중복 코드를 제거해 본다.
* [x] 요구사항 2는 contains 메소드 결과 값이 true인 경우만 테스트 가능하다. 입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현한다.
  예를 들어 1, 2, 3 값은 contains 메소드 실행결과 true, 4, 5 값을 넣으면 false 가 반환되는 테스트를 하나의 Test Case로 구현한다.

### 로또(자동)에 대한 기능 요구사항
* [ ] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급
* [ ] 로또가 발급된 이후 당첨 번호 입력 시, 당첨 통계를 통해 등수를 확인
* [ ] 확인한 등수를 통해 총 수익율을 계산하여 표기

### 로또(자동)에 대한 프로그래밍 요구사항
* [x] 구입금액을 입력받은 후 1장에 가격에 맞게 나눠서 장수를 출력
* [x] 구입금액이 null일 때, 숫자가 아닐 때 예외처리
* [x] 구입금액이 음수일 때, 예외처리
* [x] Lotto 일급 클래스 처리 (Lotto.java)
* [x] 1~45 이외 숫자 포함 시 예외처리
* [x] 6개 숫자가 아닐 시 예외처리
* [x] Lotto 클래스 내에서 번호 생성 후 LottoTickets 클래스로 전달
* [x] 지난 주 당첨번호 입력 시 예외 상황 Lotto 클래스에서 처리
* [x] LottoTickets 일급 클래스 처리 (LottoTickets.java)
* [x] 랜덤한 6개의 숫자를 만드는 기능 생성 (RandomNumberExtractor.java)
* [x] 당첨 통계를 위한 LottoWinners.java 클래스 생성 후 당첨통계 확인

### 로또(2등)에 대한 기능 요구사항 
* [x] 2등 당첨용 보너스볼을 하나 더 추첨
* [x] 당첨 통계에 2등 추가

### 로또(2등)에 대한 프로그래밍 요구사항
* [x] Enum 사용을 통한 구현 

### 로또(수동)에 대한 기능 요구사항
* [x] 수동 입력을 위해 수동 횟수 입력 가능

### 로또(수동)에 대한 프로그래밍 요구 사항
* [x] 금액, 숫자, 수동생성 번호를 입력할 수 있도록 구현