#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void array_equal(int a[], int b[], int size) {
	int cnt = 0;
	for (int i = 0; i < size; i++) {
		if (a[i] != b[i])
			cnt ++;
	}
	if (cnt == 0)
		printf("����\n");
	else
		printf("%d���� �迭�� �ٸ�\n", cnt);
}
void array_copy(int a[], int b[], int size) {
	for (int i = 0; i < size; i++) {
		b[i] = a[i];
	}
	printf("������ �迭\n");
	for (int k = 0; k < size; k++) {
		printf("%d ", b[k]);
	}
	printf("\n������ �迭\n");
	for (int j = 0; j < size; j++) {
		printf("%d ", b[j]);
	}
}
void vector_add(double a[],double b[]) {
	double c[3];
	for (int i = 0; i < 3; i++) {
		c[i] = a[i] + b[i];
	}
	printf("������ �� = [%lf %lf %lf]\n",c[0],c[1],c[2]);
}
void vector_dot_prod(double a[], double b[]) {
	double c[3];
	for (int i = 0; i < 3; i++) {
		c[i] = a[i] * b[i];
	}
	printf("������ ���� = [%lf]\n", c[0] + c[1] + c[2]);
}
void scalar_mult(int a[3][3], int scalar) {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			a[i][j] *= scalar;
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
	printf("\n");
}
void transpose(int a[3][3]) {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			printf("%d ", a[j][i]);
		}
		printf("\n");
	}
	printf("\n");
}
int main() {
	/*printf("1�� ����\n");
	int day[] = { 31,29,31,30,31,30,31,31,30,31,30,31 };
	int len = sizeof(day) / sizeof(day[0]);
	for (int i = 0; i < len; i++)
		printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", i + 1, day[i]);

	printf("\n2�� ����(���� �迭�� �ִ�,�ּ�)\n");
	int nan[10];
	srand(time(NULL));
	for (int i = 0; i < 10; i++) {
		nan[i] = rand();
	}
	int max = nan[0], min = nan[0];
	for (int i = 0; i < 10; i++) {
		if (nan[i] > max)
			max = nan[i];
		else if (nan[i] < min)
			min = nan[i];
	}
	printf("�ִ밪�� %d", max);
	printf("�ּҰ��� %d", min);

	printf("\n3�� ����(�迭�� �����Ǵ� �迭 ��Ұ� ������ �˻�)\n");
	int a[] = { 1,2,3,0,0,0,0,0,0,0 };
	int b[] = { 0,0,0,0,0,0,0,0,0,0 };
	int c = 10;
	array_equal(a, b, c);

	printf("\n4�� ����(�迭 ����)\n");
	array_copy(a, b, c);

	printf("\n5�� ����(���� ���� ���� ����)\n");
	srand(time(NULL));
	int cnt[10] = { 0, };
	for (int i = 0; i < 100; i++) {
		int j = rand() % 10;
		cnt[j]++;
	}
	int max_0 = cnt[0];
	for (int k = 0; k < 10; k++) {
		if (cnt[k] > max_0)
			max_0 = cnt[k];
	}
	printf("���� ���� ���¼�=%d\n", max_0);

	printf("\n6�� ����(��,���� �հ�)\n");
	int cnt_0 = 0, cnt_1 = 0;
	int hang[3][5] = {
		{12,56,32,16,98},
		{99,56,34,41,3},
		{65,3,87,78,21}
	};
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 5; j++) {
			cnt_0 += hang[i][j];
		}
		printf("%d���� �հ�: %d\n", i, cnt_0);
		cnt_0 = 0;
	}
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 3; j++) {
			cnt_1 += hang[j][i];
		}
		printf("%d���� �հ�: %d\n", i, cnt_1);
		cnt_1 = 0;
	}

	printf("\n7�� ����(����,������)\n");
	int zegop[3][10] = {
		{1,2,3,4,5,6,7,8,9,10},
		{0,},
		{0,}
	};
	for (int i = 1; i < 3; i++) {
		for (int j = 0; j < 10; j++) {
			if (i == 1)
				zegop[i][j] = (j + 1) * (j + 1);
			else
				zegop[i][j] = (j + 1) * (j + 1) * (j + 1);
			printf("%d ", zegop[i][j]);
		}
	}
	int gn,chk=0;
	printf("\n������ �Է��Ͻÿ�(����<=1000):");
	scanf("%d", &gn);
	for (int i = 0; i < 10; i++) {
		if (zegop[2][i] == gn) {
			printf("%d�� ���������� %d\n", gn, zegop[0][i]);
			chk = 1;
		}
	}
	if (chk == 0)
		printf("���������� �����ϴ�\n");

	printf("\n8�� ����(��հ� ǥ������)\n");
	int m = 0, data[10];
	double  v = 0;
	for (int i = 0; i < 10; i++) {
		int a;
		printf("�����͸� �Է��Ͻÿ�(10��):");
		scanf("%d", &a);
		data[i] = a;
		m += a;
	}
	printf("��հ��� %lf\n", (double)m / 10.0);
	for (int i = 0; i < 10; i++) {
		v += (data[i] - ((double)m / 10.0)) * (data[i] - ((double)m / 10.0));
	}
	printf("ǥ���������� %lf\n", sqrt(v / 10.0));

	printf("\n9�� ����(�� �л��� �ִ��ּ�)\n");
	int test[10][3] = { 0, };
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 3; j++) {
			test[i][j] = rand() % 101;
		}
	}
	for (int i = 0; i < 10; i++) {
		int max_s = test[i][0];
		int min_s = test[i][0];
		for (int j = 0; j < 3; j++) {
			if (test[i][j] > max_s)
				max_s = test[i][j];
			if (test[i][j] < min_s)
				min_s = test[i][j];
		}
		printf("���� #%d�� �ִ�����=%d\n", i, max_s);
		printf("���� #%d�� ��������=%d\n", i, min_s);
	}
	printf("\n10�� ����(������ ��,������ ����)\n");
	double vector_1[] = { 1.0, 2.0, 3.0 };
	double vector_2[] = { 1, 2, 3 };
	
	vector_add(vector_1, vector_2);
	vector_dot_prod(vector_1, vector_2);
	
	printf("\n11�� ����(������)\n");
	int number[] = { 1,2,3,4,5,6,7,8,9,10 };
	int space[] = { 1,2,3,4,5,1,2,3,4,5 };
	int num;
	printf("��ǰ ��ȣ�� �Է��Ͻÿ�:(1~10)");
	scanf("%d", &num);
	printf("��ǰ ��ȣ %d�� ��ġ�� %d�Դϴ�.\n", num,space[num-1]);

	printf("\n12�� ����(���)\n");
	int hangg[3][3] = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};
	scalar_mult(hangg, 2);
	transpose(hangg);

	printf("\n13�� ����(10������ 2������ ��ȯ)\n");
	int bi[] = { 0, };
	int ten,check=0;
	printf("10������ �Է��ϼ���:");
	scanf("%d", &ten);
	printf("%d->", ten);
	for (int i = 0; i < 32 && ten > 0; i++) {
		bi[i] = ten % 2;
		ten /= 2;
		check = i;
	}
	for (int i = check; i >= 0; i--) {
		printf("%d", bi[i]);
	}
	printf("\n");

	printf("\n14�� ����(random walk)\n");
	int tile[10][10] = { 0, };
	int walk,ii=5,jj=5;
	for (int i = 0; i < 8; i++) {
		tile[ii][jj] = 1;
		walk = rand() % 8;
		switch (walk)
		{
		case 0: jj--;
			if (tile[ii][jj] == 1)
				jj++;
			break;
		case 1: jj--; ii++;
			if (tile[ii][jj] == 1)
				jj++;
			break;
		case 2: ii++;
			if (tile[ii][jj] == 1)
				jj++;
			break;
		case 3: jj++; ii++;
			if (tile[ii][jj] == 1)
				jj++;
			break;
		case 4: jj++;
			if (tile[ii][jj] == 1)
				jj++;
			break;
		case 5: jj++; ii--;
			if (tile[ii][jj] == 1)
				jj++;
			break;
		case 6: ii--;
			if (tile[ii][jj] == 1)
				jj++;
			break;
		case 7: jj--; ii--;
			if (tile[ii][jj] == 1)
				jj++;
			break;
		}
	}
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			printf("%d ", tile[i][j]);
		}
		printf("\n");
	}

	printf("\n15�� ����(����ã��)\n");
	int zr[10][10] = { 0, };
	int zrr;
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			zrr = rand() % 99;
			if (zrr < 30)
				printf("#");
			else
				printf(".");
		}
		printf("\n");
	}*/

	printf("\n16�� ����(��ã�� ����)\n");
	int map[10][10] = { 0, };
	char key;
	int xx = 0, yy = 0;	// ������ġ
	int xxx1=9, xxx2=8, yyy1=8, yyy2=9;	// ���� ��ġ
	int exit = 0;	// ����� 1

	map[9][9] = 3;	// ���
	map[xxx1][yyy1] = 2;	// ����
	map[xxx2][yyy2] = 2;	// ����
	while (1)
	{
		map[xx][yy] = 1;	// ����
		if (exit == 1)
			break;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (map[i][j] == 0)
					printf(".");
				else if (map[i][j] == 1)
					printf("#");
				else if (map[i][j] == 2)
					printf("M");
				else
					printf("G");
			}
			printf("\n");
		}
		while (1) {
			int cc = 0;
			int kk = rand() % 8;
			switch (kk) {
			case 0: map[xxx1][yyy1] = 0; xxx1--;
				if (xxx1 < 0)
					xxx1++;
				else
					cc = 1;
				break;
			case 1: map[xxx1][yyy1] = 0; xxx1--; yyy1++;
				if (xxx1 < 0) {
					xxx1++;
					yyy1--;
				}
				else
					cc = 1;
				break;
			case 2: map[xxx1][yyy1] = 0; yyy1++;
				if (yyy1>9) {
					yyy1--;
				}
				else
					cc = 1;
				break;
			case 3: map[xxx1][yyy1] = 0; xxx1++; yyy1++;
				if (xxx1 > 9 || yyy1 > 9) {
					xxx1--;
					yyy1--;
				}
				else
					cc = 1;
				break;
			case 4: map[xxx1][yyy1] = 0; xxx1++;
				if (xxx1 > 9)
					xxx1--;
				else
					cc = 1;
				break;
			case 5: map[xxx1][yyy1] = 0; xxx1++; yyy1--;
				if (xxx1 > 9 || yyy1 < 0) {
					xxx1--;
					yyy1++;
				}
				else
					cc = 1;
				break;
			case 6: map[xxx1][yyy1] = 0; yyy1--;
				if (yyy1 < 0)
					yyy1++;
				else
					cc = 1;
				break;
			case 7: map[xxx1][yyy1] = 0; xxx1--; yyy1--;
				if (xxx1 < 0 || yyy1 < 0) {
					xxx1++;
					yyy1++;
				}
				else
					cc = 1;
				break;
			}
			if (cc == 1)
				map[xxx1][yyy1] = 2;
				break;
		}
		scanf(" %c", &key);
		switch (key) {
		case 'w': map[xx][yy] = 0; xx--;
			if (xx < 0) {
				xx++;
			}
			else if ((xx == xxx1 && yy == yyy1) || (xx == xxx2 && yy == yyy2)) {
				printf("gameover\n");
				exit = 1;
			}
			else if (xx == 9 && yy == 9)
				printf("Win\n");
			break;
		case 's': map[xx][yy] = 0; xx++;
			if (xx > 9) {
				xx++;
			}
			else if ((xx == xxx1 && yy == yyy1) || (xx == xxx2 && yy == yyy2)) {
				printf("gameover\n");
				exit = 1;
			}
			else if (xx == 9 && yy == 9)
				printf("Win\n");
			break;
		case 'a': map[xx][yy] = 0; yy--;
			if (yy < 0) {
				xx++;
			}
			else if ((xx == xxx1 && yy == yyy1) || (xx == xxx2 && yy == yyy2)) {
				printf("gameover\n");
				exit = 1;
			}
			else if (xx == 9 && yy == 9)
				printf("Win\n");
			break;
		case 'd': map[xx][yy] = 0; yy++;
			if (yy > 9) {
				xx++;
			}
			else if ((xx == xxx1 && yy == yyy1) || (xx == xxx2 && yy == yyy2)) {
				printf("gameover\n");
				exit = 1;
			}
			else if (xx == 9 && yy == 9)
				printf("Win\n");
			break;
		}

	}
	return 0;
}