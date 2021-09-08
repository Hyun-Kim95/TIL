#include<iostream>	// 입출력 스트림
using namespace std;	// std에 정의된 클래스들을 사용하겠다는 의미

class Circle {
public:
	int radius;
	Circle();		// 매개변수 없는 생성자
	Circle(int r);	// 매개 변수 있는 생성자
	double getArea();
};

Circle::Circle() : Circle(1){}	// 위임 생성자

Circle::Circle(int r) {			// 타겟 생성자
	radius = r;
	cout << "반지름이 " << radius << "인 원 생성" << endl;
}

double Circle::getArea() {
	return 3.14 * radius * radius;
}

int main() {
	int a;
	cout << "Enter the Number!!:";	// printf 써도 되긴 함
	// 위 using을 안쓰면 std::cin>>a; 이렇게 사용해야 함
	cin >> a;						// scanf를 써도 되긴 함

	cout << "Inputed Number is " << a << endl;	// endl 대신 "\n" 사용해도 되긴 함
	// .을 찍어보면 사용할 수 있는 여러가지 함수와 변수가 있는걸 알 수 있음

	string str = "aaa";	// string 사용 가능
	cout << str[1];


	Circle donut;	// 매개변수 없는 생성자 호출
	double area = donut.getArea();
	cout << "donut 면적은 " << area << endl;

	Circle pizza(30);	// 매개 변수 있는 생성자 호출
	area = pizza.getArea();
	cout << "pizza 면적은 " << area << endl;

	return 0;
}