//#include<stdio.h>
//#include<stdlib.h>
//#include<string.h>
//
//#define S_SIZE 50
//
//typedef struct NODE {	// ����� Ÿ���� ����
//	char title[S_SIZE];
//	int year;
//	struct NODE* link;
//} NODE;
//
//int main(void) {
//	NODE* list = NULL;
//	NODE* prev, * p, * next;	// ��带 ����Ű�� ������ ����
//	char buffer[S_SIZE];
//	int year;
//
//	// ���� ����Ʈ�� ������ �Է��Ѵ�.
//	while (1) {
//		printf("å�� ������ �Է��Ͻÿ�: (�����Ϸ��� ����) ");
//		gets_s(buffer, S_SIZE);
//		if (buffer[0] == '\0')
//			break;
//		p = (NODE*)malloc(sizeof(NODE));	// ���� �޸� �Ҵ�
//		strcpy(p->title, buffer);
//		printf("å�� ���� ������ �Է��Ͻÿ�: ");
//		gets_s(buffer, S_SIZE);
//		year = atoi(buffer);
//		p->year = year;
//
//		// ������ ���� ����Ʈ�� ���� ���ο� ��带 �߰�
//		if (list == NULL)	// ����Ʈ�� ���������
//			list = p;		// ���ο� ��带 ù��° ���� ����
//		else				// ����Ʈ�� ��� ���� ������ 
//			prev->link = p;	// ���ο� ��带 ���� ����� ���� ����
//		p->link = NULL;		// ���ο� ����� ��ũ �ʵ带 NULL�� ����
//		prev = p;
//	}
//	printf("\n");
//	
//	// ���� ����Ʈ�� ��� �ִ� ������ ��� ���
//	p = list;
//	// ���� ����Ʈ ���� ��� ��ȸ
//	while (p != NULL) {
//		printf("[%s,%d]->", p->title, p->year);
//		p = p->link;
//	}
//
//	printf("\n");
//	// ���� �Ҵ��� �ݳ�
//	p = list;
//	while (p != NULL) {
//		next = p->link;
//		free(p);		// ���� �޸� �ݳ�
//		p = next;
//	}
//	return 0;
//}