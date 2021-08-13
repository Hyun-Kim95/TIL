# HashMap<K, V>

* 키와 값으로 구성

* 사용 예제

  ```java
  HashMap<String, String> h = new HashMap<String, String>();	// 해시맵 생성
  h.put("apple", "사과");			// "apple"키와 "사과"값의 쌍을 h에 삽입
  String kor = h.get("apple");	// "apple"키로 값 검색, kor은 검색된 값, "사과"
  ```

* 요소의 삽입 삭제 시간이 매우 빠름

* 요소 검색은 더 빠름

* 인덱스로 접근 불가 -> 오직 '키' 로만 가능

* 메소드

  |               메소드                |                       설명                        |
  | :---------------------------------: | :-----------------------------------------------: |
  |            void clear()             |              해시맵의 모든 요소 삭제              |
  |   boolean containsKey(Object key)   |    지정된 키(key)를 포함하고 있으면 true 리턴     |
  | boolean containsValue(Object value) | 지정된 값(value)에 일치하는 키가 있으면 true 리턴 |
  |          V get(Object key)          |  지정된 키(key)의 값 리턴, 키가 없으면 null 리턴  |
  |          boolean isEmpty()          |          해시맵이 비어 있으면 true 리턴           |
  |          Set<k\> keySet()           |    해시맵의 모든 키를 담은 Set<K\> 컬렉션 리턴    |
  |        V put(K key, V value)        |          key와 value 쌍을 해시맵에 저장           |
  |        V remove(Object key)         |     지정된 키(key) 를 찾아 키와 값 모두 삭제      |
  |             int size()              |         HashMap에 포함된 요소의 개수 리턴         |

