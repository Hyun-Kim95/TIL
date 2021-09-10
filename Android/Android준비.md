# Android

### 설치

* 구글에 developers 검색 후 들어가서 Android 스튜디오 다운로드 클릭 후 다운로드
  * 구글에 android studio 설치 검색하면 방법 나옴

### 프로젝트 준비

* Empty 로 돼있는 프로젝트로 시작
* 한글 이름은 피하는걸 추천
* Language : Java
* 경로는 도메인을 사용하는게 안전함
  * 다른 어플과 충돌안나게
  * 보통 역순으로 사용
  * ex ) com.naver.app
* 밑에 체크 후 finish
* 우측 하단에 다운로드 진행 끝나면 준비 완료
* 밑에 Build 클릭해서 오류가 있다면 맨 밑에 오류누르고 오른쪽 맨밑 링크 클릭해서 설치
* 왼쪽 위 Android 화살표 누르면 다른 형식으로 볼 수 도 있음
* 중앙 위에 App누르면 이클립스의 패키지 만들때처럼 사용 가능
* 중앙 위에 NoDevice눌러서 AVD Manager 에서 하드웨어 선택 가능
  * 교재에서는 Pixel2 선택
  * x86 Images 에서 Target 부분이 Google Play, API Level이 31인 부분 Download(한참걸림)
    * 처음 시작할때 API Level이 31인 Android 12.0 으로 시작해서
      * 아니면 뒤로 나가서 Tools의 SDK Manager 에서 다른 레벨 다운받아야 함
  * next 클릭 후 가상핸드폰 설정 가능 finish
* 초록삼각형(RUN버튼) 누르면 한참있다가 폰이랑 경고문구 나오고 폰 켜짐
  * 오류나면 껐다켜보거나, Build에서 clean 후 reBuild해보거나, Tools 의 AVD Manager 에서 콜드부트로 해보기

### 기타

* 파일 우클릭 open in -> Explorer 누르면 파일경로의 폴더가 열림
* Activity 파일이 실행되면 최초에 자동으로 한번 onCreate 실행됨

* res - layout - activity_main.xml 들어가면 디자인으로도 보고 코드로도 볼 수 있음
  * 코드에서 textView 부분이 자동으로 자바코드로 바뀌는 데 하나의 객체로 보면 됨