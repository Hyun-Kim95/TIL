//#include<stdio.h>
//#include<string.h>
//#define TITLE_SIZE 50
//#define NAME_SIZE 50
//#define PUBLISHER_SIZE 50
//
//typedef struct BOOK {
//	char title[TITLE_SIZE];
//	char author[NAME_SIZE];
//	char publisher[PUBLISHER_SIZE];
//} BOOK;
//
//void add_record(BOOK library[], int count) {
//	int type;
//
//	printf("도서의 이름:");
//	gets(library[count].title);
//	printf("저자:");
//	gets(library[count].author);
//	printf("출판사:");
//	gets(library[count].publisher);
//}
//void menu() {
//	printf("=======================\n");
//	printf("1. 추가\n");
//	printf("2. 출력\n");
//	printf("3. 검색\n");
//	printf("4. 종료\n");
//	printf("=======================\n");
//}
//int get_input() {
//	int num;
//	printf("정수값을 입력하시오: ");
//	scanf("%d", &num);
//	getchar();
//	return num;
//}
//void search_record(BOOK library[], int count) {
//	int i;
//	char title[TITLE_SIZE];
//
//	printf("제목: ");
//	gets(title);
//
//	for (int i = 0; i < count; i++) {
//		if (strcmp(title, library[i].title) == 0) {
//			printf("출판사는 %s\n", library[i].publisher);
//			return;
//		}
//	}
//	printf("찾는 책이 테이블에 없습니다.\n");
//}
//void print_record(BOOK library[], int count) {
//	int i;
//	fflush(stdin);
//	for (i = 0; i < count; i++) {
//		printf("제목: %s\n", library[i].title);
//		printf("저자: %s\m", library[i].author);
//		printf("출판사: %s\n", library[i].publisher);
//	}
//}
//
//int main(void) {
//	int num, count = 0;
//	BOOK library[30] = { '\0' };
//	while (1) {
//		menu();
//		num = get_input();
//		switch (num) {
//		case 1:
//			add_record(library, count);
//			count++;
//			continue;
//		case 2:
//			print_record(library, count);
//			continue;
//		case 3:
//			search_record(library, count);
//			continue;
//		case 4:
//			return -1;
//		}
//		return 0;
//	}
//}