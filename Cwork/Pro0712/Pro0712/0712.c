#include<stdio.h>
#include<string.h>
#include<stdlib.h>

char ss[] = "Man is immortal, because he has a soul";
char seps[] = " ,\t\n";	// 분리자
char* token;

int main() {
	char s[] = "language";
	char c = 'g';
	char* p;
	int loc;

	p = strchr(s, c);	// s안에서 문자 c를 찾는다
	loc = (int)(p - s);
	if (p != NULL)
		printf("첫번째 %c가 %d에서 발견되었음\n", c, loc);
	else
		printf("%c가 발견되지 않았음\c", c);

	
	// 문자열을 전달하고 다음 토큰을 얻는다.
	token = strtok(ss, seps);
	while (token != NULL) {
		// 문자열 s에 토큰이 있는 동안 반복한다.
		printf("토큰: %s\n", token);
		// 다음 토큰을 얻는다.
		token = strtok(NULL, seps);
	}

	printf("\n윷놀이\n");
	char* yout[] = { "윷","걸","개","도","모" };
	
	srand(time(NULL));
	int n = rand() % 5;
	printf("%s\n", yout[n]);
	return 0;
}