#include<stdio.h>

// int clearBit(char data, int num);	// �Լ��� ���� ����

int clearBit(char data, int num, int Bits) {	// ���� �����ϸ� ���� ���� �ʿ� ����
	int res;
	char basicNum;
	basicNum = (Bits == 1) ? 0x01 : 0;
	basicNum = (Bits == 2) ? 0x03 : basicNum;
	basicNum = (Bits == 3) ? 0x07 : basicNum;
	res = data & (basicNum << num-Bits+1);
	return res >> num - Bits + 1;
}

int main0() {
	int num1;						// ��������
	char data1 = 88;				// 01011000
	int Bits;
	int num2;

	printf("���� ��Ʈ��ȣ:");
	scanf("%d", &num1);
	printf("���� ��Ʈ��:");
	scanf("%d", &Bits);
	int result = clearBit(data1, num1, Bits);
	printf("Result: %d\n", result);	// 10������ ��µǴ°��� 1,0���� ����Ϸ���
	

	return 0;
}