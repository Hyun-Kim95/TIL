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
//	// Circle 배열 초기화
//	Circle1 circleArray[3] = { Circle1(10),Circle1(20),Circle1(30) };
//
//	for (int i = 0; i < 3; i++)	// 배열의 각 원소 객체의 멤버 접근
//	{
//		cout << "Circle " << i << "의 면적은 " << circleArray[i].getArea() << endl;
//	}
//
//	Circle1* p;
//	p = circleArray;
//	for (int i = 0; i < 3; i++)	// 객체 포인터로 배열 접근
//	{
//		cout << "Circle " << i << "의 면적은 " << p->getArea() << endl;
//		p++;
//	}
//}