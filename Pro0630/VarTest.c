//#include<stdio.h>
//int g = 20;
//int k = 10;
//int x;					// 전역변수
//void inc() {
//	static int j = 0;	// int 앞에 auto가 생략돼 있는것과 같음(적어도 상관없음)
//	j++;				// static: 함수 외부에서 사용 불가
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
//	for (x = 0; x < 10; x++)	// x가 전역변수라서 0부터 돌아가지 않고 10이 되면 계속 10으로 남아있어서 *은 10개만 출력됨
//		sub();
//
//	return 0;
//}