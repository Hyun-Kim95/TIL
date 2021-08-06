# StringTokenizer

* StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
* st.countTokens(); : 토큰의 개수 리턴
* String token = st.nextToken();
  * 다음 토큰을 전달
* st.hasMoreTokens()
  * 토큰이 더 있는지 확인(true,false)

# Math

* Math.PI
  * 원주율
* Math.ceil(a)
  * 올림
* Math.floor(a)
  * 내림
* Math.sqrt(a)
  * 제곱근
* Math.round(a)
  * 반올림
* Math.random()
  * 0~ 1랜덤(double)

# Calendar

* new 사용 X
* 날짜 관련
  * 연,월,일,시간,오전,요일,밀리초 ...
* Calendar.MONTH+1
  * 0부터 시작이라 1을 더해줌

* Calendar now = Calendar.getInstanc();
  * 현재의 시간 정보를 가진 now 객체 생성
* Date date = new Date();
  * 사용은 가능하나 권장하지는 않음