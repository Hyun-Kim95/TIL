#include<stdio.h>
#include<time.h>
#include<stdlib.h>
#define CLOCKS_PER_SEC ((clock_t)1000)

int main0() {
	clock_t t0 = clock();
	printf("t0: %d\n", t0);
	int a, b, c, cnt = 0;
	double score, sec;
	for (int i = 1; i <= 10; i++) {
		srand(time(NULL));
		a = rand() % 8 + 2;
		b = rand() % 8 + 2;
		printf("[����%d]: %d x %d = ",i,a,b);
		scanf("%d", &c);
		if (c == (a * b))
			cnt++;
		else
			printf("Ʋ�Ƚ��ϴ�.\n");
	}
	clock_t t1 = clock();
	printf("t1: %d\n", t1);
	printf("t1 - t0 = %d\n\n", t1 - t0);
	sec = (double)(t1 - t0) / (double)CLOCKS_PER_SEC;
	score = (10 > cnt) ? 0.0 : 100 * (60.0 - sec) / 60.0;
	printf("���� = %d��(�� %0.3lf��)",(int)score,sec);
	return 0;
}