#include<stdio.h>

void add(void* x, void* y, int type) {//void�� �̿� �ϸ� �Լ��� �ϳ��� ���� ����
	if (type == 1)
		printf("������ ���� %d\n", *(int*)x + *(int*)y);	// ����� ĳ�����ؾ���
	else
		printf("�Ǽ��� ���� %lf\n", *(double*)x + *(double*)y);
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