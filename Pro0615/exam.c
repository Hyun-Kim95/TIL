#include<stdio.h>
#include<stdlib.h>

int main() {					// 형변환 예제
	//int i;
	//double f;

	//f = 5 / 4;					// 피연산자가 정수여서 정수 연산으로 계산됨
	//printf("%f\n", f);			// 1.0

	//f = (double)5 / 4;			// 형변환 연산 후 계산 함
	//printf("%f\n", f);			// 1.25

	//f = 5.0 / 4;				// 5가 double형이므로 4도 double형으로 자동 형변환 됨
	//printf("%f\n", f);			// 1.25

	//f = (double)5 / (double)4;	// 위와 같음
	//printf("%f\n", f);

	//i = 1.3 + 1.8;				// 3.1이 정수형 i에 대입되면 내림 변환이 발생
	//printf("%d\n", i);			// 3

	//i = (int)1.3 + (int)1.8;	// 피연산자 모두 1로 바뀐 후 계산
	//printf("%d\n", i);			// 2

	//printf("------if 문 예제---------\n");
	//int a, b = 0;
	//char c;
	//printf("수식을 입력하시오: ");
	//scanf("%d %c %d", &a, &c, &b);
	//if (c == '+')
	//	printf("%d %c %d = %d\n", a, c, b, a+b);
	//else if (c=='-')
	//	printf("%d %c %d = %d\n", a, c, b, a-b);
	//else if (c=='*')
	//	printf("%d %c %d = %d\n", a, c, b, a*b);
	//else if (c == '/')
	//	printf("%d %c %d = %d\n", a, c, b, a / b);
	//else
	//	printf("%d %c %d = %d\n", a, c, b, a%b);

	//printf("--------------------------\n");

	//int ch1;
	//
	//printf("숫자 입력:");
	//scanf("%d", &ch1);
	//if (ch1 % 4 == 0) {
	//	printf("%d \n", ch1);
	//}else {
	//	printf("%d \n", 4 * (ch1 / 4 + 1));
	//}

	printf("--------------------------\n");
	char ch;
	printf("문자를 입력하시오(ㄱ ㅐ ㅑ): ");
	getchar("%c", &ch);						// 하나의 문자를 읽음
	switch (ch) {
		case 'a':
			printf("모음입니다.\n");
			break;
		case 'e':
			printf("모음입니다.\n");
			break;
		case 'i':
			printf("모음입니다.\n");
			break;
		case 'o':
			printf("모음입니다.\n");
			break;
		case 'u':
			printf("모음입니다.\n");
			break;
		default:
			printf("자음입니다.\n");
			break;
	}
	
	printf("--------------------------\n");

	int x, y;
	printf("정수를 입력하시오:");
	scanf("%d", &x);
	printf("정수를 입력하시오:");
	scanf("%d", &y);
	if (x % y == 0)
		printf("약수입니다.\n");
	else
		printf("약수가 아닙니다.\n");
	
	printf("--------------------------\n");

	int i, j, w, z;
	printf("3개의 정수를 입력하시오: ");
	scanf("%d %d %d", &i, &j, &w);
	if (i < j)
		if (i < w)
			z = i;
		else
			z = w;
	else
		if (j < w)
			z = j;
		else
			z = w;
	printf("제일 작은 정수는 %d입니다.\n", z);

	printf("--------------------------\n");

	int hum, com;
	printf("선택하시오(1: 가위 2: 바위 3: 보)");
	scanf("%d", &hum);
	com = rand() % 3 + 1;	// 0 ~ 2 중에 랜덤한 수를 고르고 1을 더해줌(즉, 1 ~ 3)
	if (hum == com)
		printf("비겼습니다.\n");
	else if (hum == 1)
		if (com == 2)
			printf("컴퓨터가 이겼음.\n");
		else
			printf("사용자가 이겼음.\n");
	else if (hum == 2)
		if (com == 3)
			printf("컴퓨터가 이겼음.\n");
		else
			printf("사용자가 이겼음.\n");
	else
		if (com == 1)
			printf("컴퓨터가 이겼음.\n");
		else
			printf("사용자가 이겼음.\n");

	printf("--------------------------\n");

	int h, age;
	printf("키를 입력하시오(cm)");
	scanf("%d", &h);
	printf("나이를 입력하시오.");
	scanf("%d", &age);
	if (h >= 140 && age >= 10)
		printf("타도 좋습니다.\n");
	else
		printf("죄송합니다.\n");

	printf("--------------------------\n");

	int m;
	printf("월번호를 입력하시오: ");
	scanf("%d", &m);
	switch (m) {
		case 1: printf("Jan");
			break;
		case 2: printf("Feb");
			break;
		case 3: printf("Mar");
			break;
		case 4: printf("Apr");
			break;
		case 5: printf("May");
			break;
		case 6: printf("Jun");
			break;
		case 7: printf("Jul");
			break;
		case 8: printf("Aug");
			break;
		case 9: printf("Sep");
			break;
		case 10: printf("Oct");
			break;
		case 11: printf("Nov");
			break;
		case 12: printf("Dec");
			break;
	}

	printf("--------------------------\n");



	return 0;
}