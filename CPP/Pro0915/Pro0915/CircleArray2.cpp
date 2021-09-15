//#include<iostream>
//using namespace std;
//
//class Circle2 {
//	int radius;
//public:
//	Circle2();
//	Circle2(int r);
//	~Circle2();
//	void setRadius(int r) { radius = r; }
//	double getArea() { return 3.14 * radius * radius; }
//};
//
//Circle2::Circle2() {
//	radius = 1;
//	cout << "생성자 실행 radius = " << radius << endl;
//}
//
//Circle2::Circle2(int r) {
//	radius = r;
//	cout << "생성자 실행 radius = " << radius << endl;
//}
//
//Circle2::~Circle2() {
//	cout << "소멸자 실행 radius = " << radius << endl;
//}
//
//int main() {
//	Circle2* pArray = new Circle2[3];	// 객체 배열 생성
//
//	pArray[0].setRadius(10);
//	pArray[1].setRadius(20);
//	pArray[2].setRadius(30);
//
//	for (int i = 0; i < 3; i++) {
//		cout << pArray[i].getArea() << '\n';
//	}
//	Circle2* p = pArray;	// 포인터 p에 배열의 주소값으로 설정
//	for (int i = 0; i < 3; i++) {
//		cout << p->getArea() << '\n';
//		p++;	// 다음 원소의 주소로 증가
//	}
//
//	delete[]pArray;	// 객체 배열 소멸
//}