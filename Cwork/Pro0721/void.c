#include<stdio.h>

void add(void* x, void* y, int type) {//void를 이용 하면 함수를 하나로 구현 가능
	if (type == 1)
		printf("정수의 합은 %d\n", *(int*)x + *(int*)y);	// 사용은 캐스팅해야함
	else
		printf("실수의 합은 %lf\n", *(double*)x + *(double*)y);
}
int main2() {
	int a, b;
	double d1, d2;
	a = 10;
	b = 20;
	d1 = 12.4;
	d2 = 11.2;
	add(&a, &b, 1);
	add(&d1, &d2, 2);
}