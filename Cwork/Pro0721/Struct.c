#include<stdio.h>
#include<math.h>

struct Point {
	int x;
	int y;
};
int main1() {
	struct Point p1,p2;
	int xx, yy;
	double dist;
	printf("첫번째 점의 좌표를 입력하시오(x y):");
	scanf("%d %d", &p1.x, &p1.y);
	printf("두번째 점의 좌표를 입력하시오(x y):");
	scanf("%d %d", &p2.x, &p2.y);
	xx = p1.x - p2.x;
	yy = p1.y - p2.y;
	dist = sqrt(xx * xx + yy * yy);
	printf("거리는 %lf입니다\n", dist);


	return 0;
}