#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct student
{
	char name[20];
	int kor;
	int math;
	int eng;
};

void equals(FILE* fp1, FILE* fp2) {

	int a, b, cnt = 0;
	while (1)
	{
		a = fgetc(fp1);
		b = fgetc(fp2);
		if (a == EOF && b == EOF)
			break;
		if (a != b) {
			printf("두 파일은 서로 다릅니다.\n");
			cnt++;
			break;
		}
	}
	if (cnt == 0)
		printf("두 파일은 서로 같습니다.\n");
}

void fileupper(FILE* fp1, FILE* fp2) {
	char a, b;
	while (1)
	{
		a = fgetc(fp1);
		b = toupper(a);
		fputc(b, fp2);
		printf("%c", b);
		if (a == EOF)
			break;
	}
}

void copyfile(FILE* fp1, FILE* fp2) {
	char buffer[1024];
	int count;
	while ((count = fread(buffer, 1, sizeof(buffer), fp1))) {
		fwrite(buffer, 1, count, fp2);
	}
	printf("복사완료\n");
}

void cmpfile(FILE* fp1, FILE* fp2) {
	char chk1, chk2, cc = 0;
	char buffer1[100], buffer2[100];

	while (1) {
		chk1 = fgets(buffer1, 100, fp1);
		chk2 = fgets(buffer2, 100, fp2);
		if (chk2 == NULL || chk1 == NULL)
			break;
		if (strcmp(buffer1, buffer2) != 0) {
			printf("<< %s", buffer1);
			printf(">> %s\n", buffer2);
			cc++;
			break;
		}
	}
	if (cc == 0)
		printf("파일은 서로 일치함\n");
}

void avg(FILE* fp1, FILE* fp2) {
	char buffer0[100], buffer00[100];
	
}
int main(void) {
	/*printf("1번 문제\n");
	FILE* fp1, * fp2;

	char file1[100], file2[100];
	printf("첫번째 파일 이름(sample.txt): ");
	scanf("%s", file1);
	printf("두번째 파일 이름(sample1.txt): ");
	scanf("%s", file2);

	fp1 = fopen(file1, "r");
	fp2 = fopen(file2, "r");
	if (fp1 == NULL || fp2 == NULL) {
		fprintf(stderr, "파일 열기 오류 \n");
		exit(1);
	}
	equals(fp1, fp2);
	fclose(fp1);
	fclose(fp2);*/

	/*printf("\n2번 문제\n");
	FILE* fp11, * fp22;

	char file11[100], file22[100];
	printf("첫번째 파일 이름(proverbs.txt): ");
	scanf("%s", file11);
	printf("두번째 파일 이름(tmp.txt): ");
	scanf("%s", file22);
	fp11 = fopen(file11, "r");
	fp22 = fopen(file22, "w");
	if (fp11 == NULL || fp22 == NULL) {
		fprintf(stderr, "파일 열기 오류 \n");
		exit(1);
	}
	fileupper(fp11, fp22);
	fclose(fp11);
	fclose(fp22);*/

	/*printf("\n3번 문제\n");
	FILE* fp111, * fp222;
	char file111[100], file222[100];
	printf("원본 파일 이름(dog.jpg): ");
	scanf("%s", file111);
	printf("복사 파일 이름(dog1.jpg): ");
	scanf("%s", file222);
	fp111 = fopen(file111, "rb");
	fp222 = fopen(file222, "wb");
	copyfile(fp111, fp222);
	fclose(fp111);
	fclose(fp222);*/

	/*printf("\n4번 문제\n");
	FILE* fpone, * fptwo;
	char fileone[100], filetwo[100];
	
	printf("첫번째 파일 이름(proverbs.txt): ");
	scanf("%s", fileone);
	printf("두번째 파일 이름(sample.txt): ");
	scanf("%s", filetwo);
	fpone = fopen(fileone, "r");
	fptwo = fopen(filetwo, "r");
	if ((fpone == NULL) || (fptwo == NULL)) {
		fprintf(stderr, "파일을 열 수 없습니다.\n");
		exit(1);
	}
	cmpfile(fpone, fptwo);
	
	fclose(fpone);
	fclose(fptwo);*/

	printf("\n5번 문제\n");
	int total = 0;
	char name[100];
	int kor, math, eng;
	struct student table[3] = {
		{"홍길동",90,80,70},
		{"김유신",95,68,87},
		{"김현",100,100,100}
	};
	FILE* fp0, * fp00;
	fp0 = fopen("score.txt", "w");
	fp00 = fopen("score1.txt", "w");
	if (fp0 == NULL || fp00 == NULL) {
		fprintf(stderr, "파일을 열 수 없습니다.\n");
		exit(1);
	}
	for (int i = 0; i < 3; i++) {
		fprintf(fp0, "%s %d %d %d", table[i].name, table[i].kor, table[i].math, table[i].eng);
		printf("%s %d %d %d \n", table[i].name, table[i].kor, table[i].math, table[i].eng);
	}
	while (!feof(fp0)) {
		fscanf(fp0, "%s %d %d %d", name, &kor, &math, &eng);
		total += (kor + math + eng);
		fprintf(fp00, "%s %.2lf \n", name, (double)total/3.0);
	}

	fclose(fp0);
	fclose(fp00);
	return 0;
}