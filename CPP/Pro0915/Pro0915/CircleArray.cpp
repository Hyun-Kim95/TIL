//#include<iostream>
//using namespace std;
//
//class Circle1
//{
//private:
//	int radius;
//public:
//	Circle1() { radius = 1; }
//	Circle1(int r) { radius = r; }
//	double getArea();
//};
//double Circle1::getArea() {
//	return 3.14 * radius * radius;
//}
//int main() {
//	// Circle �迭 �ʱ�ȭ
//	Circle1 circleArray[3] = { Circle1(10),Circle1(20),Circle1(30) };
//
//	for (int i = 0; i < 3; i++)	// �迭�� �� ���� ��ü�� ��� ����
//	{
//		cout << "Circle " << i << "�� ������ " << circleArray[i].getArea() << endl;
//	}
//
//	Circle1* p;
//	p = circleArray;
//	for (int i = 0; i < 3; i++)	// ��ü �����ͷ� �迭 ����
//	{
//		cout << "Circle " << i << "�� ������ " << p->getArea() << endl;
//		p++;
//	}
//}