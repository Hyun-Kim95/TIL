#include<stdio.h>
#include<stdlib.h>

int main() {					// ����ȯ ����
	int i;
	double f;

	f = 5 / 4;					// �ǿ����ڰ� �������� ���� �������� ����
	printf("%f\n", f);			// 1.0

	f = (double)5 / 4;			// ����ȯ ���� �� ��� ��
	printf("%f\n", f);			// 1.25

	f = 5.0 / 4;				// 5�� double���̹Ƿ� 4�� double������ �ڵ� ����ȯ ��
	printf("%f\n", f);			// 1.25

	f = (double)5 / (double)4;	// ���� ����
	printf("%f\n", f);

	i = 1.3 + 1.8;				// 3.1�� ������ i�� ���ԵǸ� ���� ��ȯ�� �߻�
	printf("%d\n", i);			// 3

	i = (int)1.3 + (int)1.8;	// �ǿ����� ��� 1�� �ٲ� �� ���
	printf("%d\n", i);			// 2

	printf("------if �� ����---------\n");
	int a, b = 0;
	char c;
	printf("������ �Է��Ͻÿ�(1 + 1): ");
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

	printf("\n�Է¹��� ���ڰ� 4�� �������, �ƴϸ� �Է¹��� ������ ū 4�� ��� ���\n");

	int ch1;
	
	printf("���� �Է�:");
	scanf("%d", &ch1);
	if (ch1 % 4 == 0) {
		printf("%d \n", ch1);
	}else {
		printf("%d \n", 4 * (ch1 / 4 + 1));
	}

	printf("\n�ϳ��� ���ڸ� �о�ͼ� ������ ������ ����\n");
	
	char chch;
	printf("�ϳ��� ���ڸ� �Է��Ͻÿ�:\n");
	
	getchar("%c", &chch);

	switch (chch)
	{
		case 'a':
			printf("�����Դϴ�.\n");
			break;
		case 'e':
			printf("�����Դϴ�.\n");
			break;
		case 'i':
			printf("�����Դϴ�.\n");
			break;
		case 'o':
			printf("�����Դϴ�.\n");
			break;
		case 'u':
			printf("�����Դϴ�.\n");
			break;
		default:
			printf("�����Դϴ�.\n");
			break;
	}
	
	printf("\n�ι�° �Է��� ���� ù��° �Է��� ���� ������� Ȯ��\n");

	int x, y;
	printf("ù��° ������ �Է��Ͻÿ�:");
	scanf("%d", &x);
	printf("�ι�° ������ �Է��Ͻÿ�:");
	scanf("%d", &y);
	if (x % y == 0)
		printf("����Դϴ�.\n");
	else
		printf("����� �ƴմϴ�.\n");
	
	printf("\n�� �߿� ���� ���� �� ���\n");

	int i1, j1, w1, z1;
	printf("3���� ������ �Է��Ͻÿ�: ");
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
	printf("���� ���� ������ %d�Դϴ�.\n", z1);

	printf("\n��ǻ�Ͷ� ���� ���� ��\n");

	int hum, com;
	printf("�����Ͻÿ�(1: ���� 2: ���� 3: ��)");
	scanf("%d", &hum);
	com = rand() % 3 + 1;	// 0 ~ 2 �߿� ������ ���� ���� 1�� ������(��, 1 ~ 3)
	if (hum == com)
		printf("�����ϴ�.\n");
	else if (hum == 1)
		if (com == 2)
			printf("��ǻ�Ͱ� �̰���.\n");
		else
			printf("����ڰ� �̰���.\n");
	else if (hum == 2)
		if (com == 3)
			printf("��ǻ�Ͱ� �̰���.\n");
		else
			printf("����ڰ� �̰���.\n");
	else
		if (com == 1)
			printf("��ǻ�Ͱ� �̰���.\n");
		else
			printf("����ڰ� �̰���.\n");

	printf("\n���̱ⱸ ���� Ȯ��(Ű:140, ����:10)\n");

	int h, age;
	printf("Ű�� �Է��Ͻÿ�(cm):");
	scanf("%d", &h);
	printf("���̸� �Է��Ͻÿ�:");
	scanf("%d", &age);
	if (h >= 140 && age >= 10)
		printf("Ÿ�� �����ϴ�.\n");
	else
		printf("�˼��մϴ�.\n");

	printf("\n�� �� ���� ���\n");

	int m;
	printf("����ȣ�� �Է��Ͻÿ�: ");
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

	printf("\nǥ��ü������ Ȯ��\n");

	int weight, height;
	double ans;
	printf("ü�߰� Ű�� �Է��ϼ���: ");
	scanf("%d %d", &weight, &height);
	ans = (height - 100) * 0.9;
	if (weight < ans)
		printf("��ü���Դϴ�.\n");
	else if (weight == ans)
		printf("ǥ���Դϴ�.\n");
	else
		printf("��ü���Դϴ�.\n");

	printf("\n�����̿���� ������ ���\n");

	int time_a, age1, payy;
	printf("���� �ð��� ���̸� �Է��Ͻÿ�(�ð�, ����): ");
	scanf("%d %d", &time_a, &age1);
	if (time_a < 17)
		if (age1 <= 12 || age1 >= 65)
			payy = 25000;
		else
			payy = 34000;
	else
		payy = 10000;
	printf("����� %d�Դϴ�.\n", payy);

	printf("\n�Լ��� ���� ���\n");

	int xx, fx;
	printf("x�� ���� �Է��Ͻÿ�:");
	scanf("%d", &xx);
	if (xx > 0)
		fx = xx * 7 + 2;
	else
		fx = xx * xx - xx * 9 + 2;
	printf("f(x)�� ���� %d\n", fx);

	printf("\n��ǥ�� ��и�\n");

	int x1, y1;
	printf("��ǥ(x,y): ");
	scanf("%d %d", &x1, &y1);
	if (x1 > 0)
		if (y1 > 0)
			printf("1��и�\n");
		else
			printf("4��и�\n");
	else
		if (y1 > 0)
			printf("2��и�\n");
		else
			printf("3��и�\n");

	printf("\nr�� rectangle, t�� triangle, c�� circle, �������� unwnown\n");

	char actt;
	printf("���ڸ� �Է��Ͻÿ�: ");
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