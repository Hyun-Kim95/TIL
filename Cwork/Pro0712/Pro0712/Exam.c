#include<stdio.h>
#include<string.h>
#include<ctype.h>

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
	
	printf("\n9. ö�� ���� ���α׷�\n");
	char pro[100];
	char po[2] = ".";
	printf("�ؽ�Ʈ�� �Է��Ͻÿ�: ");
	gets_s(pro, 100);
	if (pro[strlen(pro) - 1] != '.')
		strncat_s(pro, sizeof(pro), po, 2);
	if (islower(pro[0]))
		pro[0] -= 32;
	printf("������ �ؽ�Ʈ: %s\n", pro);

	printf("\n10. ȸ������ Ȯ��\n");
	char hm[100];
	char hm1[100];
	printf("���ڿ��� �Է��Ͻÿ�: ");
	gets_s(hm, 100);

	for(int i=0;i<strlen(hm);i++)
		hm[i] = tolower(hm[i]);
	strcpy(hm1, hm);
	
	if (strcmp(hm1, _strrev(hm)) == 0) {
		printf("ȸ���Դϴ�.\n");
	}
	else {
		printf("ȸ���� �ƴմϴ�.\n");
	}

	printf("\n11. �ܾ��� ����\n");
	char yuk[100];
	char *tok[100];
	printf("���ڿ��� �Է��Ͻÿ�: ");
	gets_s(yuk, 100);
	int i = 0;
	tok[i] = strtok(yuk, " ");
	while (tok[i] != NULL) {
		i++;
		tok[i] = strtok(NULL, " ");
	}
	for (int j = i-1; j >= 0; j--)
		printf("%s ", tok[j]);

	printf("\n12. ���� �̸� �ٲٰ� �ҹ��ڷ�\n");
	char namee[100];
	char* nana[100];
	int i = 0;
	printf("���� �̸��� �빮�ڷ� �Է��Ͻÿ�: ");
	gets_s(namee, 100);
	for (i = 0; i < strlen(namee); i++) {
		namee[i] = tolower(namee[i]);
	}
	nana[i] = strtok(namee, " ");
	i++;
	nana[i] = strtok(NULL, " ");
	
	printf("%s", nana[i]);
	printf(", ");
	printf("%s\n", nana[i - 1]);

	printf("\n13. ������ ����\n");
	char gudu[100];
	int guduu = 0;
	printf("���ڿ��� �Է��Ͻÿ�: ");
	gets_s(gudu, 100);
	for (int i = 0; i < strlen(gudu); i++)
		if (gudu[i] == '.')
			guduu++;
	printf("�������� ������ %d�Դϴ�.\n", guduu);

	printf("\n14. ã�ƹٲٱ�\n");
	char onebon[100];
	char find[100];
	char chan[100];
	char* pt1;
	char pt2[200] = "";
	printf("���ڿ��� �Է��Ͻÿ�: ");
	gets_s(onebon, 100);
	printf("ã�� ���ڿ�: ");
	gets_s(find, 100);
	printf("�ٲ� ���ڿ�: ");
	gets_s(chan, 100);
	pt1 = strtok(onebon, " ");
	while (pt1 != NULL)
	{
		if (strcmp(pt1, find) == 0) {
			strcat(pt2, chan);
		}
		else {
			strcat(pt2, pt1);
		}
		strcat(pt2, " ");
		pt1 = strtok(NULL, " ");
	}
	printf("������ ���ڿ�: %s\n", pt2);

	printf("\n15.���ڿ��� ���� �޾Ƽ� ���\n");
	char yunsan[100];
	char* buho;
	char* number1;
	char* number2;
	double ans = 0;
	printf("������ �Է��Ͻÿ�: ");
	gets_s(yunsan, 100);
	buho = strtok(yunsan, " ");
	number1 = strtok(NULL, " ");
	double numbera = atoi(number1);
	number2 = strtok(NULL, " ");
	double numberb = atoi(number2);
	if (strcmp(buho,"add") == 0) {
		ans = numbera + numberb;
	}
	else if (strcmp(buho, "sub") == 0) {
		ans = numbera - numberb;
	}
	else if (strcmp(buho, "mul") == 0) {
		ans = numbera * numberb;
	}
	else {
		ans = numbera / numberb;
	}
	printf("������ ���: %lf", ans);

	printf("\n16l. �����̴� ����\n");
	char text[100];
	char* tok;
	char* poin = text;
	printf("�����ϰ� ���� �ؽ�Ʈ�� �Է��Ͻÿ�: ");
	gets_s(text, 100);
	for (int i = 0; i < 100; i++) {
		tok = strtok(poin, "");
		printf("%s\n", poin);
		strncat(poin, tok, 1);
		poin++;
	}
	return 0;
}