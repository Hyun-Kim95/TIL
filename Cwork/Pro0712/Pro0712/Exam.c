#include<stdio.h>
#include<string.h>

int str_chr(char* s, int c, char ch) {
	for (int i = 0; s[i]; i++) {
		if (s[i] == ch)
			c++;
	}
	return c;
}
void str_chr_2(char* s, int c) {
	char ch[] = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
	for (int j = 0; j < 26; j++) {
		c = 0;
		for (int i = 0; s[i]; i++) {
			if (s[i] == ch[j])
				c++;
		}
		printf("%c: %d\n", ch[j], c);
	}
}
void str_Upper(char* s) {
	printf("��ȯ�� ���ڿ�: ");
	for (int i = 0; s[i]; i++) {
		if (s[i] <= 122 && s[i] >= 97)
			s[i] = s[i] - ('a' - 'A');
		printf("%c", s[i]);
	}
			
}
void get_response(char* prompt) {
	tolower(prompt);
	if (strcmp(prompt, "yse") == 0 || strcmp(prompt, "ok") == 0)
		printf("�������� �亯\n");
	else
		printf("�������� �亯\n");
}
int main() {
	printf("1. �ƽ�Ű�ڵ尪 ���\n");
	char ch;
	printf("���ڸ� �Է��Ͻÿ�: ");
	scanf("%c", &ch);
	printf("�ƽ�Ű �ڵ尪=%d\n", ch);
	
	printf("\n2. ���ڿ� ���� ����\n");
	char s[100];
	printf("���� ���ڰ� �ִ� ���ڿ��� �Է��Ͻÿ�: ");
	scanf(" ");
	gets_s(s, 100);
	for (int i = 0; s[i]; i++)
		if (isspace(s[i]))
			strcpy(&s[i], &s[i + 1]);
	puts(s);

	printf("\n3. ���ڿ� ���� Ư���� ������ ����\n");
	int c = 0;
	char ch1;
	printf("������ �� ���ڸ� �Է��Ͻÿ�: ");
	scanf("%c", &ch1);
	printf("%c�� ����: %d\n",ch1, str_chr(s, c, ch1));

	printf("\n4. ������ ���ڰ� ��Ÿ���� ��\n");
	char cc[100];
	printf("���ڿ��� �Է��Ͻÿ�: ");
	scanf(" ");
	gets_s(cc, 100);
	str_chr_2(cc, c);

	printf("\n5. �빮�� �ҹ��� ��ȯ\n");
	while (1) {
		char al;
		printf("���ڸ� �Է��Ͻÿ�:(����:.) ");
		scanf(" %c", &al);
		if (al >= 'A' && al <= 'Z')
			printf("%c\n", tolower(al));
		else if (al >= 'a' && al <= 'z')
			printf("%c\n", toupper(al));
		else if (al == '.')
			break;
		else
			printf("\n���ĺ��� �Է��ϼ���\n");
	}

	printf("\n6. ���ڿ��� �빮�ڷ� ����\n");
	char up[100];
	printf("���ڿ��� �Է��Ͻÿ�: ");
	scanf(" ");
	gets_s(up, 100);
	str_Upper(up);
	
	printf("\n7. ��� ���� ����\n");
	char prompt[10];
	printf("������ �Ͻðڽ��ϱ�?");
	gets_s(prompt, 10);
	get_response(prompt);

	printf("\n8. ���ܾ��� ����\n");
	char en[100];
	int cnt = 0;
	printf("���ڿ��� �Է��Ͻÿ�: ");
	scanf(" ");
	gets_s(en, 100);
	strtok(en, " ");
	char token=1;
	while (token != NULL)
	{
		token = strtok(NULL, " ");
		cnt++;
	}
	strtok(en, " ");
	printf("�ܾ��� ���� %d�Դϴ�\n", cnt);
	/*
	printf("\n9. ö�� ���� ���α׷�\n");
	char pro[100];
	char po[2] = ".";
	printf("�ؽ�Ʈ�� �Է��Ͻÿ�: ");
	gets_s(pro, 50);
	if (pro[strlen(pro) - 1] != '.')
		strncat(pro, po,1);
	if (isLower(pro[0]))
		toupper(pro[0]);
	printf("������ �ؽ�Ʈ: %s\n", pro);*/

	return 0;
}