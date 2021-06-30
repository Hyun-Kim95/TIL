#include<stdio.h>
#include<stdlib.h>
#include<Windows.h>		// Sleep �Լ� ������

// ���� �Լ���
void duhagy(int a,int b) {
	static cntd = 1;
	printf("������ �� %d�� ����Ǿ����ϴ�.\n",cntd);
	printf("������: %d\n", a + b);
	cntd++;
}
void bbegy(int a, int b) {
	static cntb = 1;
	
	printf("������ �� %d�� ����Ǿ����ϴ�.\n",cntb);
	printf("������: %d\n", a - b);
	cntb++;
}
void gop(int a, int b) {
	static cntg = 1;
	printf("������ �� %d�� ����Ǿ����ϴ�.\n",cntg);
	printf("������: %d\n", a * b);
	cntg++;
}
void nanugy(int a, int b) {
	static cntn = 1;
	printf("�������� �� %d�� ����Ǿ����ϴ�.\n",cntn);
	printf("������: %d\n", a / b);
	cntn++;
}
// �ֻ��� ���� �Լ�
void get_dice_face() {
	static int aa, bb, cc, dd, ee, ff;

	for (int i = 0; i < 100; i++) {
		Sleep(100);		// 0.1�� ��
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
// �α��� Ȯ��
void psw_check() {
	static int cnt = 1;
	for (int i = 0; i < 3; i++) {
		int psw;
		printf("��й�ȣ: ");
		scanf("%d", &psw);
		if (psw == 1234) {
			printf("�α��� ����\n");
			break;
		}
		else if(cnt==3){
			printf("�α��� �õ�Ƚ�� �ʰ�\n");
		}
		cnt++;
	}
}
void get_random() {
	static int rnd;
	if (rnd == 0) {
		printf("�ʱ�ȭ ����\n");
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
	printf("����\n\n");
	while (1) {
		int a, b;
		char c,chek;
		printf("������ �Է��Ͻÿ�: ");
		scanf("%d%c%d", &a, &c, &b);
		switch (c) {
		case('+'): duhagy(a, b); break;
		case('-'): bbegy(a, b); break;
		case('*'): gop(a, b); break;
		case('/'): nanugy(a, b); break;
		}
		printf("����Ͻðڽ��ϱ�?(����:n)");
		scanf(" %c", &chek);
		if (chek == 'n')
			break;
	}
	printf("\n�ֻ��� ����\n");
	get_dice_face();
	printf("\n��й�ȣ�˻�\n");
	psw_check();
	printf("\n���� �ʱ�ȭ\n");
	for (int i = 0; i < 3; i++)
		get_random();
	printf("\n1~n������ ��\n");
	int n;
	printf("������ �Է��Ͻÿ�:");
	scanf("%d", &n);
	printf("1���� %d������ ��=%d\n",n,sum(n));
	printf("\n������ ���\n");
	int base, raised;
	printf("�ؼ�: ");
	scanf("%d", &base);
	printf("����: ");
	scanf("%d", &raised);
	printf("%d^%d=%d",base,raised,power(base, raised));
	printf("\n������ �� �ڸ���\n");
	int number;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%d", &number);
	show_digit(number);
	printf("\n������ �ڸ������߱�\n");
	int abc;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%d", &abc);
	printf("�ڸ����� ����: %d\n",numbernum(abc));
	printf("\n�� �ڸ����� �հ�\n");
	int abcd;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%d", &abcd);
	printf("�ڸ����� ��: %d", numbersum(abcd));
	printf("\n������ ��\n");
	double abb;
	printf("n�� �Է�:");
	scanf("%lf", &abb);
	printf("%d", susic(abb));
	return 0;
}