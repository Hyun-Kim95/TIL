#include<stdio.h>
static char map[20][20] = {
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"----------ooo-------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------",
		"--------------------"
};

void check(int i, int j) {
	int neighbor = 0;
	if (i > 0 && i < 19 && j > 0 && j < 19) {
		if (map[i - 1][j - 1] == 'o')	neighbor++;
		if (map[i - 1][j] == 'o')		neighbor++;
		if (map[i - 1][j + 1] == 'o')	neighbor++;
		if (map[i][j - 1] == 'o')		neighbor++;
		if (map[i][j + 1] == 'o')		neighbor++;
		if (map[i + 1][j - 1] == 'o')	neighbor++;
		if (map[i + 1][j] == 'o')		neighbor++;
		if (map[i + 1][j + 1] == 'o')	neighbor++;
		if (neighbor >= 4 && neighbor < 2)		map[i][j] = '-';
		else if (neighbor >= 2)					map[i][j] = 'o';
	}
	else if (i == 0 && j == 0) {
		if (map[i][j + 1] == 'o' && map[i + 1][j] == 'o')	map[i][j] = 'o';
		else												map[i][j] = '-';
	}
	else if (i == 0 && j == 19) {
		if (map[i][j - 1] == 'o' && map[i + 1][j] == 'o')	map[i][j] = 'o';
		else												map[i][j] = '-';
	}
	else if (i == 19 && j == 0) {
		if (map[i - 1][j] == 'o' && map[i][j + 1] == 'o')	map[i][j] = 'o';
		else												map[i][j] = '-';
	}
	else if (i == 19 && j == 19) {
		if (map[i][j - 1] == 'o' && map[i - 1][j] == 'o')	map[i][j] = 'o';
		else												map[i][j] = '-';
	}
	else if (i == 0) {
		if (map[i][j - 1] == 'o')		neighbor++;
		if (map[i][j + 1] == 'o')		neighbor++;
		if (map[i + 1][j - 1] == 'o')	neighbor++;
		if (map[i + 1][j] == 'o')		neighbor++;
		if (map[i + 1][j + 1] == 'o')	neighbor++;
		if (neighbor >= 4 && neighbor < 2)		map[i][j] = '-';
		else if (neighbor >= 2)					map[i][j] = 'o';
	}
	else if (i == 19) {
		if (map[i - 1][j - 1] == 'o')	neighbor++;
		if (map[i - 1][j] == 'o')		neighbor++;
		if (map[i - 1][j + 1] == 'o')	neighbor++;
		if (map[i][j - 1] == 'o')		neighbor++;
		if (map[i][j + 1] == 'o')		neighbor++;
		if (neighbor >= 4 && neighbor < 2)		map[i][j] = '-';
		else if (neighbor >= 2)					map[i][j] = 'o';
	}
	else if (j == 0) {
		if (map[i - 1][j] == 'o')		neighbor++;
		if (map[i - 1][j + 1] == 'o')	neighbor++;
		if (map[i][j + 1] == 'o')		neighbor++;
		if (map[i + 1][j] == 'o')		neighbor++;
		if (map[i + 1][j + 1] == 'o')	neighbor++;
		if (neighbor >= 4 && neighbor < 2)		map[i][j] = '-';
		else if (neighbor >= 2)					map[i][j] = 'o';
	}
	else if (j == 19) {
		if (map[i - 1][j - 1] == 'o')	neighbor++;
		if (map[i - 1][j] == 'o')		neighbor++;
		if (map[i][j - 1] == 'o')		neighbor++;
		if (map[i + 1][j - 1] == 'o')	neighbor++;
		if (map[i + 1][j] == 'o')		neighbor++;
		if (neighbor >= 4 && neighbor < 2)		map[i][j] = '-';
		else if (neighbor >= 2)					map[i][j] = 'o';
	}
}

void run() {
	char end;

	printf("��������� �����մϴ�.\n");
	while (1) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				printf("%c", map[i][j]);
			}
			printf("\n");
		}
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				check(i, j);
			}
			printf("\n");
		}
		printf("�����Ͻ÷��� 'q' �� �Է��ϼ���");
		scanf(" %c", &end);
		if (end == 'q') {
			printf("�����մϴ�\n");
			break;
		}
	}
}

int main() {
	printf("\n9�� ����\n");
	run();
	

	
	return 0;
}