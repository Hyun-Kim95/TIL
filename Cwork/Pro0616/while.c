#include<stdio.h>

int main0() {
	while (1) {
		int x, evenresult = 0, oddresult = 0, stop;
		int i = 1;

		printf("어디까지의 합을 구할까요?: ");
		scanf("%d", &x);
		
		while (i <= x) {
			if (i % 2 == 0)
				evenresult += i;
			else
				oddresult += i;
			i++;
		}
		printf("1부터 %d까지의 홀수합은 %d입니다\n", x, oddresult);
		printf("1부터 %d까지의 짝수합은 %d입니다\n", x, evenresult);
		
		printf("계속 진행하시겠습니까?(중단:-999):");
		scanf("%d", &stop);
		if (stop == -999)
			break;
	}
	return 0;
}