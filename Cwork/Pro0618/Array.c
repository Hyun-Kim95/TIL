#include<stdio.h>
#include<stdlib.h>

#define SIZEE 7
#define SIZE 6	// �ֻ����� �� ��

void modify_array(int a[], int size);
void print_array(int a[], int size);

int main() {
	int a[] = { 0,1,2,3,4 };	// �Ʒ� �ּ��� ����(�Ϲ���): �迭ũ�� ��������
	int b[7] = { 0,1,2,3,4 };	// �� �迭�� 0���� ä����
	int c[500] = { 0 };			// 0���� 500�� ä����
	//int a[0];		// �����߻�
	/*a[0] = 0;
	a[1] = 1;
	a[2] = 2;
	a[3] = 3;
	a[4] = 4;*/
	//for (int i = 0; i < 5; i++)	// �� �ּ��� ����
	//{
	//	a[i] = i;
	//}
	printf("%d %d %d\n", a[0], &a[0], a);	// �迭���� ù��° �ε����� �ּҿ� ����
	printf("%d %d %d\n", a[0], &a[0]+1, a);	// �迭�� +1�� ���� �ε����� �ǹ���
	printf("%d %d %d\n", a[0], &a[1], a+1);	// &a[1]�� a+1 ���� ����

	printf("�ֻ��� ������\n\n");
	int freq[SIZE] = { 0 };		// ���� 0���� �ʱ�ȭ
	int i;

	srand(time(NULL));
	for (i = 0; i < 10000; i++)	// �ֻ����� 10000�� ����
		++freq[rand() % 6];		// ���� 0~5�� �ֻ��� ������ ���� �ش� �ε����� �� ������Ŵ

	printf("=====================\n");
	printf("�� ��\n");
	printf("=====================\n");

	for (i = 0; i < SIZE; i++)
		printf("%3d %3d \n", i + 1, freq[i]);

	printf("\n�迭�� �Լ�\n");
	int list[SIZEE] = { 1,2,3,4,5,6,7 };
	print_array(list, SIZEE);
	modify_array(list, SIZEE);	// �迭�� ������ ���޵�
	print_array(list, SIZEE);

	return 0;
}

void modify_array(int a[], int size)	// a�� �����ϸ� ������ �����
{
	int i;
	for (i = 0; i < size; i++)
		++a[i];;
}

void print_array(int a[], int size)		// �迭�� ��ҵ��� ���
{
	int i;
	for (i = 0; i < size; i++)
		printf("%3d ", a[i]);
	printf("\n");
}