#include<stdio.h>

int main0() {
	while (1) {
		int x, evenresult = 0, oddresult = 0, stop;
		int i = 1;

		printf("�������� ���� ���ұ��?: ");
		scanf("%d", &x);
		
		while (i <= x) {
			if (i % 2 == 0)
				evenresult += i;
			else
				oddresult += i;
			i++;
		}
		printf("1���� %d������ Ȧ������ %d�Դϴ�\n", x, oddresult);
		printf("1���� %d������ ¦������ %d�Դϴ�\n", x, evenresult);
		
		printf("��� �����Ͻðڽ��ϱ�?(�ߴ�:-999):");
		scanf("%d", &stop);
		if (stop == -999)
			break;
	}
	return 0;
}