# HTML

* 웹 페이지를 만들 때 사용하는 가장 기본적인 웹 프로그래밍

### <meta\> 태그

* 데이터를 표현하는 속성인 메타데이터를 설정할 때 사용
* HTML5의 표준 문자 세트는 UTF-8

### 속성(attribute)

* 해당 태그를 사용할 때 필요한 세부 사항을 설정
* <a href="https://naver.com" target="_blank"\> 네이버 </a\>
  * '네이버'를 클릭하면 naver를 새 탭에서 열어줌
  * a 태그의 속성
    * href
      * 링크를 걸어줌
    * target
      * 링크를 누를 때, 효과 설정

### <h\>태그

* h1 ~ h6
  * 제목을 나타냄

### <br\> 태그

* <br\> : 줄바꿈할 때 사용

### 특수문자

![image](https://user-images.githubusercontent.com/75933619/130380920-bfaff2c5-abac-4db0-8ee9-ec2d054bbe84.png)

### <p\> 태그

* 단락을 구분

### <b\> , <i\> 태그

* 글자를 진하게, 비스듬하게 만듬

### <ol\>, <ul\>, <li\> 태그

* ul 순서없는 리스트를 만듬
* ol 순서있는 리스트를 만듬
  * li : ul이나 ol 태그 안에서 실제 리스트 모양 만듬

### <dl\>, <dt\>, <dd\> 태그

* 정의 목록 나타내기

### <a\>태그

* 링크를 표현
* 링크: 웹 페이지에서 메뉴, 배너 등을 클릭하면 지정된 페이지로 이동하는 것

### 주석문

* <-- 주석 -->
* `Ctrl` + `/`

### <img\>태그

* 이미지 삽입

![image](https://user-images.githubusercontent.com/75933619/130387247-299d50f3-990d-4b8a-8307-73aa8f5008bc.png)

* <img src="flower.jpg" width="300" title="예시"\>

#### 웹에서 사용할 수 있는 이미지 파일

![image](https://user-images.githubusercontent.com/75933619/130386600-5d798a67-bf69-45b0-a97c-0a46b3ea5d48.png)

### 절대 경로

* http:// 로 시작하는 주소
* 인터넷상에 하나밖에 없는 유일무이한 고유한 경로를 의미

### <embed\> 태그

* 외부 파일을 재생하기 위해 사용
* 테스트로 swf 파일을 했는데 서비스종료돼서 실행 안됨
* [Adobe Flash Player - Debug Downloads]https://www.adobe.com/support/flashplayer/debug_downloads.html
  * 여기서 맨위에꺼 다운받아서 확인해야 함

### < audio\>태그

* MP3, WAV, Ogg 등의 오디오 파일을 재생

![image](https://user-images.githubusercontent.com/75933619/130394142-225fb2d7-d7d8-44aa-b81d-75cf9bbb68a8.png)

### <video\> 태그

* 비디오 파일을 삽입할 때 사용
* <source\> 태그로 확장자에 따른 파일의 type을 지정해야 함

![image](https://user-images.githubusercontent.com/75933619/130395242-e657c8cb-0d10-4a35-9fa7-75735925ed48.png)

### 테이블 태그

* <table\> : 테이블 전체를 만들 때 사용
* <tr\> : 행을 나타낼 때 사용
* <td\> , <th\> : 열을 나타낼 때 사용
  * th : 가운데정렬 + 굵은 글씨
  * td: 일반 열

* rowspan="2", colspan="2"
  * 합치는 속성
  * ex: <td rowspan="2"\>서울/경기</td\>

### <form\> 태그

* text, password, radio, checkbox 등
  * radio : 하나밖에 체크 못함(같은 name 안에서)
* <select\>와 <option\> 태그
  * 선택박스를 만들 때 사용

* < textarea rows="" cols=""\> 태그

  * 다중 입력 창
  * rows : 입력창의 높이
  * cols : 너비

* <button\> 태그

  * 버튼 생성

    ![image](https://user-images.githubusercontent.com/75933619/130404825-f50b8838-2a22-4b29-bc65-d115892fd804.png)

* type="file"

  * 파일첨부 창 만듬

* ex

  ```html
  <body>
      <form>
          이름 : <input type="text"><br>
          나이 : <input type="text"><br>
          이메일 : <input type="text">@
          <select>
              <option>선택</option>
              <option>naver.com</option>
              <option>hanmail.net</option>
              <option>gmail.com</option>
              <option>직접입력</option>
          </select><br>
          비밀번호 : <input type="password"><br><br>
          취미 : <input type="checkbox" name="hobby1">등산
          <input type="checkbox" name="hobby1">독서
          <input type="checkbox" name="hobby1">영화감상
          <input type="checkbox" name="hobby1">음악감상<br>
          자기소개 : <br><textarea rows="5" cols="80"></textarea><br>
          파일첨부 : <input type="file">*2MB까지 가능<br>
          개인 정보 : <input type="radio" name="info" checked>공개
          <input type="radio" name="info">비공개<br>
          <button type="button">검색</button><br>
          <button type="submit">확인</button><br>
          <button type="reset">다시 쓰기</button><br>
          <!--html5에 추가된 폼 양식-->
          <input type="color"><br>
          <input type="datetime-local"><br>
          <input type="month"><br>
          <input type="number"><br>
          <input type="range"><br>
          <input type="time"><br>
          <input type="week"><br>
      </form>
  </body>
  ```

### 테이블과 form태그 결합 예제

```html
<body>
    <h3>회원 가입 양식</h3>
    <table>
        <form>
            <tr>
                <td>-아이디</td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td>-비밀번호</td>
                <td><input type="password"></td>
            </tr>
            <tr>
                <td>-비밀번호확인</td>
                <td><input type="password"></td>
            </tr>
            <tr>
                <td>-이름</td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td>-성별</td>
                <td><input type="radio" name="gender">여성
                <input type="radio" name="gender">남성</td>
            </tr>
            <tr>
                <td>-전화번호</td>
                <td>
                    <select>
                        <option>02</option>
                        <option>032</option>
                        <option>031</option>
                        <option>010</option>
                        <option>011</option>
                    </select>-<input type="tel">-<input type="tel">
                </td>
            </tr>
            <tr>
                <td>-이메일</td>
                <td>
                    <input type="text">@
                    <select>
                        <option>선택</option>
                        <option>naver.com</option>
                        <option>hanmail.net</option>
                        <option>gmail.com</option>
                        <option>직접입력</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>-자기소개</td>
                <td><textarea rows="5" cols="80"></textarea></td>
            </tr>
        </form>
    </table>
</body>
```

# CSS

### 기본 구조

* 선택자 : CSS를 적용할 영역을 선택할 때 사용
* CSS 명령 : CSS 속성과 값으로 구성
* CSS 명령의 마침 : 각 CSS 명령의 맨 뒤에 세미콜론을 붙임
* ![image](https://user-images.githubusercontent.com/75933619/130416628-3dde57d4-1466-4eb8-90db-d6b29db137e5.png)

### CSS 삽입 방법

* 인라인
* 내부
* 외부
