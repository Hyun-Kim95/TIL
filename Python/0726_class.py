# 클래스를 선언
class Student:
    # 클래스 변수
    count = 0
    students = []

    # 클래스 함수
    @classmethod
    def print(cls):
        print("------ 학생목록 -------")
        print("이름\t총점\t평균")
        for student in cls.students:
            print(str(student))
        print("------- ------- -------")

    # 인스턴스 함수
    def __init__(self, name, korean, math, english, science):
        self.name = name
        self.korean = korean
        self.math = math
        self.english = english
        self.science = science

        Student.count += 1
        print("{}번째 학생이 생성되었습니다.".format(Student.count))
        Student.students.append(self)
    
    def get_sum(self):
        return self.korean + self.math + self.english + self.science

    def get_average(self):
        return self.get_sum()/4
    
    def __str__(self):
        return "{}\t{}\t{}".format(\
            self.name,self.get_sum(),self.get_average())
    
    def __eq__(self,value):
        return self.get_sum() == value.get_sum()
    def __ne__(self,value):
        return self.get_sum() != value.get_sum()
    def __gt__(self,value):
        return self.get_sum() > value.get_sum()
    def __ge__(self,value):
        return self.get_sum() >= value.get_sum()
    def __lt__(self,value):
        return self.get_sum() < value.get_sum()
    def __le__(self,value):
        return self.get_sum() <= value.get_sum()

# 학생 리스트를 선언합니다.
students = [
    Student("윤인성",87,98,88,95),
    Student("연화진",92,98,96,98),
    Student("구지연",76,96,94,90),
    Student("나선주",98,92,96,92),
    Student("윤아린",95,98,98,98),
    Student("윤명월",64,88,92,92),
    Student("김미화",82,86,98,88),
    Student("김연화",88,74,78,92),
    Student("박아현",97,92,88,95),
    Student("서준서",45,52,72,78),
]

student_a = Student("윤인성",87,98,88,95)
student_b = Student("윤하진",92,98,96,98)

# 현재 생성된 학생을 모두 출력
Student.print()

print("student_a == student_b = ", student_a == student_b)
print("student_a != student_b = ", student_a != student_b)
print("student_a > student_b = ", student_a > student_b)
print("student_a >= student_b = ", student_a >= student_b)
print("student_a < student_b = ", student_a < student_b)
print("student_a <= student_b = ", student_a <= student_b)
print()
print("현재 생성된 총 학생 수는 {}명입니다.".format(Student.count))