//#include<stdio.h>
//int g = 20;
//int k = 10;
//int x;					// ��������
//void inc() {
//	static int j = 0;	// int �տ� auto�� ������ �ִ°Ͱ� ����(��� �������)
//	j++;				// static: �Լ� �ܺο��� ��� �Ұ�
//	printf("j=%d\n", j);
//}
//void sub() {
//	for (x = 0; x < 10; x++)
//		printf("*");
//}
//void v() {
//	printf("g: %d, k: %d", g, k);
//}
//int main0() {
//	for (int i = 0; i < 5; i++)
//		inc();
//
//	for (x = 0; x < 10; x++)	// x�� ���������� 0���� ���ư��� �ʰ� 10�� �Ǹ� ��� 10���� �����־ *�� 10���� ��µ�
//		sub();
//
//	return 0;
//}