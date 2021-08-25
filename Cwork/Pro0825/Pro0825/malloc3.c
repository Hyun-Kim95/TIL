//#include<stdio.h>
//#include<stdlib.h>
//#include<string.h>
//
//struct Book {
//	int number;
//	char title[50];
//};
//int main0(void) {
//	struct Book* p;
//	// 구조체 2개 분량의 메모리를 동적으로 할당
//	// 이 메모리 블록의 시작 주소를 p에 대입
//	p = (struct Book*)malloc(2 * sizeof(struct Book));
//
//	if (p == NULL) {
//		printf("메모리 할당 오류\n");
//		exit(1);
//	}
//	// 동적으로 할당받은 첫번째 구조체 배열 원소에 데이터를 대입
//	p[0].number = 1;
//	strcpy(p[0].title, "C Programming");
//	
//	p[1].number = 2;
//	strcpy(p[1].title, "Data Structure");
//
//	free(p);	// 동적 메모리 반납
//	return 0;
//}