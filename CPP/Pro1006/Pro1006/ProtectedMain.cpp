#include <iostream>
#include <string>
#include "ProtectedPoint.h"
using namespace std;

int main1() {
	Point p; // �⺻ Ŭ������ ��ü ����
	p.set(2, 3);
	//p.x = 5;									// ����
	//p.y = 5;									// ����
	p.showPoint();

	ColorPoint cp; // �Ļ� Ŭ������ ��ü ����
	//cp.x = 10;									// ����
	//cp.y = 10;									// ����
	cp.set(3, 4);
	cp.setColor("Red");
	cp.showColorPoint();

	ColorPoint cp2;
	cp2.set(3, 4);
	cp2.setColor("Red");
	//cout << ((cp.equals(cp2)) ? "true" : "false"); // ����

	return 0;
}
