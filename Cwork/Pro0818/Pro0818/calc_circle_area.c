//#include<stdio.h>
//
//#define USA
//#define DEBUG
//
//#ifndef PI			// �ܼ� ��ũ�� PI�� ���ǵ��� �ʾ����� �����Ѵ�.
//#define PI 3.141592
//#endif
//
//#ifndef SQUARE		// �Լ� ��ũ�� PI�� ���ǵ��� �ʾ����� �����Ѵ�.
//#define SQUARE(r) (r)*(r)
//#endif
//
//area(double radius)
//{
//	double result = 0.0;
//#ifdef DEBUG		// DEBUG�� ���ǵǾ� ������ ����� ������ ����Ѵ�.
//#ifdef USA
//	printf("area(%lf) is called \n", radius);
//#else
//	printf("area(%lf)�� ȣ��Ǿ��� \n", radius);
//#endif
//#endif
//	result = PI * SQUARE(radius);
//	return result;
//}
//
//main3(void)
//{
//	double radius;
//
//#ifdef USA			// USA�� ���ǵǾ� ������ ��� �޽����� ����� ����Ѵ�.
//	printf("Please enter radius of a circle(inch) : ");
//#else
//	printf("���� �������� �Է��Ͻÿ�: ");
//#endif
//
//	scanf("%lf", &radius);
//#ifdef USA
//	printf("area of the circle is %f \n", area(radius));
//#else
//	printf("���� ������ %f�Դϴ�. \n", area(radius));
//#endif
//
//	return 0;
//}