//#include<stdio.h>
//#include<stdarg.h>	// ���� �Ű����� ����� �� ���
//
//extern g;	// �ܺ� ����
//int sum(int, ...);	// ���� �Ű����� ǥ��
//
//int main0() {
//	printf("%d\n", g);
//
//	int answer = sum(4, 4, 3, 2, 1);
//	printf("���� %d�Դϴ�\n", answer);
//	return 0;
//}
//
//int sum(int num, ...) {
//	int answer = 0;
//	va_list argptr;
//
//	va_start(argptr, num);	// �⺯ �Ű����� ��� ����
//	for (; num > 0; num--)
//		answer += va_arg(argptr, int);	// �μ� ȣ��
//
//	va_end(argptr);
//	return(answer);
//}
