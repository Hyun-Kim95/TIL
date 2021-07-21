#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

int main0() {
	printf("가위 바위 보 게임(숫자로)\n");
	int human, com, finish = 1;
	while (finish) {
		printf("\n무엇을 내시겠습니까?(가위:0 바위:1 보:2)");
		scanf("%d", &human);
		srand(time(NULL));
		com = rand() % 3;

		if (human == com)
			printf("비기셨습니다!\n");
		else if (human - com == 1 || human - com == -2)
			printf("승리셨습니다!\n");
		else
			printf("패배하셨습니다!\n");
		printf("Me: %d, Com: %d", human, com);
		printf("다시하시겠습니까?(종료:0)");
		scanf("%d", &finish);
	}

	printf("가위 바위 보 게임(문자로)\n");
	int num, com1, finish1 = 1;
	char human1[] = "";
	char com2[][10] = { "scissors","rock","paper"};
	while (finish1) {
		printf("\n무엇을 내시겠습니까?(rock,scissors, paper)");
		scanf("%s", human1);

		printf("%s",human1);

		if (strcmp(human1, "scissors") == 0)
			num = 0;
		else if (strcmp(human1, "rock") == 0)
			num = 1;
		else
			num = 2;
		srand(time(NULL));
		com1 = rand() % 3;

		if (strcmp(human1,com2[com1])==0)
			printf("비기셨습니다!\n");
		else if (num - com1 == 1 || num - com1 == -2)
			printf("승리셨습니다!\n");
		else
			printf("패배하셨습니다!\n");
		printf("Me: %s, Com: %s", human1, com2[com1]);
		printf("다시하시겠습니까?(종료:0)");
		scanf("%d", &finish1);
	}
	return 0;
}