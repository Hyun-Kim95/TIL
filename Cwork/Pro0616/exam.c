#include<stdio.h>
#include<stdlib.h>
int main() {
	printf("ī��Ʈ�ϱ�+���Ҹ�\n");
	int count;
	printf("ī������ �ʱⰪ�� �Է��Ͻÿ�: ");
	scanf("%d", &count);
	while (count>0)
	{
		printf("%d ", count);
		count--;
	}
	printf("\a\n\n");

	printf("100 ������ �� �߿� 3�� ����� �� ���ϱ�\n");
	int hap = 0, i = 1;
	while (i<=100)
	{
		if (i % 3 == 0)
			hap += i;
		i++;
	}
	printf("1���� 100 ������ ��� 3�� ����� ���� %d�Դϴ�.\n\n", hap);

	printf("�Է��� ������ ��� ����� ���\n");
	int j=2, a, yaksu;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%d", &a);
	printf("���: 1");
	while (j <= a)
	{
		if (a % j == 0)
			printf(" %d", j);
		j++;
	}
	printf("\n\n");

	printf("\n�ݺ���Ʈ�� �̿��Ͽ� ���� ���\n");
	int k = 1;
	while (k<= 7)
	{
		int p = 1;
		while (p <= 7-k )
		{
			printf(" ");
			p++;
		}
		int w = 1;
		while (w <= k)
		{
			printf("%c", '*');
			w++;
		}
		printf("\n");
		k++;
	}
	printf("\n\n");


	printf("(����)������\n");
	int aa, bb, cc, dd, sum=0;
	srand(time(NULL));
	aa = 1-((rand() % 10) / 6);	// Ȯ�� ����
	if (aa == 1)				// 0~9������ 6���� ���� ��
		printf("x");			// 0~5������ 0, 6~9������ 1 �̹Ƿ�
	else						// 1���� �� ���� �������μ� 1�̳��� Ȯ�� 60%
		printf("o");			// 0�� ���� Ȯ�� 40%�� ��
	bb = rand() % 2;
	if (bb == 1)
		printf("x");
	else
		printf("o");
	cc = rand() % 2;
	if (cc == 1)
		printf("x");
	else
		printf("o");
	dd = rand() % 2;
	if (dd == 1)
		printf("x");
	else
		printf("o");
	sum = aa + bb + cc + dd;
	switch (sum)
	{
		case 0:printf(":��"); break;
		case 1:printf(":��"); break;
		case 2:printf(":��"); break;
		case 3:printf(":��"); break;
		case 4:printf(":��"); break;
		default:
			printf("����\n");
			break;
	}
	printf("\n\n");
	printf("��(*) ���\n");
	int get_a;
	printf("���ϴ� ���� �Է�:");
	scanf("%d", &get_a);
	for (int ii = 0; ii < get_a; ii++) {
		for (int jj = 0; jj <get_a - ii; jj++) {
			printf("*");
		}
		printf("\n");
	}
	printf("\n\n");
	printf("��ø �ݺ���\n");
	int zero0, zero1, five;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%d", &five);
	for (zero0 = 1; zero0 <= five; zero0++)
	{
		for (zero1 = 1; zero1 <= zero0; zero1++)
		{
			printf("%d ", zero1);
		}
		printf("\n");
	}
	printf("\n\n");

	printf("���� ����\n");
	printf("*****************\n");
	printf("a---- Add\n");
	printf("s---- Subtract\n");
	printf("m---- Multiply\n");
	printf("d---- Divide\n");
	printf("q---- Quit\n");
	printf("*****************\n");
	while (1)
	{
		int one, two;
		char bee;
		
		printf("������ �Է��Ͻÿ�:");
		scanf(" %c", &bee);
		if (bee == 'q')
			break;
		printf("�μ��� �������� �и��Ͽ� �Է��Ͻÿ�:");
		scanf(" %d %d", &one, &two);
		switch (bee)
		{
			case 'a': printf("\n%d\n", one + two); break;
			case 's': printf("\n%d\n", one - two); break;
			case 'm': printf("\n%d\n", one * two); break;
			case 'd': printf("\n%d\n", one / two); break;
		}
	}
	printf("\n\n");
	printf("2�� 100���̿� �ִ� ��� �Ҽ� ���\n");
	
	for(int i = 2;i<100;i++)
	{
		int cnt = 0;
		for (int j = 2; j < i; j++)
		{
			if (i % j == 0)
				cnt += 1;
		}
		if (cnt == 0)
			printf("%d ", i);
	}
	printf("\n\n");
	while (1)
	{
		int stick;
		printf("������ ����(����: -1): ");
		scanf("%d", &stick);
		if (stick == -1)
			break;
		for (int i = 0; i < stick; i++)
		{
			printf("*");
		}
		printf("\n");
	}
	printf("\n\n");
	printf("1~n�� ���� 10000�� ���� �ʴ� n�� �ִ밪\n");
	int number = 0, summ = 0;
	while (summ<10000)
	{
		number++;
		summ += number;
	}
	printf("1���� %d������ ���� %d�Դϴ�.\n",number-1,summ-number);

	printf("\n\n");
	printf("�Ǽ��� �ŵ� ����\n");
	double zz, zz1;
	int zegop;
	printf("�Ǽ��� ���� �Է��Ͻÿ�:");
	scanf("%lf", &zz);
	zz1 = zz;
	printf("�ŵ�����Ƚ���� �Է��Ͻÿ�:");
	scanf(" %d", &zegop);
	for (int cntt = 1; cntt < zegop; cntt++)
	{
		zz *= zz1;
	}
	printf("������� %lf\n",zz);
	printf("\n\n");
	printf("n������ ������ �� ���ϱ�\n");
	int nn,ccnt=0;
	printf("n�� ���� �Է��Ͻÿ�: ");
	scanf(" %d", &nn);
	for (int i = 1; i <= nn; i++)
	{
		ccnt += i * i;
	}
	printf("��갪�� %d�Դϴ�\n",ccnt);
	printf("\n\n");
	printf("�Ǻ���ġ����\n");
	int fib, an=1, bn=0, cn=1;
	printf("���° �ױ��� ���ұ��? ");
	scanf("%d", &fib);
	printf("0, 1");
	for (int i = 2; i <= fib; i++)
	{
		cn = an + bn;
		printf(", %d", cn);
		bn = an;
		an = cn;
	}
	printf("\n\n");
	printf("�������ϱ�\n");
	int n2, r2, ncr=1;
	printf("n�� ��: ");
	scanf("%d", &n2);
	printf("r�� ��: ");
	scanf(" %d", &r2);
	for (int i = n2; i >= (n2 - r2 + 1); i--)
	{
		ncr *= i;
	}
	printf("������ ���� %d�Դϴ�.\n",ncr);
	printf("\n\n");
	printf("�ڸ��� ������\n");
	int jung, rev;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%d", &jung);
	do {
		printf("%d", jung % (10));
		jung = (jung - (jung % 10))/10;
	} while (jung/10 != 0);
	printf("%d", jung);
	
	return 0;
}
