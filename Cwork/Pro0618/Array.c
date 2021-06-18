#include<stdio.h>
#include<stdlib.h>

#define SIZEE 7
#define SIZE 6	// 주사위의 눈 수

void modify_array(int a[], int size);
void print_array(int a[], int size);

int main() {
	int a[] = { 0,1,2,3,4 };	// 아래 주석과 같음(일반적): 배열크기 생략가능
	int b[7] = { 0,1,2,3,4 };	// 빈 배열은 0으로 채워짐
	int c[500] = { 0 };			// 0으로 500개 채워짐
	//int a[0];		// 오류발생
	/*a[0] = 0;
	a[1] = 1;
	a[2] = 2;
	a[3] = 3;
	a[4] = 4;*/
	//for (int i = 0; i < 5; i++)	// 위 주석과 같음
	//{
	//	a[i] = i;
	//}
	printf("%d %d %d\n", a[0], &a[0], a);	// 배열명은 첫번째 인덱스의 주소와 같음
	printf("%d %d %d\n", a[0], &a[0]+1, a);	// 배열에 +1은 다음 인덱스를 의미함
	printf("%d %d %d\n", a[0], &a[1], a+1);	// &a[1]과 a+1 같은 값임

	printf("주사위 던지기\n\n");
	int freq[SIZE] = { 0 };		// 전부 0으로 초기화
	int i;

	srand(time(NULL));
	for (i = 0; i < 10000; i++)	// 주사위를 10000번 던짐
		++freq[rand() % 6];		// 난수 0~5를 주사위 면으로 보고 해당 인덱스의 값 증가시킴

	printf("=====================\n");
	printf("면 빈도\n");
	printf("=====================\n");

	for (i = 0; i < SIZE; i++)
		printf("%3d %3d \n", i + 1, freq[i]);

	printf("\n배열과 함수\n");
	int list[SIZEE] = { 1,2,3,4,5,6,7 };
	print_array(list, SIZEE);
	modify_array(list, SIZEE);	// 배열은 원본이 전달됨
	print_array(list, SIZEE);

	return 0;
}

void modify_array(int a[], int size)	// a를 변경하면 원본이 변경됨
{
	int i;
	for (i = 0; i < size; i++)
		++a[i];;
}

void print_array(int a[], int size)		// 배열의 요소들을 출력
{
	int i;
	for (i = 0; i < size; i++)
		printf("%3d ", a[i]);
	printf("\n");
}