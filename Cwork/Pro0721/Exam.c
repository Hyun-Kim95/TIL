#include<stdio.h>
#include<string.h>

#define STU_NUMBER 1
#define REG_NUMBER 2
struct student {
	int type;	// ����ü�� ���� � ������ ����ϴ��� ����
	union {
		int stu_number;		// �й�
		char reg_number[15];// �ֹε�Ϲ�ȣ �߿� �ϳ��� ���� ����
	} id;
	char name[20];
};
struct vector {
	float x;
	float y;
};
// ������ ������
enum days {SUN, MON, TUE, WED, THU, FRI, SAT};
char* days_name[] = {
	"sunday","monday","tuesday","wednesday","thursday","friday","saturday"
};
// ����ü ���� �Լ�
struct vector get_vector_sum(struct vector a, struct vector b) {
	struct vector result;
	result.x = a.x + b.x;
	result.y = a.y + b.y;

	return result;
}
// ����ü ���� �Լ�
void print(struct student s) {
	switch (s.type)
	{
	case STU_NUMBER:
		printf("�й�: %d\n", s.id.stu_number);
		printf("�̸�: %s\n", s.name);
		break;
	case REG_NUMBER:
		printf("�ֹε�Ϲ�ȣ: %d\n", s.id.reg_number);
		printf("�̸�: %s\n", s.name);
		break;
	default:
		printf("Ÿ�Կ���\n");
		break;
	}
}
int main() {
	printf("����ü ����\n");
	struct vector a = { 2.0, 3.0 };
	struct vector b = { 4.0, 5.0 };
	struct vector sum;
	
	sum = get_vector_sum(a, b);
	printf("������ ���� (%f, %f)�Դϴ�\n", sum.x, sum.y);
	// -------------------------
	printf("\n����ü ����\n");
	struct student s1, s2;

	s1.type = STU_NUMBER;
	s1.id.stu_number = 20190001;
	strcpy(s1.name, "ȫ�浿");

	s2.type = REG_NUMBER;
	strcpy(s2.id.reg_number, "860101-1056076");
	strcpy(s2.name, "��ö��");

	print(s1);
	print(s2);
	// -------------------------
	printf("\n������ ����\n");
	enum days d;	// ������ �����̹Ƿ� MON ���� SUN ������ ���鸸 ���� �� ����
	d = WED;
	printf("%d��° ������ %s�Դϴ�\n", d, days_name[d]);
	// 3��° ������ wednesday�Դϴ�
	return 0;
}