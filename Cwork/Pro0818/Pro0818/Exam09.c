//#include<stdio.h>
//#include<stdlib.h>
//
//
//int main(int argc, char* argv[]) {
//	FILE* fp1, * fp2, * fp3;
//	char file1[100], file2[100], file3[100];
//	char buffer[100];
//
//	if (argc >= 4) {
//		strcpy(file1, argv[1]);
//		strcpy(file2, argv[2]);
//		strcpy(file3, argv[3]);
//	}
//	else {
//		printf("�μ��� �����մϴ�.\n");
//		return 0;
//	}
//	printf("%s ���� + %s������ %s ���Ϸ� �����մϴ�.\n", file1, file2, file3);
//	
//	if ((fp1 = fopen(file1, "r")) == NULL || (fp2 = fopen(file2, "r")) == NULL
//		|| (fp3 = fopen(file3, "w")) == NULL) {
//		fprintf(stderr, "������ �� �� �����ϴ�.\n");
//		exit(1);
//	}
//	
//	while (fgets(buffer, 100, fp1) != NULL)
//		fputs(buffer, fp3);
//
//	while (fgets(buffer, 100, fp2) != NULL)
//		fputs(buffer, fp3);
//
//	fclose(fp1);
//	fclose(fp2);
//	fclose(fp3);
//
//	return 0;
//}