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
		printf("같음\n");
	else
		printf("%d개의 배열은 다름\n", cnt);
}
void array_copy(int a[], int b[], int size) {
	for (int i = 0; i < size; i++) {
		b[i] = a[i];
	}
	printf("원래의 배열\n");
	for (int k = 0; k < size; k++) {
		printf("%d ", b[k]);
	}
	printf("\n복사한 배열\n");
	for (int j = 0; j < size; j++) {
		printf("%d ", b[j]);
	}
}
void vector_add(double a[],double b[]) {
	double c[3];
	for (int i = 0; i < 3; i++) {
		c[i] = a[i] + b[i];
	}
	printf("백터의 합 = [%lf %lf %lf]\n",c[0],c[1],c[2]);
}
void vector_dot_prod(double a[], double b[]) {
	double c[3];
	for (int i = 0; i < 3; i++) {
		c[i] = a[i] * b[i];
	}
	printf("백터의 내적 = [%lf]\n", c[0] + c[1] + c[2]);
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
	/*printf("1번 문제\n");
	int day[] = { 31,29,31,30,31,30,31,31,30,31,30,31 };
	int len = sizeof(day) / sizeof(day[0]);
	for (int i = 0; i < len; i++)
		printf("%d월은 %d일까지 있습니다.\n", i + 1, day[i]);

	printf("\n2번 문제(난수 배열의 최대,최소)\n");
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
	printf("최대값은 %d", max);
	printf("최소값은 %d", min);

	printf("\n3번 문제(배열의 대응되는 배열 요소가 같은지 검사)\n");
	int a[] = { 1,2,3,0,0,0,0,0,0,0 };
	int b[] = { 0,0,0,0,0,0,0,0,0,0 };
	int c = 10;
	array_equal(a, b, c);

	printf("\n4번 문제(배열 복사)\n");
	array_copy(a, b, c);

	printf("\n5번 문제(가장 많이 나온 난수)\n");
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
	printf("가장 많이 나온수=%d\n", max_0);

	printf("\n6번 문제(행,열의 합계)\n");
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
		printf("%d행의 합계: %d\n", i, cnt_0);
		cnt_0 = 0;
	}
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 3; j++) {
			cnt_1 += hang[j][i];
		}
		printf("%d열의 합계: %d\n", i, cnt_1);
		cnt_1 = 0;
	}

	printf("\n7번 문제(제곱,세제곱)\n");
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
	printf("\n정수를 입력하시오(정수<=1000):");
	scanf("%d", &gn);
	for (int i = 0; i < 10; i++) {
		if (zegop[2][i] == gn) {
			printf("%d의 세제곱근은 %d\n", gn, zegop[0][i]);
			chk = 1;
		}
	}
	if (chk == 0)
		printf("세제곱근이 없습니다\n");

	printf("\n8번 문제(평균과 표준편차)\n");
	int m = 0, data[10];
	double  v = 0;
	for (int i = 0; i < 10; i++) {
		int a;
		printf("데이터를 입력하시오(10개):");
		scanf("%d", &a);
		data[i] = a;
		m += a;
	}
	printf("평균값은 %lf\n", (double)m / 10.0);
	for (int i = 0; i < 10; i++) {
		v += (data[i] - ((double)m / 10.0)) * (data[i] - ((double)m / 10.0));
	}
	printf("표준편차값은 %lf\n", sqrt(v / 10.0));

	printf("\n9번 문제(각 학생별 최대최소)\n");
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
		printf("시험 #%d의 최대점수=%d\n", i, max_s);
		printf("시험 #%d의 최저점수=%d\n", i, min_s);
	}
	printf("\n10번 문제(백터의 합,백터의 내적)\n");
	double vector_1[] = { 1.0, 2.0, 3.0 };
	double vector_2[] = { 1, 2, 3 };
	
	vector_add(vector_1, vector_2);
	vector_dot_prod(vector_1, vector_2);
	
	printf("\n11번 문제(재고관리)\n");
	int number[] = { 1,2,3,4,5,6,7,8,9,10 };
	int space[] = { 1,2,3,4,5,1,2,3,4,5 };
	int num;
	printf("상품 번호를 입력하시오:(1~10)");
	scanf("%d", &num);
	printf("상품 번호 %d의 위치는 %d입니다.\n", num,space[num-1]);

	printf("\n12번 문제(행렬)\n");
	int hangg[3][3] = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};
	scalar_mult(hangg, 2);
	transpose(hangg);

	printf("\n13번 문제(10진수를 2진수로 변환)\n");
	int bi[] = { 0, };
	int ten,check=0;
	printf("10진수를 입력하세요:");
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

	printf("\n14번 문제(random walk)\n");
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

	printf("\n15번 문제(지뢰찾기)\n");
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

	printf("\n16번 문제(금찾기 게임)\n");
	int map[10][10] = { 0, };
	char key;
	int xx = 0, yy = 0;	// 유저위치
	int xxx1=9, xxx2=8, yyy1=8, yyy2=9;	// 몬스터 위치
	int exit = 0;	// 종료시 1

	map[9][9] = 3;	// 골드
	map[xxx1][yyy1] = 2;	// 몬스터
	map[xxx2][yyy2] = 2;	// 몬스터
	while (1)
	{
		map[xx][yy] = 1;	// 유저
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