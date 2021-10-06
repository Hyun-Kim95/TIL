#include <iostream>
#include <string>
#include "ProtectedPoint.h"
using namespace std;

int main1() {
	Point p; // 기본 클래스의 객체 생성
	p.set(2, 3);
	//p.x = 5;									// 오류
	//p.y = 5;									// 오류
	p.showPoint();

	ColorPoint cp; // 파생 클래스의 객체 생성
	//cp.x = 10;									// 오류
	//cp.y = 10;									// 오류
	cp.set(3, 4);
	cp.setColor("Red");
	cp.showColorPoint();

	ColorPoint cp2;
	cp2.set(3, 4);
	cp2.setColor("Red");
	//cout << ((cp.equals(cp2)) ? "true" : "false"); // 오류

	return 0;
}
