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
	printf("2���� ������ �Է��Ͻÿ�(��: 10 20): ");
	scanf("%d %d", px, py);
}
int main() {
	printf("2���� ������ �հ� ���� ���ÿ� ��ȯ\n");
	int a = 100, b = 200;
	int* sum = 0;
	int* diff = 0;
	get_sum_diff(a, b,&sum,&diff);
	printf("���ҵ��� ��=%d\n", sum);
	printf("���ҵ��� ��=%d\n", diff);

	printf("\n��ҵ��� ������ ä��� �Լ�(+�������)\n");
	int A[10];
	array_fill(&A, 10);
	printf("A[] = { ");
	for (int i = 0; i < 10; i++)
		printf("%d ", A[i]);
	printf("}\n");

	printf("\n4.3������ 100�� �������� ��ȯ\n");
	double scores[10] = { 0,0.5, 1,1.5,2,2.5,3,3.5,4,4.3 };
	printf("��������: ");
	for (int i = 0; i < 10; i++)
		printf("%0.2lf ", scores[i]);
	convert(&scores, 10);
	printf("\n\n��ȯ �� ����: ");
	for (int i = 0; i < 10; i++)
		printf("%0.2lf ", scores[i]);

	printf("\n\n�迭 ����\n");
	int aa[10] = { 1,2,3,0,0,0,0,0,0,0 };
	int bb[10];
	array_copy1(&aa, &bb, 10);
	printf("A[] = ");
	for (int i = 0; i < 10; i++)
		printf("%d ", aa[i]);
	printf("\nB[] = ");
	for (int j = 0; j < 10; j++)
		printf("%d ", bb[j]);

	printf("\n\n�⺻�ް� ���ʽ��� �� �迭\n");
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

	printf("\n\n�迭 ��ҵ��� ��\n");
	int monmo[10] = { 1,2,3,0,0,0,0,0,0,0 };
	printf("������ ��=%d\n", array_sum(&monmo, 10));

	printf("\n������ 200������ ��� ã��\n");
	int month[10] = { 100, 200,300,400,500,600,700,800,900,1000 };
	printf("������ 200������ ����� �ε���=%d\n",search(&month, 10, 200));

	printf("\n�ִ������� �ּҰ���� ���� ��ȯ\n");
	int x, y, p_lcm, p_gcd;
	printf("�ΰ��� ������ �Է��Ͻÿ�: ");
	scanf("%d %d", &x, &y);
	get_lcm_gcd(x, y, &p_lcm, &p_gcd);
	printf("�ּҰ������ %d�Դϴ�.\n", p_lcm);
	printf("�ִ������� %d�Դϴ�.\n", p_gcd);

	printf("\n�ΰ��� ���ĵ� �迭�� ���ļ� ���ĵ� �迭�� �����\n");
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

	printf("\n\n2���� ������ �Է¹޴� �Լ��� ����� ���� ���ϴ� ���α׷�\n");
	int px, py;
	get_int(&px, &py);
	printf("������ ���� %d\n", px + py);
	return 0;
}