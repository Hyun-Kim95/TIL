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
//	printf("숫자를 입력하세요(0:더하기, 1:빼기, 2:곱하기)");
//	scanf("%d", &a);
//	printf("%d\n",p[a](&b, &c));
//	printf("%d", d);
//	return 0;
//}