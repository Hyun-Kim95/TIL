#include<stdio.h>
int main() {

	printf("�̸�: %s\n", "ȫ�浿");
	printf("����: %d��\n", 21);
	printf("�ּ�: %s\n", "���� 200����");
	printf("\n\n");
	printf("Hello\n");
	printf("C\n");
	printf("Programmers!\n");
	printf("\n\n");
	printf("*****************************************\n");
	printf("\t\t����Ʈ\n");
	printf("*****************************************\n");
	printf("\n\n");
	printf("*****************************************\n");
	printf("\t\t\t�а�: %s\n", "��ǻ�Ͱ��а�");
	printf("\t\t\t�й�: %s\n", "20180001");
	printf("\t\t\t����: %s\n", "ȫ�浿");
	printf("*****************************************\n");
	printf("\n\n");
	printf("��\t��\tȭ\t��\t��\t��\t��\n");
	printf("1\t2\t3\t4\t5\t6\t7\n");
	printf("8\t9\t10\t11\t12\t13\t14\n");
	printf("15\t16\t17\t18\t19\t20\t21\n");
	printf("22\t23\t24\t25\t26\t27\t28\n");
	printf("29\t30\t31\n");
	printf("\n\n");
	printf("7+8=%d\n", 7 + 8);
	printf("7-8=%d\n", 7 - 8);
	printf("7*8=%d\n", 7 * 8);
	printf("7/8=%d\n", 7 / 8);
	printf("\n");

	int num1, num2, result;	// �ʱ�ȭ���� ������ ������ ���� ��
	num1 = num2 = 0;	// ���Կ����ڸ� ����ؼ� ����
	/*num1 = 0;
	num2 = 0;*/
	char ch = 'a';
	printf("%c", ch);
	printf("�� ���� �Է�(10 30):");	// ������Ʈ
	int sNum = scanf("%d%d",&num1, &num2);	// scanf, printf �Ѵ� ���ϰ��� ������ ����(�μ��� ����)
	//scanf ����: ������Ʈ��Ŭ��->�Ӽ�->C++->�Ϲ�->sdl�˻� �ƴϿ�
	result = num1 + num2;
	printf("%d+%d=%d\n", num1, num2, result);
	printf("scanf�� ���ϰ�: %d\n", sNum);
	printf("num1�� �ּ�: %x\n", &num1);
	printf("num2�� �ּ�: %x\n", &num2);

	float f;
	double d;
	printf("�Ǽ��� �Է�:");
	scanf("%f", &f);
	d = f;
	//f = (float)d;	//�ݴ�� �Ϸ��� ����ȯ ������(ū�� �����ſ� �־)
	printf("f ���� %6.1f\n", f);// �� 6�ڸ��� �����ϰ� �Ҽ��� ù�ڸ������� ǥ��
	printf("d ���� %lf\n", d); //lf double�� ������ Ÿ��
	return 0;
}