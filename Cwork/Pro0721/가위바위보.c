#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

int main0() {
	printf("���� ���� �� ����(���ڷ�)\n");
	int human, com, finish = 1;
	while (finish) {
		printf("\n������ ���ðڽ��ϱ�?(����:0 ����:1 ��:2)");
		scanf("%d", &human);
		srand(time(NULL));
		com = rand() % 3;

		if (human == com)
			printf("���̽��ϴ�!\n");
		else if (human - com == 1 || human - com == -2)
			printf("�¸��̽��ϴ�!\n");
		else
			printf("�й��ϼ̽��ϴ�!\n");
		printf("Me: %d, Com: %d", human, com);
		printf("�ٽ��Ͻðڽ��ϱ�?(����:0)");
		scanf("%d", &finish);
	}

	printf("���� ���� �� ����(���ڷ�)\n");
	int num, com1, finish1 = 1;
	char human1[] = "";
	char com2[][10] = { "scissors","rock","paper"};
	while (finish1) {
		printf("\n������ ���ðڽ��ϱ�?(rock,scissors, paper)");
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
			printf("���̽��ϴ�!\n");
		else if (num - com1 == 1 || num - com1 == -2)
			printf("�¸��̽��ϴ�!\n");
		else
			printf("�й��ϼ̽��ϴ�!\n");
		printf("Me: %s, Com: %s", human1, com2[com1]);
		printf("�ٽ��Ͻðڽ��ϱ�?(����:0)");
		scanf("%d", &finish1);
	}
	return 0;
}