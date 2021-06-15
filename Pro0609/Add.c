#include<stdio.h>
int main() {

	printf("이름: %s\n", "홍길동");
	printf("나이: %d살\n", 21);
	printf("주소: %s\n", "서울 200번지");
	printf("\n\n");
	printf("Hello\n");
	printf("C\n");
	printf("Programmers!\n");
	printf("\n\n");
	printf("*****************************************\n");
	printf("\t\t리포트\n");
	printf("*****************************************\n");
	printf("\n\n");
	printf("*****************************************\n");
	printf("\t\t\t학과: %s\n", "컴퓨터공학과");
	printf("\t\t\t학번: %s\n", "20180001");
	printf("\t\t\t성명: %s\n", "홍길동");
	printf("*****************************************\n");
	printf("\n\n");
	printf("일\t월\t화\t수\t목\t금\t토\n");
	printf("1\t2\t3\t4\t5\t6\t7\n");
	printf("8\t9\t10\t11\t12\t13\t14\n");
	printf("15\t16\t17\t18\t19\t20\t21\n");
	printf("22\t23\t24\t25\t26\t27\t28\n");
	printf("29\t30\t31\n");
	printf("\n\n");
	printf("7+8=%d\n", 7 + 8);
	printf("7-8=%d\n", 7 - 8);
	printf("7*8=%d\n", 7 * 8);
	printf("7/8=%d\n", 7 / 8);
	printf("\n");

	int num1, num2, result;	// 초기화하지 않으면 쓰레기 값이 들어감
	num1 = num2 = 0;	// 대입연산자를 사용해서 가능
	/*num1 = 0;
	num2 = 0;*/
	char ch = 'a';
	printf("%c", ch);
	printf("두 수를 입력(10 30):");	// 프롬프트
	int sNum = scanf("%d%d",&num1, &num2);	// scanf, printf 둘다 리턴값을 가지고 있음(인수의 갯수)
	//scanf 사용시: 프로젝트우클릭->속성->C++->일반->sdl검사 아니오
	result = num1 + num2;
	printf("%d+%d=%d\n", num1, num2, result);
	printf("scanf의 리턴값: %d\n", sNum);
	printf("num1의 주소: %x\n", &num1);
	printf("num2의 주소: %x\n", &num2);

	float f;
	double d;
	printf("실수를 입력:");
	scanf("%f", &f);
	d = f;
	//f = (float)d;	//반대로 하려면 형변환 시켜줌(큰걸 작은거에 넣어서)
	printf("f 값은 %6.1f\n", f);// 총 6자리를 차지하고 소수점 첫자리까지만 표현
	printf("d 값은 %lf\n", d); //lf double의 데이터 타입
	return 0;
}