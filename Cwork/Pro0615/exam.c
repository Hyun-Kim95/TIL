#include<stdio.h>
#include<stdlib.h>

int main() {					// 형변환 예제
	int i;
	double f;

	f = 5 / 4;					// 피연산자가 정수여서 정수 연산으로 계산됨
	printf("%f\n", f);			// 1.0

	f = (double)5 / 4;			// 형변환 연산 후 계산 함
	printf("%f\n", f);			// 1.25

	f = 5.0 / 4;				// 5가 double형이므로 4도 double형으로 자동 형변환 됨
	printf("%f\n", f);			// 1.25

	f = (double)5 / (double)4;	// 위와 같음
	printf("%f\n", f);

	i = 1.3 + 1.8;				// 3.1이 정수형 i에 대입되면 내림 변환이 발생
	printf("%d\n", i);			// 3

	i = (int)1.3 + (int)1.8;	// 피연산자 모두 1로 바뀐 후 계산
	printf("%d\n", i);			// 2

	printf("------if 문 예제---------\n");
	int a, b = 0;
	char c;
	printf("수식을 입력하시오(1 + 1): ");
	scanf("%d %c %d", &a, &c, &b);
	if (c == '+')
		printf("%d %c %d = %d\n", a, c, b, a+b);
	else if (c=='-')
		printf("%d %c %d = %d\n", a, c, b, a-b);
	else if (c=='*')
		printf("%d %c %d = %d\n", a, c, b, a*b);
	else if (c == '/')
		printf("%d %c %d = %d\n", a, c, b, a / b);
	else
		printf("%d %c %d = %d\n", a, c, b, a%b);

	printf("\n입력받은 숫자가 4의 배수인지, 아니면 입력받은 수보다 큰 4의 배수 출력\n");

	int ch1;
	
	printf("숫자 입력:");
	scanf("%d", &ch1);
	if (ch1 % 4 == 0) {
		printf("%d \n", ch1);
	}else {
		printf("%d \n", 4 * (ch1 / 4 + 1));
	}

	printf("\n하나의 문자를 읽어와서 모음과 자음을 구분\n");
	
	char chch;
	printf("하나의 문자를 입력하시오:\n");
	
	getchar("%c", &chch);

	switch (chch)
	{
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
	
	printf("\n두번째 입력한 수가 첫번째 입력한 수의 약수인지 확인\n");

	int x, y;
	printf("첫번째 정수를 입력하시오:");
	scanf("%d", &x);
	printf("두번째 정수를 입력하시오:");
	scanf("%d", &y);
	if (x % y == 0)
		printf("약수입니다.\n");
	else
		printf("약수가 아닙니다.\n");
	
	printf("\n셋 중에 가장 작은 수 출력\n");

	int i1, j1, w1, z1;
	printf("3개의 정수를 입력하시오: ");
	scanf("%d %d %d", &i1, &j1, &w1);
	if (i1 < j1)
		if (i1 < w1)
			z1 = i1;
		else
			z1 = w1;
	else
		if (j1 < w1)
			z1 = j1;
		else
			z1 = w1;
	printf("제일 작은 정수는 %d입니다.\n", z1);

	printf("\n컴퓨터랑 가위 바위 보\n");

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

	printf("\n놀이기구 제한 확인(키:140, 나이:10)\n");

	int h, age;
	printf("키를 입력하시오(cm):");
	scanf("%d", &h);
	printf("나이를 입력하시오:");
	scanf("%d", &age);
	if (h >= 140 && age >= 10)
		printf("타도 좋습니다.\n");
	else
		printf("죄송합니다.\n");

	printf("\n월 별 영어 약어\n");

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

	printf("\n표준체중인지 확인\n");

	int weight, height;
	double ans;
	printf("체중과 키를 입력하세요: ");
	scanf("%d %d", &weight, &height);
	ans = (height - 100) * 0.9;
	if (weight < ans)
		printf("저체중입니다.\n");
	else if (weight == ans)
		printf("표준입니다.\n");
	else
		printf("과체중입니다.\n");

	printf("\n자유이용권의 가격을 계산\n");

	int time_a, age1, payy;
	printf("현재 시간과 나이를 입력하시오(시간, 나이): ");
	scanf("%d %d", &time_a, &age1);
	if (time_a < 17)
		if (age1 <= 12 || age1 >= 65)
			payy = 25000;
		else
			payy = 34000;
	else
		payy = 10000;
	printf("요금은 %d입니다.\n", payy);

	printf("\n함수의 값을 계산\n");

	int xx, fx;
	printf("x의 값을 입력하시오:");
	scanf("%d", &xx);
	if (xx > 0)
		fx = xx * 7 + 2;
	else
		fx = xx * xx - xx * 9 + 2;
	printf("f(x)의 값은 %d\n", fx);

	printf("\n좌표별 사분면\n");

	int x1, y1;
	printf("좌표(x,y): ");
	scanf("%d %d", &x1, &y1);
	if (x1 > 0)
		if (y1 > 0)
			printf("1사분면\n");
		else
			printf("4사분면\n");
	else
		if (y1 > 0)
			printf("2사분면\n");
		else
			printf("3사분면\n");

	printf("\nr은 rectangle, t는 triangle, c는 circle, 나머지는 unwnown\n");

	char actt;
	printf("문자를 입력하시오: ");
	scanf("%c", &actt);
	if (actt == 'R' || actt == 'r')
		printf("Rectangle\n");
	else if (actt == 'T' || actt == 't')
		printf("Triangle\n");
	else if (actt == 'C' || actt == 'c')
		printf("Circle\n");
	else
		printf("Unknown\n");

	return 0;
}