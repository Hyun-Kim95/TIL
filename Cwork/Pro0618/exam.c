#include<stdio.h>
#include<math.h>
#include<Windows.h>

int main0() {
	printf("������ ���ϱ�\n");
	double v;
	while (1)
	{
		printf("�Ǽ����� �Է��Ͻÿ�(����:-1):");
		scanf("%lf", &v);
		if (v < 0.0)
			break;
		printf("%f�� �������� %f�Դϴ�.\n", v, sqrt(v));
	}
	printf("\n�ҹ��ڸ� �빮�ڷ� ����\n");
	char letter;
	while (1)
	{
		printf("�ҹ��ڸ� �Է��ϼ���(����:Q): ");
		scanf(" %c", &letter);			// ���� ���� ����
		if (letter == 'Q')				// Q�� �ԷµǸ� ����
			break;
		if (letter < 'a' || letter>'z')	// �ҹ��ڰ� �ƴϸ� ���� �ݺ� ����
			continue;
		letter -= 32;					// �ҹ��� -> �빮��: �ƽ�Ű�ڵ�
		printf("��ȯ�� �빮�ڴ� %c�Դϴ�.\n", letter);
	}
	printf("\nȭ�鿡 �簢�� �׸���\n");
	HDC hdc = GetWindowDC(GetForegroundWindow());	// �׸��� �Ӽ�

	int i;
	for (i = 0; i < 100; i++)
	{
		int x = rand() % 500;
		int y = rand() % 300;
		int w = rand() % 100;
		int h = rand() % 100;
		Rectangle(hdc, x, y, x + w, y + h);	// �����ϰ� �簢���� �׸���
		Sleep(100);							// 0.1�� ����
		Ellipse(hdc, x, y, x + w, y + h);	// �����ϰ� ���� �׸���
		Sleep(100);
	}
	printf("\n���̱��ϱ�\n");
	double divisor, divident, sum;
	int loop_count;

	divisor = 1.0;
	divident = 4.0;
	sum = 0.0;
	printf("�ݺ�Ƚ��:");
	scanf("%d", &loop_count);
	while (loop_count > 0)
	{
		sum = sum + divident / divisor;
		divident = -1.0 * divident;
		divisor = divisor + 2;
		loop_count--;
	}
	printf("Pi = %f\n", sum);
	return 0;
}