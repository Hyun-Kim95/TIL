#include <stdio.h>
#include <stdlib.h>

#define INSERT	1
#define PRINT	2
#define QUIT	3

#define S_SIZE 50

typedef struct data {
	char title[S_SIZE];
	int year;
}DATA;
typedef struct NODE {
	DATA data;
	struct NODE* link;
}NODE;

NODE* insert_node(NODE* plist, NODE* pprev, DATA item)
{
	NODE* pnew = NULL;
	if (!(pnew = (NODE*)malloc(sizeof(NODE))))
	{
		printf("메모리 동적 할당 오류\n");
		exit(1);
	}

	pnew->data = item;
	pnew->link = NULL;
	if (pprev != NULL) {
		plist->link = pnew;
		plist = pnew;
		return plist;
	}
	plist = pnew;
	return plist;
}

void display_menu()
{
	printf("-------------------------------------\n");
	printf("1. 영화 정보 추가\n");
	printf("2. 영화 정보 출력\n");
	printf("3. 종료\n");
	printf("-------------------------------------\n");

}

int get_selectde_menu()
{
	int selmenu = 0;
	printf("번호를 선택하시오 : ");
	scanf("%d", &selmenu);
	getchar();
	return selmenu;
}

DATA get_input()
{
	DATA input;

	printf("영화의 제목을 입력하시오 : ");
	gets_s(input.title, 50);
	printf("영화의 개봉 연도를 입력하시오 : ");
	scanf("%d", &input.year);
	getchar();
	return input;
}

void print_list(NODE* pprev)
{
	NODE* ptr;
	for (ptr = pprev; ptr; ptr = ptr->link)
	{
		printf("-------------------------------------\n");
		printf("제     목 : %s\n", ptr->data.title);
		printf("개봉 연도 : %d\n", ptr->data.year);
	}
	printf("-------------------------------------\n");
}

void destroy_nodes(NODE* plist)
{
	NODE* temp;
	while (plist)
	{
		temp = plist;
		plist = plist->link;
		free(temp);
	}
}

int main(void)
{
	NODE* plist = NULL;
	NODE* pprev = NULL;
	int selected = 0;
	DATA d;

	printf("연결 리스트를 이용한 영화관리 메뉴\n");

	display_menu();
	selected = get_selectde_menu();
	switch (selected)
	{
	case INSERT:
		d = get_input();
		plist = insert_node(plist, pprev, d);
		pprev = plist;
		break;
	case PRINT:
		print_list(plist);
		break;
	case QUIT:
		destroy_nodes(plist);
		return 0;
	}
	while (selected != QUIT)
	{
		display_menu();
		selected = get_selectde_menu();

		switch (selected)
		{
		case INSERT:
			d = get_input();
			plist = insert_node(plist, pprev, d);
			break;
		case PRINT:
			print_list(pprev) ;
			break;
		case QUIT:
			destroy_nodes(plist);
			break;
		}
	}
	return 0;
}