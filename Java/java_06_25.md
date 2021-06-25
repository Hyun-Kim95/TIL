# Scanner

* 준비

  * Scanner scan = new Scanner(System.in);

    > System.in: 표준 입력,	System.out: 표준 출력

  * Scanner를 자동완성으로 작성해서 import도 같이 해줌

* 사용

  * int a = scan.nextInt();

    > 정수형의 키보드 입력 대기중
    >
    > scan.next 를 보면 정수형 이외에도 여러가지를 받을 수 있음

  * String str = scan.next();

    > 띄어쓰기를 기준으로 받음
    >
    > abc def 이렇게 입력하면 abc만 출력되고 def는 버퍼에 남아있게 됨

  * String str = scan.nextLine();

    > 숫자입력 바로 뒤에 있으면 숫자만 입력받고 끝나버림(위에서 엔터를 입력으로 받아서)

    * 숫자 입력 받고 사용하려면 쓰기 전 부분에 scan.next() 를 사용해야함

      > 변수에 저장하지 않고 위에서 받은 널문자를 그냥 날려버림

* 마침

  * scan.close();

    > 이후 scan을 사용하지 않겠다는 의미(안써도 에러는 안뜸)

# switch 문

* default 문의 위치는 맨 마지막일 필요는 없음

# if 문

* true와 false 값이 들어감
  * c언어 처럼 1이나 0이 들어가지 않음