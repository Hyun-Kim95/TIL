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
	printf("변환된 문자열: ");
	for (int i = 0; s[i]; i++) {
		if (s[i] <= 122 && s[i] >= 97)
			s[i] = s[i] - ('a' - 'A');
		printf("%c", s[i]);
	}
			
}
void get_response(char* prompt) {
	tolower(prompt);
	if (strcmp(prompt, "yse") == 0 || strcmp(prompt, "ok") == 0)
		printf("긍정적인 답변\n");
	else
		printf("부정적인 답변\n");
}
int main() {
	printf("1. 아스키코드값 출력\n");
	char ch;
	printf("문자를 입력하시오: ");
	scanf("%c", &ch);
	printf("아스키 코드값=%d\n", ch);
	
	printf("\n2. 문자열 공백 삭제\n");
	char s[100];
	printf("공백 문자가 있는 문자열을 입력하시오: ");
	scanf(" ");
	gets_s(s, 100);
	for (int i = 0; s[i]; i++)
		if (isspace(s[i]))
			strcpy(&s[i], &s[i + 1]);
	puts(s);

	printf("\n3. 문자열 내의 특정한 문자의 개수\n");
	int c = 0;
	char ch1;
	printf("갯수를 셀 문자를 입력하시오: ");
	scanf("%c", &ch1);
	printf("%c의 갯수: %d\n",ch1, str_chr(s, c, ch1));

	printf("\n4. 각각의 문자가 나타나는 빈도\n");
	char cc[100];
	printf("문자열을 입력하시오: ");
	scanf(" ");
	gets_s(cc, 100);
	str_chr_2(cc, c);

	printf("\n5. 대문자 소문자 변환\n");
	while (1) {
		char al;
		printf("문자를 입력하시오:(종료:.) ");
		scanf(" %c", &al);
		if (al >= 'A' && al <= 'Z')
			printf("%c\n", tolower(al));
		else if (al >= 'a' && al <= 'z')
			printf("%c\n", toupper(al));
		else if (al == '.')
			break;
		else
			printf("\n알파벳을 입력하세요\n");
	}

	printf("\n6. 문자열을 대문자로 변경\n");
	char up[100];
	printf("문자열을 입력하시오: ");
	scanf(" ");
	gets_s(up, 100);
	str_Upper(up);
	
	printf("\n7. 대답 긍정 부정\n");
	char prompt[10];
	printf("게임을 하시겠습니까?");
	gets_s(prompt, 10);
	get_response(prompt);

	printf("\n8. 영단어의 갯수\n");
	char en[100];
	int cnt = 0;
	printf("문자열을 입력하시오: ");
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
	printf("단어의 수는 %d입니다\n", cnt);
	/*
	printf("\n9. 철자 교정 프로그램\n");
	char pro[100];
	char po[2] = ".";
	printf("텍스트를 입력하시오: ");
	gets_s(pro, 50);
	if (pro[strlen(pro) - 1] != '.')
		strncat(pro, po,1);
	if (isLower(pro[0]))
		toupper(pro[0]);
	printf("수정된 텍스트: %s\n", pro);*/

	return 0;
}