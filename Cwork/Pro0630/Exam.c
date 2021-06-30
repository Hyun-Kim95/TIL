#include<stdio.h>
#include<stdlib.h>
#include<Windows.h>		// Sleep 함수 쓰려고

// 계산기 함수들
void duhagy(int a,int b) {
	static cntd = 1;
	printf("덧셈은 총 %d번 실행되었습니다.\n",cntd);
	printf("연산결과: %d\n", a + b);
	cntd++;
}
void bbegy(int a, int b) {
	static cntb = 1;
	
	printf("뺄셈은 총 %d번 실행되었습니다.\n",cntb);
	printf("연산결과: %d\n", a - b);
	cntb++;
}
void gop(int a, int b) {
	static cntg = 1;
	printf("곱셈은 총 %d번 실행되었습니다.\n",cntg);
	printf("연산결과: %d\n", a * b);
	cntg++;
}
void nanugy(int a, int b) {
	static cntn = 1;
	printf("나눗셈은 총 %d번 실행되었습니다.\n",cntn);
	printf("연산결과: %d\n", a / b);
	cntn++;
}
// 주사위 난수 함수
void get_dice_face() {
	static int aa, bb, cc, dd, ee, ff;

	for (int i = 0; i < 100; i++) {
		Sleep(100);		// 0.1초 쉼
		int chek;
		srand(time(NULL));
		chek = rand() % 6;
		switch (chek) {
			case(0): aa++; break;
			case(1): bb++; break;
			case(2): cc++; break;
			case(3): dd++; break;
			case(4): ee++; break;
			case(5): ff++; break;
		}
	}
	printf("1->%d\n", aa);
	printf("2->%d\n", bb);
	printf("3->%d\n", cc);
	printf("4->%d\n", dd);
	printf("5->%d\n", ee);
	printf("6->%d\n", ff);
}
// 로그인 확인
void psw_check() {
	static int cnt = 1;
	for (int i = 0; i < 3; i++) {
		int psw;
		printf("비밀번호: ");
		scanf("%d", &psw);
		if (psw == 1234) {
			printf("로그인 성공\n");
			break;
		}
		else if(cnt==3){
			printf("로그인 시도횟수 초과\n");
		}
		cnt++;
	}
}
void get_random() {
	static int rnd;
	if (rnd == 0) {
		printf("초기화 실행\n");
		srand(time(NULL));
	}
	rnd = rand();
	printf("%d\n", rnd);
}
int sum(int a) {
	if (a == 1)
		return 1;
	else
		return a + sum(a - 1);
}
int power(int base, int raised) {
	if (raised == 1)
		return base;
	else
		return base * power(base, raised-1);
}
void show_digit(int x) {
	if (x / 10 >= 10)
		show_digit(x / 10);
	else if (x / 10 > 0)
		printf("%d ", x / 10);
	printf("%d ",x % 10);
}
int numbernum(int a) {
	static int cnt=1;
	if (a / 10 > 0) {
		cnt += 1;
		numbernum(a/10);
	}
	return cnt;
}
int numbersum(int a) {
	static int cnt = 0;
	if (a / 10 > 0) {
		numbersum(a / 10);
		cnt += a % 10;
	}
	else
		cnt += a;
	return cnt;
}
int susic(double a) {
	static double cnt = 1;
	if (a >= 2) {
		cnt += 1 / a;
		susic(a - 1);
	}
	return cnt;
}
int main() {
	printf("계산기\n\n");
	while (1) {
		int a, b;
		char c,chek;
		printf("연산을 입력하시오: ");
		scanf("%d%c%d", &a, &c, &b);
		switch (c) {
		case('+'): duhagy(a, b); break;
		case('-'): bbegy(a, b); break;
		case('*'): gop(a, b); break;
		case('/'): nanugy(a, b); break;
		}
		printf("계속하시겠습니까?(종료:n)");
		scanf(" %c", &chek);
		if (chek == 'n')
			break;
	}
	printf("\n주사위 난수\n");
	get_dice_face();
	printf("\n비밀번호검사\n");
	psw_check();
	printf("\n난수 초기화\n");
	for (int i = 0; i < 3; i++)
		get_random();
	printf("\n1~n까지의 합\n");
	int n;
	printf("정수를 입력하시오:");
	scanf("%d", &n);
	printf("1부터 %d까지의 합=%d\n",n,sum(n));
	printf("\n지수값 계산\n");
	int base, raised;
	printf("밑수: ");
	scanf("%d", &base);
	printf("지수: ");
	scanf("%d", &raised);
	printf("%d^%d=%d",base,raised,power(base, raised));
	printf("\n정수의 각 자리수\n");
	int number;
	printf("정수를 입력하시오: ");
	scanf("%d", &number);
	show_digit(number);
	printf("\n정수의 자리수맞추기\n");
	int abc;
	printf("정수를 입력하시오: ");
	scanf("%d", &abc);
	printf("자리수의 개수: %d\n",numbernum(abc));
	printf("\n각 자리수의 합계\n");
	int abcd;
	printf("정수를 입력하시오: ");
	scanf("%d", &abcd);
	printf("자리수의 합: %d", numbersum(abcd));
	printf("\n수식의 값\n");
	double abb;
	printf("n을 입력:");
	scanf("%lf", &abb);
	printf("%d", susic(abb));
	return 0;
}