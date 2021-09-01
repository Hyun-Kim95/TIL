//#include<stdio.h>
//#include<stdlib.h>
//#include<string.h>
//
//#define S_SIZE 50
//
//typedef struct NODE {	// 노드의 타입을 정의
//	char title[S_SIZE];
//	int year;
//	struct NODE* link;
//} NODE;
//
//int main(void) {
//	NODE* list = NULL;
//	NODE* prev, * p, * next;	// 노드를 가리키는 포인터 정의
//	char buffer[S_SIZE];
//	int year;
//
//	// 연결 리스트에 정보를 입력한다.
//	while (1) {
//		printf("책의 제목을 입력하시오: (종료하려면 엔터) ");
//		gets_s(buffer, S_SIZE);
//		if (buffer[0] == '\0')
//			break;
//		p = (NODE*)malloc(sizeof(NODE));	// 동적 메모리 할당
//		strcpy(p->title, buffer);
//		printf("책의 출판 연도를 입력하시오: ");
//		gets_s(buffer, S_SIZE);
//		year = atoi(buffer);
//		p->year = year;
//
//		// 기존의 연결 리스트의 끝에 새로운 노드를 추가
//		if (list == NULL)	// 리스트가 비어있으면
//			list = p;		// 새로운 노드를 첫번째 노드로 만듬
//		else				// 리스트가 비어 있지 않으면 
//			prev->link = p;	// 새로운 노드를 이전 노드의 끝에 붙힘
//		p->link = NULL;		// 새로운 노드의 링크 필드를 NULL로 설정
//		prev = p;
//	}
//	printf("\n");
//	
//	// 연결 리스트에 들어 있는 정보를 모두 출력
//	p = list;
//	// 연결 리스트 안의 노드 순회
//	while (p != NULL) {
//		printf("[%s,%d]->", p->title, p->year);
//		p = p->link;
//	}
//
//	printf("\n");
//	// 동적 할당을 반납
//	p = list;
//	while (p != NULL) {
//		next = p->link;
//		free(p);		// 동적 메모리 반납
//		p = next;
//	}
//	return 0;
//}