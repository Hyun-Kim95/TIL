#include<stdio.h>
#include<string.h>

#define STU_NUMBER 1
#define REG_NUMBER 2
struct student {
	int type;	// 공용체의 현재 어떤 변수를 사용하는지 저장
	union {
		int stu_number;		// 학번
		char reg_number[15];// 주민등록번호 중에 하나만 선택 가능
	} id;
	char name[20];
};
struct vector {
	float x;
	float y;
};
// 열거형 예제용
enum days {SUN, MON, TUE, WED, THU, FRI, SAT};
char* days_name[] = {
	"sunday","monday","tuesday","wednesday","thursday","friday","saturday"
};
// 구조체 예제 함수
struct vector get_vector_sum(struct vector a, struct vector b) {
	struct vector result;
	result.x = a.x + b.x;
	result.y = a.y + b.y;

	return result;
}
// 공용체 예제 함수
void print(struct student s) {
	switch (s.type)
	{
	case STU_NUMBER:
		printf("학번: %d\n", s.id.stu_number);
		printf("이름: %s\n", s.name);
		break;
	case REG_NUMBER:
		printf("주민등록번호: %d\n", s.id.reg_number);
		printf("이름: %s\n", s.name);
		break;
	default:
		printf("타입오류\n");
		break;
	}
}
int main() {
	printf("구조체 예제\n");
	struct vector a = { 2.0, 3.0 };
	struct vector b = { 4.0, 5.0 };
	struct vector sum;
	
	sum = get_vector_sum(a, b);
	printf("벡터의 합은 (%f, %f)입니다\n", sum.x, sum.y);
	// -------------------------
	printf("\n공용체 예제\n");
	struct student s1, s2;

	s1.type = STU_NUMBER;
	s1.id.stu_number = 20190001;
	strcpy(s1.name, "홍길동");

	s2.type = REG_NUMBER;
	strcpy(s2.id.reg_number, "860101-1056076");
	strcpy(s2.name, "김철수");

	print(s1);
	print(s2);
	// -------------------------
	printf("\n열거형 예제\n");
	enum days d;	// 열거형 변수이므로 MON 부터 SUN 까지의 값들만 가질 수 있음
	d = WED;
	printf("%d번째 요일은 %s입니다\n", d, days_name[d]);
	// 3번째 요일은 wednesday입니다
	return 0;
}