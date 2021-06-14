#include<stdio.h>

int main(void) {
	double light_speed = 300000;
	double distance = 149600000;

	int time;
	time = distance / light_speed;

	printf("빛의 속도는 %fkm/s \n", light_speed);
	printf("태양과 지구와의 거리 %fkm \n", distance);
	printf("도달 시간은 %d분 %d초 \n", (int)time/60, (int)time%60);

	printf("***********************\n");
	
	int user, change = 0;
	int price, c5000, c1000, c500, c100;

	printf("물건 값을 입력하시오: ");
	scanf("%d", &price);			// 물건 값을 입력 받음
	printf("사용자가 낸 돈: ");
	scanf("%d", &user);
	change = user - price;			// 거스름 돈을 change에 저장

	c5000 = change / 5000;			// 몫 연산자를 사용하여 5000원 권의 개수를 계산
	change %= 5000;					// 나머지 연산자를 사용하여 남은 잔돈을 계산

	c1000 = change / 1000;
	change %= 1000;

	c500 = change / 500;
	change %= 500;

	c100 = change / 100;
	change %= 100;

	printf("오천원권: %d\n", c5000);
	printf("천원권: %d\n", c1000);
	printf("오백원 동전: %d\n", c500);
	printf("백원 동전: %d\n", c100);

	printf("**********************\n");

	// 윤년 프로그램
	int year, result;

	printf("연도를 입력하시오: ");
	scanf("%d", &year);

	result = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	printf("result=%d \n", result);

	printf("**********************\n");

	int a, b, c, d, max_value;
	printf("숫자 4개를 입력하시오: ");
	scanf("%d%d%d%d", &a, &b, &c, &d);
	max_value = (a > b) ? a : b;
	max_value = (max_value > c) ? max_value : c;
	max_value = (max_value > d) ? max_value : d;
	printf("max_value=%d \n", max_value);

	printf("**********************\n");

	// 비트연산
	printf("AND: %08x\n", 0x9 & 0xA);
	printf("OR: %08x\n", 0x9 | 0xA);
	printf("XOR: %08x\n", 0x9 ^ 0xA);
	printf("NOT: %08x\n", ~0x9);
	printf("<<: %08x\n", 0x4 << 1);
	printf(">>: %08x\n", 0x4 >> 1);

	printf("***********예제***********\n");
	// 예제
	float f1;
	printf("실수를 입력하시오: ");
	scanf("%f", &f1);
	printf("실수형식으로는 %f 입니다 \n", f1);
	printf("지수형식으로는 %e 입니다 \n", f1);		// 지수형식은 %e로 표현

	int c1;
	printf("16진수 정수를 입력하시오: ");
	scanf("%x", &c1);
	printf("8진수로는 %#o 입니다 \n", c1);
	printf("10진수로는 %d 입니다 \n", c1);
	printf("16진수로는 %#x 입니다 \n", c1);			// %#x : 0x11과 같이 표현

	int x = 10;
	int y = 20;
	int z;
	printf("x=%d y=%d\n", x, y);
	z = x;
	x = y;
	y = z;
	printf("x=%d y=%d\n", x, y);

	double w, h, d;
	printf("상자의 가로 세로 높이를 한번에 입력: ");
	scanf("%lf%lf%lf", &w, &h, &d);					// %lf : double
	printf("상자의 부피는 %lf 입니다\n", w * h * d);

	int p1;
	printf("평을 입력하세요: ");
	scanf("%d", &p1);
	printf("%f 평방미터 입니다\n", p1*3.3);

	printf("%f", 3.32e-3 + 9.76e-8);

	float a, b;
	printf("질량(kg): ");
	scanf("%f", &a);
	printf("속도(m/s): ");
	scanf("%f", &b);
	printf("운동에너지(J): %f\n", a * b * b / 2.0);

	int ac;
	printf("아스키 코드값을 입력하시오: ");
	scanf("%d", &ac);
	printf("문자:%c\n", ac);

	printf("%c %c %c\n", 'a' + 1, 'a' + 2, 'a' + 3);

	printf("\a화재가 발생하였습니다\n");

	printf("\"ASCII code\", \'A\', \'B\', \'C\'\n\\t \\a \\n");
	return 0;
}