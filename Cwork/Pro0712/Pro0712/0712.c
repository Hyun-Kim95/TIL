#include<stdio.h>
#include<string.h>
#include<stdlib.h>

char ss[] = "Man is immortal, because he has a soul";
char seps[] = " ,\t\n";	// �и���
char* token;

int main() {
	char s[] = "language";
	char c = 'g';
	char* p;
	int loc;

	p = strchr(s, c);	// s�ȿ��� ���� c�� ã�´�
	loc = (int)(p - s);
	if (p != NULL)
		printf("ù��° %c�� %d���� �߰ߵǾ���\n", c, loc);
	else
		printf("%c�� �߰ߵ��� �ʾ���\c", c);

	
	// ���ڿ��� �����ϰ� ���� ��ū�� ��´�.
	token = strtok(ss, seps);
	while (token != NULL) {
		// ���ڿ� s�� ��ū�� �ִ� ���� �ݺ��Ѵ�.
		printf("��ū: %s\n", token);
		// ���� ��ū�� ��´�.
		token = strtok(NULL, seps);
	}

	printf("\n������\n");
	char* yout[] = { "��","��","��","��","��" };
	
	srand(time(NULL));
	int n = rand() % 5;
	printf("%s\n", yout[n]);
	return 0;
}