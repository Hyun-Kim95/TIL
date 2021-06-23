#include<stdio.h>
#include<math.h>
#include<time.h>

double square1(double a) {
	return a * a;
}
void check_alpha() {
	char b[] = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char ch;
	int cnt = 0;
	printf("���ڸ� �Է��Ͻÿ�: ");
	scanf(" %c", &ch);
	for (int i=0;i<26;i++)
	{
		if (ch == b[i]) {
			printf("%c�� ���ĺ� �����Դϴ�.\n", ch);;
			cnt = 1;
		}
	}
	if (cnt == 0)
		printf("%c�� ���ĺ� ���ڰ� �ƴմϴ�.\n", ch);
}
double cal_area(double a) {
	return 3.141592 * a * a;
}
int is_leap(int a) {
	if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		return 366;
	else
		return 365;
}
int round1(double a) {
	return (int)(a + 0.5);
}
void even1(int a) {
	printf("even�� ���: %s\n",(a % 2) ? "Ȧ��" : "¦��");
}
void absolute1(int a) {
	printf("absolute�� ���: %d\n", (a < 0) ? a * (-1) :a);
}
void sign1(int a) {
	printf("sign�� ���: ");
	if (a > 0)
		printf("���\n");
	else if (a == 0)
		printf("0\n");
	else
		printf("����\n");
}
void get_tax(int a) {
	if (a > 1000)
		printf("�ҵ漼�� %lf�Դϴ�\n", (double)a / 100 * 8);
	else
		printf("�ҵ漼�� %d�Դϴ�\n", a / 10);
}
void sin_degree() {
	for (double i = 0; i <= 180; i+=10) {
		printf("sin(%lf)�� ���� %lf\n", i, sin(i * 3.1415926 / 180.0));
	}
}
int b_rand() {
	return rand() % 2;
}
double f_rand() {		// rand()�� 0~32767 �߿� �������� ��ȯ�� �ִ� �Լ���
	double a = rand() / (double)32767;
	return a;
}
void print_value(int a) {
	for (int i = 0; i < a; i++) {
		printf("*");
	}
	printf("\n");
}
void is_muliple() {
	int n, m;
	printf("ù��° ������ �Է��Ͻÿ�: ");
	scanf("%d", &n);
	printf("�ι�° ������ �Է��Ͻÿ�: ");
	scanf("%d", &m);
	if (n % m)
		printf("%d�� %d�� ����� �ƴմϴ�.\n", n, m);
	else
		printf("%d�� %d�� ����Դϴ�.\n", n, m);
}
void get_distance() {
	double x1, x2, y1, y2, result = 0;
	printf("ù��° ���� ��ǥ�� �Է��Ͻÿ�:(x,y)");
	scanf("%lf %lf", &x1, &y1);
	printf("�ι�° ���� ��ǥ�� �Է��Ͻÿ�:(x,y)");
	scanf("%lf %lf", &x2, &y2);
	result = sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	printf("���� ������ �Ÿ��� %lf�Դϴ�.\n", result);
}
void is_prime() {
	printf("2 ");
	for (int i = 2; i <= 100; i++) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0)
				break;
			if (j == i - 1)
				printf("%d ",i);
		}
	}
}
void factorial() {
	int a, b = 1;
	double cnt = 0;
	printf("������ ����ұ��?:");
	scanf("%d", &a);
	for (int i = 1; i <= a; i++) {
		b *= i;
		cnt += 1.0 / b;
	}
	printf("���Ϸ��� ���� %lf�Դϴ�.\n", cnt+1);
}
void f_equal() {
	double a, b, A, B;
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &a);
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &b);
	A = a - b;
	if (a - b < 0)
		A *= -1;
	if (a < 0)
		a *= -1;
	if (b < 0)
		b *= -1;
	B = (a > b) ? b : a;
	if (A / B < 0.000001)
		printf("�� ���� �Ǽ��� �ٻ������� ����\n");
	else
		printf("�� ���� �Ǽ��� ���� �ٸ�\n");
}
void func_func() {
	while (1) {
		int a, b, c, result = 0;
		char ch;
		printf("=============================\n");
		printf("MENU\n");
		printf("=============================\n");
		printf("1. ����\n");
		printf("2. ����\n");
		printf("3. ����\n");
		printf("4. ������\n");
		printf("5. ������\n");
		printf("���ϴ� �޴��� �����Ͻÿ�(1~5): ");
		scanf("%d", &a);
		printf("���� 2���� �Է��Ͻÿ�: ");
		scanf("%d %d", &b, &c);
		switch (a)
		{
		case 1: result = b + c; break;
		case 2: result = b - c; break;
		case 3: result = b * c; break;
		case 4: result = b / c; break;
		case 5: result = b % c; break;
		}
		printf("������: %d\n", result);
		printf("����Ϸ��� y�� �����ÿ�: ");
		scanf(" %c", &ch);
		if (c != 'y')
			break;
	}
}
// main�Լ� ����
int main() {
	printf("�������ϱ�\n");
	double x;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%lf", &x);
	printf("�־��� ���� %lf�� ������ %lf�Դϴ�.\n", x, square1(x));

	printf("\n���ĺ��� �´��� Ȯ��\n");
	check_alpha();

	printf("\n���� ���� ���ϱ�\n");
	double radius1;
	printf("���� �������� �Է��Ͻÿ�: ");
	scanf("%lf", &radius1);
	printf("���� ������ %lf�Դϴ�.\n", cal_area(radius1));

	printf("\n����Ȯ���ϱ�\n");
	int year;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%d", &year);
	printf("%d���� %d�� �Դϴ�.\n", year, is_leap(year));

	printf("\n�ݿø� ���ϱ�\n");
	double f;
	printf("�Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &f);
	printf("�ݿø��� ���� %d�Դϴ�\n", round1(f));

	printf("\n�������� �Լ� �׽�Ʈ\n");
	int n;
	printf("������ �Է��Ͻÿ�: ");
	scanf("%d", &n);
	even1(n);
	absolute1(n);
	sign1(n);

	printf("\n�ҵ漼 ���\n");
	int income;
	printf("�ҵ��� �Է��Ͻÿ�(����): ");
	scanf("%d", &income);
	get_tax(income);

	printf("\n�����Լ� ���\n");
	sin_degree();

	printf("\n������ 1�� 0\n");
	srand(time(NULL));
	for (int i = 0; i < 5; i++) {
		printf("%d ",b_rand());
	}
	
	printf("\n���� �յ� ���߱�\n");
	while (1)
	{
		int aa;
		char ch1;
		printf("�ո� �Ǵ� �޸�(1 �Ǵ� 0): ");
		scanf("%d", &aa);
		if (aa == b_rand())
			printf("�¾ҽ��ϴ�.\n");
		else
			printf("Ʋ�Ƚ��ϴ�.\n");
		printf("����Ͻðڽ��ϱ�?(y �Ǵ� n): ");
		scanf(" %c", &ch1);
		if (ch1 == 'n')
			break;
	}

	printf("\n0.0~1.0���� ���� �߻�\n");
	for (int i = 0; i < 5; i++) {
		printf("%lf ", f_rand());
	}

	printf("\n���� �׷���\n");
	int s;
	while (1) {
		printf("���� �Է��Ͻÿ�(����� ����): ");
		scanf("%d", &s);
		if (s < 0)
			break;
		print_value(s);
	}

	printf("\n��� Ȯ��\n");
	is_muliple();

	printf("\n�� �� ������ �Ÿ� ���\n");
	get_distance();

	printf("\n�Ҽ����� �˻�\n");
	is_prime();
	printf("\n");

	printf("\n���Ϸ��� ���� ���\n");
	factorial();

	printf("\n�� �Ǽ��� �ٻ������� ������ Ȯ��\n");
	f_equal();

	printf("\n����\n");
	func_func();
	return 0;
}