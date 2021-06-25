# Java download

* oracle JDK: 부분 유료화 돼있어서 공부하는건 상관 없지만 회사에서 개발할때는 조심해야 함

* open JDK: 무료이긴 하나 라이센스를 보고 조건을 잘 지켜야 함, oracle JDK 의 일부가 빠져있음

* cmd 창에 java `Enter` 해서 환경변수에 등록 됐는지 확인(자동으로 됨)

* 안돼있으면 환경변수 설정하기
  * 자동 설정된 경로(C:\Program Files\Common Files\Oracle\Java\javapath)
  * 오리지널 경로(C:\Program Files\Java\jdk-16.0.1\bin)
  * 시스템 변수에 JAVA_HOME 이란 이름에 내용 C:\Program Files\Java\jdk-16.0.1 로 설정(JDK위치)
  * 시스템 변수의 PATH에 %JAVA_HOME%\bin 추가(이렇게 이름 만드는게 관습임)
  * 혹시 다른 버전을 사용하게 되면 %JAVA_HOME%\bin 의 내용을 바꿔주면 됨

* eclipse 도 다운로드 후 실행

# 기본

* 패키지 이름은 .을 기준으로 디렉토리 생성가능
* 클래스 만들때, public static void main 체크박스 체크하기
  * 안해도 main 쓰고 자동완성하면 됨
* 클래스명 첫글자는 반드시 대문자로 하기
* 클래스를 만들면 같은 이름의 자바파일이 생김(직접 할때도 반드시 같게 해야 함)
* preferences에 font검색 basic 폴더의 맨 밑 text font -> edit 에서 글자관련 변경 가능
* 자동완성: `Ctrl`+ `space` 
* sysout 적고 자동완성 키 누르면 System.out.println(); 으로 바뀜
* 프로그램이 실행중일 때 Console 창의 오른쪽 위에  빨간색으로 바뀐 네모버튼 누르면 정지함
* 자동 맞춤 들여쓰기: `Ctrl` +`A`를 한 후에 `Ctrl` +`Shift`+ `F` 
  * 중괄호가 제대로 돼 있을 경우에만 사용 가능
* 같은 페키지에 다른 클래스에 main 함수가 여러개 있어도 실행버튼을 통해 어떤걸 실행할지 고를 수 있어서 상관 없음

