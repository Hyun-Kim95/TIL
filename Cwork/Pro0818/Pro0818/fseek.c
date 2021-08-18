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
//	fseek(fp, 3, SEEK_SET);	// 파일의 시작위치에서 3번째 뒤
//	printf("fseek(fp, 3, SEEK_SET) = %c \n", fgetc(fp));	// D
//
//	fseek(fp, -1, SEEK_END);	// 파일의 끝 위치에서 하나 전(마지막)
//	printf("fseek(fp, -1, SEEK_END) = %c \n", fgetc(fp));	// Z
//
//	fclose(fp);
//	return 0;
//}