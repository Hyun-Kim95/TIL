#include<stdio.h>
#include<math.h>
#include<Windows.h>

int main0() {
	printf("제곱근 구하기\n");
	double v;
	while (1)
	{
		printf("실수값을 입력하시오(종료:-1):");
		scanf("%lf", &v);
		if (v < 0.0)
			break;
		printf("%f의 제곱근은 %f입니다.\n", v, sqrt(v));
	}
	printf("\n소문자를 대문자로 변경\n");
	char letter;
	while (1)
	{
		printf("소문자를 입력하세요(종료:Q): ");
		scanf(" %c", &letter);			// 공백 문자 제외
		if (letter == 'Q')				// Q가 입력되면 종료
			break;
		if (letter < 'a' || letter>'z')	// 소문자가 아니면 다음 반복 진행
			continue;
		letter -= 32;					// 소문자 -> 대문자: 아스키코드
		printf("변환된 대문자는 %c입니다.\n", letter);
	}
	printf("\n화면에 사각형 그리기\n");
	HDC hdc = GetWindowDC(GetForegroundWindow());	// 그리기 속성

	int i;
	for (i = 0; i < 100; i++)
	{
		int x = rand() % 500;
		int y = rand() % 300;
		int w = rand() % 100;
		int h = rand() % 100;
		Rectangle(hdc, x, y, x + w, y + h);	// 랜덤하게 사각형을 그린다
		Sleep(100);							// 0.1초 멈춤
		Ellipse(hdc, x, y, x + w, y + h);	// 랜덤하게 원을 그린다
		Sleep(100);
	}
	printf("\n파이구하기\n");
	double divisor, divident, sum;
	int loop_count;

	divisor = 1.0;
	divident = 4.0;
	sum = 0.0;
	printf("반복횟수:");
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