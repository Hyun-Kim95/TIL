//#include<stdio.h>
//
//int add(int *a, int *b) {
//	return *a + *b;
//}
//int sub(int *a, int *b) {
//	return *a - *b;
//}
//int mul(int *a, int *b) {
//	return *a * *b;
//}
//int main() {
//	int a, b = 10, c = 20;
//	int d;
//	int (*p[3])() = { add,sub,mul };
//	printf("���ڸ� �Է��ϼ���(0:���ϱ�, 1:����, 2:���ϱ�)");
//	scanf("%d", &a);
//	printf("%d\n",p[a](&b, &c));
//	printf("%d", d);
//	return 0;
//}