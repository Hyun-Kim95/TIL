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
	printf("ù��° ���� ��ǥ�� �Է��Ͻÿ�(x y):");
	scanf("%d %d", &p1.x, &p1.y);
	printf("�ι�° ���� ��ǥ�� �Է��Ͻÿ�(x y):");
	scanf("%d %d", &p2.x, &p2.y);
	xx = p1.x - p2.x;
	yy = p1.y - p2.y;
	dist = sqrt(xx * xx + yy * yy);
	printf("�Ÿ��� %lf�Դϴ�\n", dist);


	return 0;
}