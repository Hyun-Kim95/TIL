//#include<stdio.h>
//
//int main2(void) {
//	FILE* fp;
//	char buffer[100];
//
//	fp = fopen("sample.txt", "wt");
//	fputs("ABCDEFGHIJKLMNOPQRSTUVWXYZ", fp);
//	fclose(fp);
//
//	fp = fopen("sample.txt", "rt");
//	fseek(fp, 3, SEEK_SET);	// ������ ������ġ���� 3��° ��
//	printf("fseek(fp, 3, SEEK_SET) = %c \n", fgetc(fp));	// D
//
//	fseek(fp, -1, SEEK_END);	// ������ �� ��ġ���� �ϳ� ��(������)
//	printf("fseek(fp, -1, SEEK_END) = %c \n", fgetc(fp));	// Z
//
//	fclose(fp);
//	return 0;
//}