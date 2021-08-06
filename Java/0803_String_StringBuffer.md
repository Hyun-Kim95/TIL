# StringBuffer

* 가변 버퍼: 버퍼 크기를 자동으로 바꿔줌

* append("내용")
  * 뒤에 문자열 추가
* insert(7, "내용")
  * 7위치에 내용 추가
* replace(8,10,"내용")
  * 8~9 부분을 내용으로 바꿈(첫글자 0부터 시작)
* delete(8,13)
  * 8~12까지 제거
* setLength(4)
  * 버퍼 내 문자열의 길이 재설정
* reverse()
  * 문자열 뒤집기

# String

* a.compareTo(b)
  * 알파벳 순서로 크기 비교
* a.trim()
  * 좌우 공백 제거
* a.charAt(2)
  * 두번째 인덱스 값
* a.length()
  * a의 길이
* a.contains("#")
  * a에 #이 포함되는지 확인
* a.concat(b)
  * a뒤에 b를 합침
* a.replace("#","Java")
  * #을 Java로 바꿈
* a.split(",")
  * , 를 기준으로 자름
  * String s[] = a.split(",");
* a.substring(5)
  * 5이후로 다 자르기
* a.toLowerCase()
* a.toUpperCase()

