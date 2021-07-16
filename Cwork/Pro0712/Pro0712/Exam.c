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
	
	printf("\n9. 철자 교정 프로그램\n");
	char pro[100];
	char po[2] = ".";
	printf("텍스트를 입력하시오: ");
	gets_s(pro, 100);
	if (pro[strlen(pro) - 1] != '.')
		strncat_s(pro, sizeof(pro), po, 2);
	if (islower(pro[0]))
		pro[0] -= 32;
	printf("수정된 텍스트: %s\n", pro);

	printf("\n10. 회문인지 확인\n");
	char hm[100];
	char hm1[100];
	printf("문자열을 입력하시오: ");
	gets_s(hm, 100);

	for(int i=0;i<strlen(hm);i++)
		hm[i] = tolower(hm[i]);
	strcpy(hm1, hm);
	
	if (strcmp(hm1, _strrev(hm)) == 0) {
		printf("회문입니다.\n");
	}
	else {
		printf("회문이 아닙니다.\n");
	}

	printf("\n11. 단어의 역순\n");
	char yuk[100];
	char *tok[100];
	printf("문자열을 입력하시오: ");
	gets_s(yuk, 100);
	int i = 0;
	tok[i] = strtok(yuk, " ");
	while (tok[i] != NULL) {
		i++;
		tok[i] = strtok(NULL, " ");
	}
	for (int j = i-1; j >= 0; j--)
		printf("%s ", tok[j]);

	printf("\n12. 성과 이름 바꾸고 소문자로\n");
	char namee[100];
	char* nana[100];
	int i = 0;
	printf("성과 이름을 대문자로 입력하시오: ");
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

	printf("\n13. 구두점 개수\n");
	char gudu[100];
	int guduu = 0;
	printf("문자열을 입력하시오: ");
	gets_s(gudu, 100);
	for (int i = 0; i < strlen(gudu); i++)
		if (gudu[i] == '.')
			guduu++;
	printf("구두점의 개수는 %d입니다.\n", guduu);

	printf("\n14. 찾아바꾸기\n");
	char onebon[100];
	char find[100];
	char chan[100];
	char* pt1;
	char pt2[200] = "";
	printf("문자열을 입력하시오: ");
	gets_s(onebon, 100);
	printf("찾을 문자열: ");
	gets_s(find, 100);
	printf("바꿀 문자열: ");
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
	printf("수정된 문자열: %s\n", pt2);

	printf("\n15.문자열로 연산 받아서 계산\n");
	char yunsan[100];
	char* buho;
	char* number1;
	char* number2;
	double ans = 0;
	printf("연산을 입력하시오: ");
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
	printf("연산의 결과: %lf", ans);

	printf("\n16l. 움직이는 문자\n");
	char text[100];
	char* tok;
	char* poin = text;
	printf("광고하고 싶은 텍스트를 입력하시오: ");
	gets_s(text, 100);
	for (int i = 0; i < 100; i++) {
		tok = strtok(poin, "");
		printf("%s\n", poin);
		strncat(poin, tok, 1);
		poin++;
	}
	return 0;
}