//#include<stdio.h>
//
//void set_pointer(char** q) {
//	*q = "All that glisters is not gold";
//}
//
//int add(int x, int y) {
//	return x + y;
//}
//int sub(int x, int y) {
//	return x - y;
//}
//int mul(int x, int y) {
//	return x * y;
//}
//int div(int x, int y) {
//	return x / y;
//}
//void menu() {
//	printf("add:0, sub:1, mul:2, div:3\n");
//}
//int main0() {
//	typedef int VECTOR[2];
//	size_t a;	// unsined int ���� typedef �� �༮(Ctrl ������ Ŭ���ϸ� �� �� ����)
//	VECTOR array = { 10,20 };
//	// array[0] = 10;
//	// array[1] = 20;
//	printf("%d\n", array[0] + array[1]);
//
//	// -----------------------------
//
//	char* p = "aaa";
//	set_pointer(&p);
//
//	printf("������ �ݾ�: %s\n", p);
//	
//	// -----------------------------
//
//	int choice, result, x, y;
//	// �Լ� ������ �迭�� �����ϰ� �ʱ�ȭ
//	int(*pf[4])(int, int) = { add, sub, mul, div };
//
//	while (1) {
//		menu();
//		printf("�޴��� �����Ͻÿ�: ");
//		scanf("%d", &choice);
//
//		if (choice < 0 || choice >= 4)
//			break;
//		printf("2���� ������ �Է��Ͻÿ�:");
//		scanf("%d%d", &x, &y);
//
//		result = pf[choice](x, y);	// �Լ� �����͸� �̿��� �Լ� ȣ��
//		printf("������=%d\n", result);
//	}
//	return 0;
//}