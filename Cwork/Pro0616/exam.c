#include<stdio.h>
#include<stdlib.h>
int main() {
	printf("카운트하기+벨소리\n");
	int count;
	printf("카운터의 초기값을 입력하시오: ");
	scanf("%d", &count);
	while (count>0)
	{
		printf("%d ", count);
		count--;
	}
	printf("\a\n\n");

	printf("100 이하의 수 중에 3의 배수의 합 구하기\n");
	int hap = 0, i = 1;
	while (i<=100)
	{
		if (i % 3 == 0)
			hap += i;
		i++;
	}
	printf("1부터 100 사이의 모든 3의 배수의 합은 %d입니다.\n\n", hap);

	printf("입력한 정수의 모든 약수를 출력\n");
	int j=2, a, yaksu;
	printf("정수를 입력하시오: ");
	scanf("%d", &a);
	printf("약수: 1");
	while (j <= a)
	{
		if (a % j == 0)
			printf(" %d", j);
		j++;
	}
	printf("\n\n");

	printf("\n반복루트를 이용하여 패턴 출력\n");
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


	printf("(랜덤)윳놀이\n");
	int aa, bb, cc, dd, sum=0;
	srand(time(NULL));
	aa = 1-((rand() % 10) / 6);	// 확률 적용
	if (aa == 1)				// 0~9까지를 6으로 나눈 몫
		printf("x");			// 0~5까지는 0, 6~9까지는 1 이므로
	else						// 1에서 그 값을 빼줌으로서 1이나올 확률 60%
		printf("o");			// 0이 나올 확률 40%가 됨
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
		case 0:printf(":윳"); break;
		case 1:printf(":걸"); break;
		case 2:printf(":개"); break;
		case 3:printf(":도"); break;
		case 4:printf(":모"); break;
		default:
			printf("오류\n");
			break;
	}
	printf("\n\n");
	printf("별(*) 출력\n");
	int get_a;
	printf("원하는 갯수 입력:");
	scanf("%d", &get_a);
	for (int ii = 0; ii < get_a; ii++) {
		for (int jj = 0; jj <get_a - ii; jj++) {
			printf("*");
		}
		printf("\n");
	}
	printf("\n\n");
	printf("중첩 반복문\n");
	int zero0, zero1, five;
	printf("정수를 입력하시오: ");
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

	printf("계산기 변형\n");
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
		
		printf("연산을 입력하시오:");
		scanf(" %c", &bee);
		if (bee == 'q')
			break;
		printf("두수를 공백으로 분리하여 입력하시오:");
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
	printf("2와 100사이에 있는 모든 소수 출력\n");
	
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
		printf("막대의 높이(종료: -1): ");
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
	printf("1~n의 합이 10000이 넘지 않는 n의 최대값\n");
	int number = 0, summ = 0;
	while (summ<10000)
	{
		number++;
		summ += number;
	}
	printf("1부터 %d까지의 합이 %d입니다.\n",number-1,summ-number);

	printf("\n\n");
	printf("실수의 거듭 제곱\n");
	double zz, zz1;
	int zegop;
	printf("실수의 값을 입력하시오:");
	scanf("%lf", &zz);
	zz1 = zz;
	printf("거듭제곱횟수를 입력하시오:");
	scanf(" %d", &zegop);
	for (int cntt = 1; cntt < zegop; cntt++)
	{
		zz *= zz1;
	}
	printf("결과값은 %lf\n",zz);
	printf("\n\n");
	printf("n까지의 제곱의 합 구하기\n");
	int nn,ccnt=0;
	printf("n의 값을 입력하시오: ");
	scanf(" %d", &nn);
	for (int i = 1; i <= nn; i++)
	{
		ccnt += i * i;
	}
	printf("계산값은 %d입니다\n",ccnt);
	printf("\n\n");
	printf("피보나치수열\n");
	int fib, an=1, bn=0, cn=1;
	printf("몇번째 항까지 구할까요? ");
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
	printf("순열구하기\n");
	int n2, r2, ncr=1;
	printf("n의 값: ");
	scanf("%d", &n2);
	printf("r의 값: ");
	scanf(" %d", &r2);
	for (int i = n2; i >= (n2 - r2 + 1); i--)
	{
		ncr *= i;
	}
	printf("순열의 값은 %d입니다.\n",ncr);
	printf("\n\n");
	printf("자리수 뒤집기\n");
	int jung, rev;
	printf("정수를 입력하시오: ");
	scanf("%d", &jung);
	do {
		printf("%d", jung % (10));
		jung = (jung - (jung % 10))/10;
	} while (jung/10 != 0);
	printf("%d", jung);
	
	return 0;
}
