#include<stdio.h>
#include<limits.h>	// 최대값 확인 가능

int main() {

	float body1, body2;
	printf("몸무게를 입력하세요:");
	scanf("%f%f", &body1, &body2);
	printf("평균 몸무게: %0.1f", (body1 + body2) / 2);	// 0자리수 1 소수점자리수
	// '0' -> 48
	// '1' -> 49
	// 'A' -> 65
	// 'a' -> 97
	// "1" -> '1''\0'	문자열은 마지막에 널 문자가 들어감

	printf("\n");
	double w, h, area, perimeter;
	printf("사각형의 가로와 세로를 입력(1.2 2.3):");
	scanf("%lf%lf", &w, &h);
	area = w * h;
	perimeter = 2 * (w + h);
	printf("사각형의 넓이: %lf\n 사각형의 둘레: %lf", area, perimeter);
	char ch = -51;
	char ch1 = 0xd6;		// 16진수표현은 앞에 0x를 붙히면 됨: -42
	char ch2 = 0xff;		// -1
	int ch3 = 0xff;		// 255: int형은 4바이트라서 0xffffffff 가 -1
	printf("ch: %d, %d, %d, %d\n", ch, ch1, ch2, ch3);
	//8진법은 앞에 0을 붙히면 됨

	short s_money = SHRT_MAX;	// 최대값으로 초기화 32767
	s_money += 1;
	printf("s_money = %d\n", s_money);	// -32768	오버플로우 발생!
										// 오버플로우: 범위를 넘어가서 최저(최대)부터 시작
	
	
	// 예제
	float a, b, c, sum, avg;
	printf("실수를 입력하시오: ");
	scanf("%f", &a);
	printf("실수를 입력하시오: ");
	scanf("%f", &b);
	printf("실수를 입력하시오: ");
	scanf("%f", &c);
	sum = a + b + c;
	avg = sum / 3;
	printf("합은 %f이고 평균은 %f입니다.\n", sum, avg);

	float d;
	printf("마일을 입력하시오: ");
	scanf("%f", &d);
	printf("%0.1f마일은 %f미터입니다.\n",d, 1609 * d);

	float e, f;
	printf("삼각형의 밑변: ");
	scanf("%f", &e);
	printf("삼각형의 높이: ");
	scanf("%f", &f);
	printf("삼각형의 넓이: %f\n", e*f/2);
	
	float g;
	printf("화씨값을 입력하시오: ");
	scanf("%f", &g);
	printf("섭씨값은 %f도 입니다. \n", (5 * (g - 32))/9);

	return 0;
}