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
//	cout << "������ ���� radius = " << radius << endl;
//}
//
//Circle2::Circle2(int r) {
//	radius = r;
//	cout << "������ ���� radius = " << radius << endl;
//}
//
//Circle2::~Circle2() {
//	cout << "�Ҹ��� ���� radius = " << radius << endl;
//}
//
//int main() {
//	Circle2* pArray = new Circle2[3];	// ��ü �迭 ����
//
//	pArray[0].setRadius(10);
//	pArray[1].setRadius(20);
//	pArray[2].setRadius(30);
//
//	for (int i = 0; i < 3; i++) {
//		cout << pArray[i].getArea() << '\n';
//	}
//	Circle2* p = pArray;	// ������ p�� �迭�� �ּҰ����� ����
//	for (int i = 0; i < 3; i++) {
//		cout << p->getArea() << '\n';
//		p++;	// ���� ������ �ּҷ� ����
//	}
//
//	delete[]pArray;	// ��ü �迭 �Ҹ�
//}