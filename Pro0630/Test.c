//#include<stdio.h>
//#include<stdarg.h>	// 가변 매개변수 사용할 때 사용
//
//extern g;	// 외부 참조
//int sum(int, ...);	// 가변 매개변수 표시
//
//int main0() {
//	printf("%d\n", g);
//
//	int answer = sum(4, 4, 3, 2, 1);
//	printf("합은 %d입니다\n", answer);
//	return 0;
//}
//
//int sum(int num, ...) {
//	int answer = 0;
//	va_list argptr;
//
//	va_start(argptr, num);	// 기변 매개변수 기능 시작
//	for (; num > 0; num--)
//		answer += va_arg(argptr, int);	// 인수 호출
//
//	va_end(argptr);
//	return(answer);
//}
