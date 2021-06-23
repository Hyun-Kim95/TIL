#include<stdio.h>
#include<math.h>
#include<time.h>

double square1(double a) {
	return a * a;
}
void check_alpha() {
	char b[] = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char ch;
	int cnt = 0;
	printf("문자를 입력하시오: ");
	scanf(" %c", &ch);
	for (int i=0;i<26;i++)
	{
		if (ch == b[i]) {
			printf("%c는 알파벳 문자입니다.\n", ch);;
			cnt = 1;
		}
	}
	if (cnt == 0)
		printf("%c는 알파벳 문자가 아닙니다.\n", ch);
}
double cal_area(double a) {
	return 3.141592 * a * a;
}
int is_leap(int a) {
	if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		return 366;
	else
		return 365;
}
int round1(double a) {
	return (int)(a + 0.5);
}
void even1(int a) {
	printf("even의 결과: %s\n",(a % 2) ? "홀수" : "짝수");
}
void absolute1(int a) {
	printf("absolute의 결과: %d\n", (a < 0) ? a * (-1) :a);
}
void sign1(int a) {
	printf("sign의 결과: ");
	if (a > 0)
		printf("양수\n");
	else if (a == 0)
		printf("0\n");
	else
		printf("음수\n");
}
void get_tax(int a) {
	if (a > 1000)
		printf("소득세는 %lf입니다\n", (double)a / 100 * 8);
	else
		printf("소득세는 %d입니다\n", a / 10);
}
void sin_degree() {
	for (double i = 0; i <= 180; i+=10) {
		printf("sin(%lf)의 값은 %lf\n", i, sin(i * 3.1415926 / 180.0));
	}
}
int b_rand() {
	return rand() % 2;
}
double f_rand() {		// rand()는 0~32767 중에 무작위로 반환해 주는 함수라서
	double a = rand() / (double)32767;
	return a;
}
void print_value(int a) {
	for (int i = 0; i < a; i++) {
		printf("*");
	}
	printf("\n");
}
void is_muliple() {
	int n, m;
	printf("첫번째 정수를 입력하시오: ");
	scanf("%d", &n);
	printf("두번째 정수를 입력하시오: ");
	scanf("%d", &m);
	if (n % m)
		printf("%d는 %d의 배수가 아닙니다.\n", n, m);
	else
		printf("%d는 %d의 배수입니다.\n", n, m);
}
void get_distance() {
	double x1, x2, y1, y2, result = 0;
	printf("첫번째 점의 좌표를 입력하시오:(x,y)");
	scanf("%lf %lf", &x1, &y1);
	printf("두번째 점의 좌표를 입력하시오:(x,y)");
	scanf("%lf %lf", &x2, &y2);
	result = sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	printf("두점 사이의 거리는 %lf입니다.\n", result);
}
void is_prime() {
	printf("2 ");
	for (int i = 2; i <= 100; i++) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0)
				break;
			if (j == i - 1)
				printf("%d ",i);
		}
	}
}
void factorial() {
	int a, b = 1;
	double cnt = 0;
	printf("어디까지 계산할까요?:");
	scanf("%d", &a);
	for (int i = 1; i <= a; i++) {
		b *= i;
		cnt += 1.0 / b;
	}
	printf("오일러의 수는 %lf입니다.\n", cnt+1);
}
void f_equal() {
	double a, b, A, B;
	printf("실수를 입력하시오: ");
	scanf("%lf", &a);
	printf("실수를 입력하시오: ");
	scanf("%lf", &b);
	A = a - b;
	if (a - b < 0)
		A *= -1;
	if (a < 0)
		a *= -1;
	if (b < 0)
		b *= -1;
	B = (a > b) ? b : a;
	if (A / B < 0.000001)
		printf("두 개의 실수는 근사적으로 같음\n");
	else
		printf("두 개의 실수는 서로 다름\n");
}
void func_func() {
	while (1) {
		int a, b, c, result = 0;
		char ch;
		printf("=============================\n");
		printf("MENU\n");
		printf("=============================\n");
		printf("1. 덧셈\n");
		printf("2. 뺄셈\n");
		printf("3. 곱셈\n");
		printf("4. 나눗셈\n");
		printf("5. 나머지\n");
		printf("원하는 메뉴를 선택하시오(1~5): ");
		scanf("%d", &a);
		printf("숫자 2개를 입력하시오: ");
		scanf("%d %d", &b, &c);
		switch (a)
		{
		case 1: result = b + c; break;
		case 2: result = b - c; break;
		case 3: result = b * c; break;
		case 4: result = b / c; break;
		case 5: result = b % c; break;
		}
		printf("연산결과: %d\n", result);
		printf("계속하려면 y를 누르시오: ");
		scanf(" %c", &ch);
		if (c != 'y')
			break;
	}
}
// main함수 시작
int main() {
	printf("제곱구하기\n");
	double x;
	printf("정수를 입력하시오: ");
	scanf("%lf", &x);
	printf("주어진 정수 %lf의 제곱은 %lf입니다.\n", x, square1(x));

	printf("\n알파벳이 맞는지 확인\n");
	check_alpha();

	printf("\n원의 면적 구하기\n");
	double radius1;
	printf("원의 반지름을 입력하시오: ");
	scanf("%lf", &radius1);
	printf("원의 면적은 %lf입니다.\n", cal_area(radius1));

	printf("\n윤년확인하기\n");
	int year;
	printf("연도를 입력하시오: ");
	scanf("%d", &year);
	printf("%d년은 %d일 입니다.\n", year, is_leap(year));

	printf("\n반올림 구하기\n");
	double f;
	printf("실수를 입력하시오: ");
	scanf("%lf", &f);
	printf("반올림한 값은 %d입니다\n", round1(f));

	printf("\n여러가지 함수 테스트\n");
	int n;
	printf("정수를 입력하시오: ");
	scanf("%d", &n);
	even1(n);
	absolute1(n);
	sign1(n);

	printf("\n소득세 출력\n");
	int income;
	printf("소득을 입력하시오(만원): ");
	scanf("%d", &income);
	get_tax(income);

	printf("\n사인함수 출력\n");
	sin_degree();

	printf("\n무작위 1과 0\n");
	srand(time(NULL));
	for (int i = 0; i < 5; i++) {
		printf("%d ",b_rand());
	}
	
	printf("\n동전 앞뒤 맞추기\n");
	while (1)
	{
		int aa;
		char ch1;
		printf("앞면 또는 뒷면(1 또는 0): ");
		scanf("%d", &aa);
		if (aa == b_rand())
			printf("맞았습니다.\n");
		else
			printf("틀렸습니다.\n");
		printf("계속하시겠습니까?(y 또는 n): ");
		scanf(" %c", &ch1);
		if (ch1 == 'n')
			break;
	}

	printf("\n0.0~1.0까지 난수 발생\n");
	for (int i = 0; i < 5; i++) {
		printf("%lf ", f_rand());
	}

	printf("\n막대 그래프\n");
	int s;
	while (1) {
		printf("값을 입력하시오(종료는 음수): ");
		scanf("%d", &s);
		if (s < 0)
			break;
		print_value(s);
	}

	printf("\n배수 확인\n");
	is_muliple();

	printf("\n두 점 사이의 거리 계산\n");
	get_distance();

	printf("\n소수인지 검사\n");
	is_prime();
	printf("\n");

	printf("\n오일러의 수를 계산\n");
	factorial();

	printf("\n두 실수가 근사적으로 같은지 확인\n");
	f_equal();

	printf("\n계산기\n");
	func_func();
	return 0;
}