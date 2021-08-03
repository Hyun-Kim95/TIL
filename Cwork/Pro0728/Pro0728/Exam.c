//#include<stdio.h>
//#include<string.h>
//#define WIDTH 3
//char set_proverb(char** q, int n) {
//	static char* array[4] = { "A bad shearer never had a good sickle.",
//		"A bad workman (always) blames his tools.",
//		"A bad workman quarrels with his tools.",
//		"A bad thing never dies." };
//	*q = array[n];
//	return *q;
//}
//int get_sum(int array[], int size) {
//	int cnt = 0;
//	for (int i = 0; i < size; i++) {
//		cnt += array[i];
//	}
//	return cnt;
//}
//double get_average(int list[], int n) {
//	double avg;
//	double sum = 0;
//	for (int i = 0; i < n; i++) {
//		sum += list[i];
//	}
//	avg = sum / n;
//	return avg;
//}
//void pr_str_array(char** dp) {
//	for (int i = 0; i < 4; i++) {
//		printf("%s\n", dp[i]++);
//	}
//}
//void set_max_ptr(int m[], int size, int** pmax) {
//	pmax = m[0];
//	for (int i = 0; i < size; i++) {
//		if (pmax < m[i]) {
//			pmax = m[i];
//		}
//	}
//	printf("가장 큰 값은 %d\n",pmax);
//}
//void sort_strings(char* list[], int size) {
//	int i, j, least;
//	char* temp;
//
//	for (i = 0; i < size - 1; i++) {
//		least = i;	// i번째 값을 최소값으로 가정
//		for (j = i + 1; j < size; j++) {	// 최소값 탐색
//			if (strcmp(list[j], list[least]) < 0)
//				least = j;
//		}
//		// i번째 요소와 least 위치의 요소를 교환
//		temp = list[i];
//		list[i] = list[least];
//		list[least] = temp;
//	}
//}
//void array_copy(int src[][WIDTH], int dst[][WIDTH]) {
//	for (int i = 0; i < WIDTH; i++) {
//		for (int j = 0; j < WIDTH; j++) {
//			dst[i][j] = src[i][j];
//		}
//	}
//}
//
//int main0() {
//	int a;
//	char* p;
//	printf("1번 문제\n");
//	printf("몇번째 속담을 선택하시겠습니다? ");
//	scanf("%d", &a);
//	set_proverb(&p, a);
//	printf("%s\n", p);
//
//	printf("\n2번 문제\n");
//	int cnt = 0;
//	int array[6] = { 10,10,10,10,10,10 };
//	for (int i = 0; i < 3; i++) {
//		cnt += get_sum(array, 6);
//	}
//	printf("정수의 합=%d\n", cnt);
//
//	printf("\n3번 문제\n");
//	int list[3][5] = {
//		{ 90,20,30,80,50 },
//		{ 80,40,30,70,50 },
//		{ 70,50,30,60,50 }
//	};
//	for (int i = 0; i < 3; i++) {
//		printf("%d행의 평균값=%lf\n", i, get_average(list[i], 5));
//	}
//
//	printf("\n4번 문제\n");
//	char* array1[] = { "A bad shearer never had a good sickle.",
//		"A bad workman (always) blames his tools.",
//		"A bad workman quarrels with his tools.",
//		"A bad thing never dies." };
//	pr_str_array(array1);
//
//	printf("\n5번 문제\n");
//	int m[6] = { 5,6,1,3,7,9 };
//	int* pmax;	// 배열 m의 원소 중에서 가장 큰 값을 pmax가 가리킴
//
//	set_max_ptr(m, 6, &pmax);
//
//	printf("\n6번 문제\n");
//	char *aa[] = { "mycopy", "src", "dst" };
//	sort_strings(aa, 3);
//	for (int i = 0; i < 3; i++)
//		printf("%s\n", aa[i]);
//
//	printf("\n8번 문제\n");
//	int src[][WIDTH] = {
//		{100,30,67},
//		{89,50,12},
//		{19,60,90}
//	};
//	int dst[][WIDTH] = {
//		{0,0,0},
//		{0,0,0},
//		{0,0,0}
//	};
//	printf("<원본 2차원 배열>\n");
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0; j < 3; j++) {
//			printf("%d ", src[i][j]);
//		}
//		printf("\n");
//	}
//	array_copy(src, dst);
//	printf("<복사본 2차원 배열>\n");
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0; j < 3; j++) {
//			printf("%d ", dst[i][j]);
//		}
//		printf("\n");
//	}
//
//	return 0;
//}