#include<stdio.h>
#include<stdlib.h>
#define NUM	 7

int main0() {
	printf("�ζǹ�ȣ ���� ������\n");
	int lotto[] = {0,0,0,0,0,0,0};
	int lotto1[] = { 50,50,50,50,50,50 };
	int i = 0;
	srand(time(NULL));
	while (i < NUM) {
		lotto[i] = rand() % 45 + 1;
		for (int j = 0; j < NUM; j++) {
			if (i == j){
				i++;
				break;;
			}
			if (lotto[i] == lotto[j])
				break;
		}
	}
	// ���ʽ���ȣ ���� ����
	for (int p = 0; p < NUM-1; p++) {
		int t = 7;
		for (int w = 0; w < NUM-1; w++) {
			if(lotto1[p]>lotto[w]) {
				lotto1[p] = lotto[w];
				t = w;
			}
		}
		if(t<6)
			lotto[t] = 60;
	}
	for (int k = 0; k < NUM-1; k++)
		printf("%d ", lotto1[k]);

	printf("���ʽ���ȣ: %d", lotto[6]);
	return 0;
}