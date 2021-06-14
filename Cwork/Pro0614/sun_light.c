#include<stdio.h>

int main(void) {
	double light_speed = 300000;
	double distance = 149600000;

	int time;
	time = distance / light_speed;

	printf("���� �ӵ��� %fkm/s \n", light_speed);
	printf("�¾�� �������� �Ÿ� %fkm \n", distance);
	printf("���� �ð��� %d�� %d�� \n", (int)time/60, (int)time%60);

	printf("***********************\n");
	
	int user, change = 0;
	int price, c5000, c1000, c500, c100;

	printf("���� ���� �Է��Ͻÿ�: ");
	scanf("%d", &price);			// ���� ���� �Է� ����
	printf("����ڰ� �� ��: ");
	scanf("%d", &user);
	change = user - price;			// �Ž��� ���� change�� ����

	c5000 = change / 5000;			// �� �����ڸ� ����Ͽ� 5000�� ���� ������ ���
	change %= 5000;					// ������ �����ڸ� ����Ͽ� ���� �ܵ��� ���

	c1000 = change / 1000;
	change %= 1000;

	c500 = change / 500;
	change %= 500;

	c100 = change / 100;
	change %= 100;

	printf("��õ����: %d\n", c5000);
	printf("õ����: %d\n", c1000);
	printf("����� ����: %d\n", c500);
	printf("��� ����: %d\n", c100);

	printf("**********************\n");

	// ���� ���α׷�
	int year, result;

	printf("������ �Է��Ͻÿ�: ");
	scanf("%d", &year);

	result = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	printf("result=%d \n", result);

	printf("**********************\n");

	int a, b, c, d, max_value;
	printf("���� 4���� �Է��Ͻÿ�: ");
	scanf("%d%d%d%d", &a, &b, &c, &d);
	max_value = (a > b) ? a : b;
	max_value = (max_value > c) ? max_value : c;
	max_value = (max_value > d) ? max_value : d;
	printf("max_value=%d \n", max_value);

	printf("**********************\n");

	// ��Ʈ����
	printf("AND: %08x\n", 0x9 & 0xA);
	printf("OR: %08x\n", 0x9 | 0xA);
	printf("XOR: %08x\n", 0x9 ^ 0xA);
	printf("NOT: %08x\n", ~0x9);
	printf("<<: %08x\n", 0x4 << 1);
	printf(">>: %08x\n", 0x4 >> 1);

	printf("***********����***********\n");
	// ����
	float f1;
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%f", &f1);
	printf("�Ǽ��������δ� %f �Դϴ� \n", f1);
	printf("�����������δ� %e �Դϴ� \n", f1);		// ���������� %e�� ǥ��

	int c1;
	printf("16���� ������ �Է��Ͻÿ�: ");
	scanf("%x", &c1);
	printf("8�����δ� %#o �Դϴ� \n", c1);
	printf("10�����δ� %d �Դϴ� \n", c1);
	printf("16�����δ� %#x �Դϴ� \n", c1);			// %#x : 0x11�� ���� ǥ��

	int x = 10;
	int y = 20;
	int z;
	printf("x=%d y=%d\n", x, y);
	z = x;
	x = y;
	y = z;
	printf("x=%d y=%d\n", x, y);

	double w, h, d;
	printf("������ ���� ���� ���̸� �ѹ��� �Է�: ");
	scanf("%lf%lf%lf", &w, &h, &d);					// %lf : double
	printf("������ ���Ǵ� %lf �Դϴ�\n", w * h * d);

	int p1;
	printf("���� �Է��ϼ���: ");
	scanf("%d", &p1);
	printf("%f ������ �Դϴ�\n", p1*3.3);

	printf("%f", 3.32e-3 + 9.76e-8);

	float a, b;
	printf("����(kg): ");
	scanf("%f", &a);
	printf("�ӵ�(m/s): ");
	scanf("%f", &b);
	printf("�������(J): %f\n", a * b * b / 2.0);

	int ac;
	printf("�ƽ�Ű �ڵ尪�� �Է��Ͻÿ�: ");
	scanf("%d", &ac);
	printf("����:%c\n", ac);

	printf("%c %c %c\n", 'a' + 1, 'a' + 2, 'a' + 3);

	printf("\aȭ�簡 �߻��Ͽ����ϴ�\n");

	printf("\"ASCII code\", \'A\', \'B\', \'C\'\n\\t \\a \\n");
	return 0;
}