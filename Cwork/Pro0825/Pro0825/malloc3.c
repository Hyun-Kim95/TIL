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
//	// ����ü 2�� �з��� �޸𸮸� �������� �Ҵ�
//	// �� �޸� ����� ���� �ּҸ� p�� ����
//	p = (struct Book*)malloc(2 * sizeof(struct Book));
//
//	if (p == NULL) {
//		printf("�޸� �Ҵ� ����\n");
//		exit(1);
//	}
//	// �������� �Ҵ���� ù��° ����ü �迭 ���ҿ� �����͸� ����
//	p[0].number = 1;
//	strcpy(p[0].title, "C Programming");
//	
//	p[1].number = 2;
//	strcpy(p[1].title, "Data Structure");
//
//	free(p);	// ���� �޸� �ݳ�
//	return 0;
//}