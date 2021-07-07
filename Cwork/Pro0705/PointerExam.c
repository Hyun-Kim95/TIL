#include<stdio.h>
#include<stdlib.h>

void get_sum_diff(int x, int y, int* p_sum, int* p_diff) {
	*p_sum = x + y;
	*p_diff = x - y;
}
void array_fill(int* A, int size) {
	int i;
	srand(time(NULL));
	for (i = 0; i < size; i++) {
		A[i] = rand();
	}
}
void convert(double* scores, int size) {
	for (int i = 0; i < size; i++) {
		scores[i] = scores[i] * 100 / 4.3;
	}
}
void array_copy1(int* A, int* B, int size) {
	for (int i = 0; i < size; i++) {
		B[i] = A[i];
	}
}
void array_add(int* A, int* B, int* C, int size) {
	for (int i = 0; i < size; i++)
		C[i] = A[i] + B[i];
}
int array_sum(int* A, int size) {
	int sum = 0;

	for (int i = 0; i < size; i++)
		sum += A[i];
	return sum;
}
int search(int* A, int size, int search_value) {
	for (int i = 0; i < size; i++) {
		if (A[i] == search_value)
			return i;
	}
}
void get_lcm_gcd(int x, int y, int* p_lcm, int* p_gcd) {
	int i = 1, j = (x > y) ? y : x;
	while (1) {
		if (x > y) {
			if (x * i % y == 0) {
				*p_lcm = x * i;
				break;
			}
			else
				i++;
		}
		else {
			if (y * i % x == 0) {
				*p_lcm = y * i;
				break;
			}
			else
				i++;
		}
	}
	while (1) {
		if (x % j == 0 && y % j == 0) {
			*p_gcd = j;
			break;
		}
		else
			j--;
	}
}
void merge(int* A, int* B, int* C, int size) {
	int i = 0, j = 0, k = 0;
	while (1) {
		if (i >= size && j >= size)
			break;
		else if (i >= size) {
			C[k] = B[j];
			j++;
			k++;
		}
		else if (j >= size) {
			C[k] = A[i];
			i++;
			k++;
		}
		else if (A[i] < B[j]) {
			C[k] = A[i];
			i++;
			k++;
		}
		else {
			C[k] = B[j];
			j++;
			k++;
		}
	}
}
void get_int(int* px, int* py) {
	printf("2개의 정수를 입력하시오(예: 10 20): ");
	scanf("%d %d", px, py);
}
int main() {
	printf("2개의 정수의 합과 차를 동시에 반환\n");
	int a = 100, b = 200;
	int* sum = 0;
	int* diff = 0;
	get_sum_diff(a, b,&sum,&diff);
	printf("원소들의 합=%d\n", sum);
	printf("원소들의 차=%d\n", diff);

	printf("\n요소들을 난수로 채우는 함수(+출력형식)\n");
	int A[10];
	array_fill(&A, 10);
	printf("A[] = { ");
	for (int i = 0; i < 10; i++)
		printf("%d ", A[i]);
	printf("}\n");

	printf("\n4.3만점을 100점 만점으로 변환\n");
	double scores[10] = { 0,0.5, 1,1.5,2,2.5,3,3.5,4,4.3 };
	printf("원래점수: ");
	for (int i = 0; i < 10; i++)
		printf("%0.2lf ", scores[i]);
	convert(&scores, 10);
	printf("\n\n변환 후 점수: ");
	for (int i = 0; i < 10; i++)
		printf("%0.2lf ", scores[i]);

	printf("\n\n배열 복사\n");
	int aa[10] = { 1,2,3,0,0,0,0,0,0,0 };
	int bb[10];
	array_copy1(&aa, &bb, 10);
	printf("A[] = ");
	for (int i = 0; i < 10; i++)
		printf("%d ", aa[i]);
	printf("\nB[] = ");
	for (int j = 0; j < 10; j++)
		printf("%d ", bb[j]);

	printf("\n\n기본급과 보너스의 합 배열\n");
	int aaa[10] = { 1,2,3,0,0,0,0,0,0,0 };
	int bbb[10] = { 1,2,3,4,5,1,2,3,4,5 };
	int ccc[10];
	printf("A[] = ");
	for (int i = 0; i < 10; i++)
		printf("%d ", aaa[i]);
	printf("\nB[] = ");
	for (int i = 0; i < 10; i++)
		printf("%d ", bbb[i]);
	printf("\nC[] = ");
	array_add(&aaa, &bbb, &ccc, 10);
	for (int i = 0; i < 10; i++)
		printf("%d ", ccc[i]);

	printf("\n\n배열 요소들의 합\n");
	int monmo[10] = { 1,2,3,0,0,0,0,0,0,0 };
	printf("원급의 합=%d\n", array_sum(&monmo, 10));

	printf("\n월급이 200만원인 사람 찾기\n");
	int month[10] = { 100, 200,300,400,500,600,700,800,900,1000 };
	printf("월급이 200만원인 사람의 인덱스=%d\n",search(&month, 10, 200));

	printf("\n최대공약수와 최소공배수 동시 반환\n");
	int x, y, p_lcm, p_gcd;
	printf("두개의 정수를 입력하시오: ");
	scanf("%d %d", &x, &y);
	get_lcm_gcd(x, y, &p_lcm, &p_gcd);
	printf("최소공배수는 %d입니다.\n", p_lcm);
	printf("최대공약수는 %d입니다.\n", p_gcd);

	printf("\n두개의 정렬된 배열을 합쳐서 정렬된 배열을 만들기\n");
	int sorta[4] = { 2,5,7,8 };
	int sortb[4] = { 1,3,4,6 };
	int sortc[8];
	merge(&sorta, &sortb, &sortc, 4);
	printf("A[] = ");
	for (int i = 0; i < 4; i++)
		printf("%d ", sorta[i]);
	printf("\nB[] = ");
	for (int i = 0; i < 4; i++)
		printf("%d ", sortb[i]);
	printf("\nC[] = ");
	for (int i = 0; i < 8; i++)
		printf("%d ", sortc[i]);

	printf("\n\n2개의 정수를 입력받는 함수를 만들고 합을 구하는 프로그램\n");
	int px, py;
	get_int(&px, &py);
	printf("정수의 합은 %d\n", px + py);
	return 0;
}