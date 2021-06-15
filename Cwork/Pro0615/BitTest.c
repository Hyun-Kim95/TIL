#include<stdio.h>

// int clearBit(char data, int num);	// 함수의 원형 선언

int clearBit(char data, int num, int Bits) {	// 위에 정의하면 선언 따로 필요 없음
	int res;
	char basicNum;
	basicNum = (Bits == 1) ? 0x01 : 0;
	basicNum = (Bits == 2) ? 0x03 : basicNum;
	basicNum = (Bits == 3) ? 0x07 : basicNum;
	res = data & (basicNum << num-Bits+1);
	return res >> num - Bits + 1;
}

int main0() {
	int num1;						// 지역변수
	char data1 = 88;				// 01011000
	int Bits;
	int num2;

	printf("관심 비트번호:");
	scanf("%d", &num1);
	printf("관심 비트수:");
	scanf("%d", &Bits);
	int result = clearBit(data1, num1, Bits);
	printf("Result: %d\n", result);	// 10진수로 출력되는것을 1,0으로 출력하려고
	

	return 0;
}