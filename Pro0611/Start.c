#include<stdio.h>
#include<limits.h>	// �ִ밪 Ȯ�� ����

int main() {

	float body1, body2;
	printf("�����Ը� �Է��ϼ���:");
	scanf("%f%f", &body1, &body2);
	printf("��� ������: %0.1f", (body1 + body2) / 2);	// 0�ڸ��� 1 �Ҽ����ڸ���
	// '0' -> 48
	// '1' -> 49
	// 'A' -> 65
	// 'a' -> 97
	// "1" -> '1''\0'	���ڿ��� �������� �� ���ڰ� ��

	printf("\n");
	double w, h, area, perimeter;
	printf("�簢���� ���ο� ���θ� �Է�(1.2 2.3):");
	scanf("%lf%lf", &w, &h);
	area = w * h;
	perimeter = 2 * (w + h);
	printf("�簢���� ����: %lf\n �簢���� �ѷ�: %lf", area, perimeter);
	char ch = -51;
	char ch1 = 0xd6;		// 16����ǥ���� �տ� 0x�� ������ ��: -42
	char ch2 = 0xff;		// -1
	int ch3 = 0xff;		// 255: int���� 4����Ʈ�� 0xffffffff �� -1
	printf("ch: %d, %d, %d, %d\n", ch, ch1, ch2, ch3);
	//8������ �տ� 0�� ������ ��

	short s_money = SHRT_MAX;	// �ִ밪���� �ʱ�ȭ 32767
	s_money += 1;
	printf("s_money = %d\n", s_money);	// -32768	�����÷ο� �߻�!
										// �����÷ο�: ������ �Ѿ�� ����(�ִ�)���� ����
	
	
	// ����
	float a, b, c, sum, avg;
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%f", &a);
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%f", &b);
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%f", &c);
	sum = a + b + c;
	avg = sum / 3;
	printf("���� %f�̰� ����� %f�Դϴ�.\n", sum, avg);

	float d;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%f", &d);
	printf("%0.1f������ %f�����Դϴ�.\n",d, 1609 * d);

	float e, f;
	printf("�ﰢ���� �غ�: ");
	scanf("%f", &e);
	printf("�ﰢ���� ����: ");
	scanf("%f", &f);
	printf("�ﰢ���� ����: %f\n", e*f/2);
	
	float g;
	printf("ȭ������ �Է��Ͻÿ�: ");
	scanf("%f", &g);
	printf("�������� %f�� �Դϴ�. \n", (5 * (g - 32))/9);

	return 0;
}