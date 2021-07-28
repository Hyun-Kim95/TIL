# typedef

* typedef unsigned char BYTE;

  * 타입 재정의
  * unsigned char 를 앞으로 BYTE 라고 사용함

* typedef struct point{

  ​	int x;

  ​	int y;

  } POINT;

  * 형 선언문
  * 앞에 typedef가 없으면 변수 선언임

# 이중 포인터

* 포인터를 가리키는 포인터

  ```c
  int i = 10;		// i는 int형 변수
  int *p = &i;	// p는 i를 가리키는 포인터
  int **q = &p;	// q는 포인터 p를 가리키는 이중 포인터
  
  // 아래와 같은 역할을 함
  q = &p;		// q는 p의 주소를 가지고 있음
  *q = &i;	// q의 값은 i의 주소
  *(*q) = i;
  ```

# 배열 포인터

* 배열을 가리키는 포인터(잘 사용은 안함)
  * int (* pa)[10];
    * int[10]을 가리키는 포인터라는 의미

```c
int main(){
    int a[5] = {1,2,3,4,5};
    int (*pa)[5];
    int i;
    
    pa = &a;
    // pa = a; 와 같음
    // &a + 1 은 여기선 주소 20을 건너 띄우는 것
    // a + 1 은 a의 두번째 요소의 주소
    for(i = 0; i<5;i++)
        printf("%d\n",(*pa)[i]);
    return 0;
}
```

# 함수 포인터

* 함수를 가리키는 포인터
  * int (*p) ();
  * 함수명 자체도 함수의 주소를 가리킴

* 함수 포인터의 배열
  * int (*pf[5]) (int, int);