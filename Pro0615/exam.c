#include<stdio.h>
#include<stdlib.h>

int main() {					// ����ȯ ����
	//int i;
	//double f;

	//f = 5 / 4;					// �ǿ����ڰ� �������� ���� �������� ����
	//printf("%f\n", f);			// 1.0

	//f = (double)5 / 4;			// ����ȯ ���� �� ��� ��
	//printf("%f\n", f);			// 1.25

	//f = 5.0 / 4;				// 5�� double���̹Ƿ� 4�� double������ �ڵ� ����ȯ ��
	//printf("%f\n", f);			// 1.25

	//f = (double)5 / (double)4;	// ���� ����
	//printf("%f\n", f);

	//i = 1.3 + 1.8;				// 3.1�� ������ i�� ���ԵǸ� ���� ��ȯ�� �߻�
	//printf("%d\n", i);			// 3

	//i = (int)1.3 + (int)1.8;	// �ǿ����� ��� 1�� �ٲ� �� ���
	//printf("%d\n", i);			// 2

	//printf("------if �� ����---------\n");
	//int a, b = 0;
	//char c;
	//printf("������ �Է��Ͻÿ�: ");
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
	//printf("���� �Է�:");
	//scanf("%d", &ch1);
	//if (ch1 % 4 == 0) {
	//	printf("%d \n", ch1);
	//}else {
	//	printf("%d \n", 4 * (ch1 / 4 + 1));
	//}

	printf("--------------------------\n");
	char ch;
	printf("���ڸ� �Է��Ͻÿ�(�� �� ��): ");
	getchar("%c", &ch);						// �ϳ��� ���ڸ� ����
	switch (ch) {
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
	
	printf("--------------------------\n");

	int x, y;
	printf("������ �Է��Ͻÿ�:");
	scanf("%d", &x);
	printf("������ �Է��Ͻÿ�:");
	scanf("%d", &y);
	if (x % y == 0)
		printf("����Դϴ�.\n");
	else
		printf("����� �ƴմϴ�.\n");
	
	printf("--------------------------\n");

	int i, j, w, z;
	printf("3���� ������ �Է��Ͻÿ�: ");
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
	printf("���� ���� ������ %d�Դϴ�.\n", z);

	printf("--------------------------\n");

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

	printf("--------------------------\n");

	int h, age;
	printf("Ű�� �Է��Ͻÿ�(cm)");
	scanf("%d", &h);
	printf("���̸� �Է��Ͻÿ�.");
	scanf("%d", &age);
	if (h >= 140 && age >= 10)
		printf("Ÿ�� �����ϴ�.\n");
	else
		printf("�˼��մϴ�.\n");

	printf("--------------------------\n");

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

	printf("--------------------------\n");



	return 0;
}