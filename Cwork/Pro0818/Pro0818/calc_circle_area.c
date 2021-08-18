//#include<stdio.h>
//
//#define USA
//#define DEBUG
//
//#ifndef PI			// 단순 매크로 PI가 정의되지 않았으면 정의한다.
//#define PI 3.141592
//#endif
//
//#ifndef SQUARE		// 함수 매크로 PI가 정의되지 않았으면 정의한다.
//#define SQUARE(r) (r)*(r)
//#endif
//
//area(double radius)
//{
//	double result = 0.0;
//#ifdef DEBUG		// DEBUG가 정의되어 있으면 디버깅 정보를 출력한다.
//#ifdef USA
//	printf("area(%lf) is called \n", radius);
//#else
//	printf("area(%lf)가 호출되었음 \n", radius);
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
//#ifdef USA			// USA가 정의되어 있으면 모든 메시지를 영어로 출력한다.
//	printf("Please enter radius of a circle(inch) : ");
//#else
//	printf("원의 반지름을 입력하시오: ");
//#endif
//
//	scanf("%lf", &radius);
//#ifdef USA
//	printf("area of the circle is %f \n", area(radius));
//#else
//	printf("원의 면적은 %f입니다. \n", area(radius));
//#endif
//
//	return 0;
//}