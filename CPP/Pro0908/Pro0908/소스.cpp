#include<iostream>	// ����� ��Ʈ��
using namespace std;	// std�� ���ǵ� Ŭ�������� ����ϰڴٴ� �ǹ�

class Circle {
public:
	int radius;
	Circle();		// �Ű����� ���� ������
	Circle(int r);	// �Ű� ���� �ִ� ������
	double getArea();
};

Circle::Circle() : Circle(1){}	// ���� ������

Circle::Circle(int r) {			// Ÿ�� ������
	radius = r;
	cout << "�������� " << radius << "�� �� ����" << endl;
}

double Circle::getArea() {
	return 3.14 * radius * radius;
}

int main() {
	int a;
	cout << "Enter the Number!!:";	// printf �ᵵ �Ǳ� ��
	// �� using�� �Ⱦ��� std::cin>>a; �̷��� ����ؾ� ��
	cin >> a;						// scanf�� �ᵵ �Ǳ� ��

	cout << "Inputed Number is " << a << endl;	// endl ��� "\n" ����ص� �Ǳ� ��
	// .�� ���� ����� �� �ִ� �������� �Լ��� ������ �ִ°� �� �� ����

	string str = "aaa";	// string ��� ����
	cout << str[1];


	Circle donut;	// �Ű����� ���� ������ ȣ��
	double area = donut.getArea();
	cout << "donut ������ " << area << endl;

	Circle pizza(30);	// �Ű� ���� �ִ� ������ ȣ��
	area = pizza.getArea();
	cout << "pizza ������ " << area << endl;

	return 0;
}