//#include<stdio.h>
//
//void set_pointer(char** q) {
//	*q = "All that glisters is not gold";
//}
//
//int add(int x, int y) {
//	return x + y;
//}
//int sub(int x, int y) {
//	return x - y;
//}
//int mul(int x, int y) {
//	return x * y;
//}
//int div(int x, int y) {
//	return x / y;
//}
//void menu() {
//	printf("add:0, sub:1, mul:2, div:3\n");
//}
//int main0() {
//	typedef int VECTOR[2];
//	size_t a;	// unsined int 형을 typedef 한 녀석(Ctrl 누르고 클릭하면 알 수 있음)
//	VECTOR array = { 10,20 };
//	// array[0] = 10;
//	// array[1] = 20;
//	printf("%d\n", array[0] + array[1]);
//
//	// -----------------------------
//
//	char* p = "aaa";
//	set_pointer(&p);
//
//	printf("오늘의 격언: %s\n", p);
//	
//	// -----------------------------
//
//	int choice, result, x, y;
//	// 함수 포인터 배열을 선언하고 초기화
//	int(*pf[4])(int, int) = { add, sub, mul, div };
//
//	while (1) {
//		menu();
//		printf("메뉴를 선택하시오: ");
//		scanf("%d", &choice);
//
//		if (choice < 0 || choice >= 4)
//			break;
//		printf("2개의 정수를 입력하시오:");
//		scanf("%d%d", &x, &y);
//
//		result = pf[choice](x, y);	// 함수 포인터를 이용한 함수 호출
//		printf("연산결과=%d\n", result);
//	}
//	return 0;
//}