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
		printf("�޸� ���� �Ҵ� ����\n");
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
	printf("1. ��ȭ ���� �߰�\n");
	printf("2. ��ȭ ���� ���\n");
	printf("3. ����\n");
	printf("-------------------------------------\n");

}

int get_selectde_menu()
{
	int selmenu = 0;
	printf("��ȣ�� �����Ͻÿ� : ");
	scanf("%d", &selmenu);
	getchar();
	return selmenu;
}

DATA get_input()
{
	DATA input;

	printf("��ȭ�� ������ �Է��Ͻÿ� : ");
	gets_s(input.title, 50);
	printf("��ȭ�� ���� ������ �Է��Ͻÿ� : ");
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
		printf("��     �� : %s\n", ptr->data.title);
		printf("���� ���� : %d\n", ptr->data.year);
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

	printf("���� ����Ʈ�� �̿��� ��ȭ���� �޴�\n");

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