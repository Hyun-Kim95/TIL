# 하나만 출력합니다.
print("# 하나만 출력합니다.")
print("Hello Python Programming...!")
print()

# 여러 개를 출력합니다.
print("# 여러개를 출력합니다.")
print(10, 20, 30, 40, 50)
print("안녕하세요", "저의", "이름은", "윤인성입니다!")
print()

# 아무것도 입력하지 않으면 단순하게 줄바꿈합니다.
print("# 아무것도 출력하지 않습니다.(줄바꿈 됨)")
print("---확인 전용선---")
print()
print("---확인 전용선---")

# 타입 확인
print("\n타입확인")
print(type("12345"))
print(type(12345))
print(type(12.3456))

# 역슬래시
print("\n역슬래시")
print("\\ \\ \\ \\")
print("안녕하세요\n안녕하세요")
print("안녕\t안녕")

# 줄바꿈 (""" 이걸 앞뒤로 붙히면 자동으로 줄바꿈 됨)
# """\
# 내용\
# """ 이렇게 사용하면 위아래 자동으로 생기는 줄바꿈이 없어짐
print("\n줄바꿈")
print("""\
동해물과 백두산이 마르고 닳도록
하느님이 보우하사 우리나라 만세\
""")

# 문자열 연산자
print("\n문자열 연산자")
print("안녕하세요"+"1")     # 안녕하세요1
print("안녕하세요"*3)       # 안녕하세요안녕하세요안녕하세요
print(3*"안녕하세요")       # 위와 같음
print("안녕하세요"[4])      # 0부터 시작(요) - 인덱싱
print("안녕하세요"[-1])     # 뒤에부터 셀때는 -1,-2...(요)
print("안녕하세요"[1:4])    # 마지막 숫자를 포함하지 않음(녕하세) - 슬라이싱
print("안녕하세요"[:3])     # 숫자를 생략하면 끝(처음)까지임(안녕하)
# print("안녕하세요"[10])     # 오류발생

# 문자열의 길이
print("\n문자열의 길이")
print(len("안녕하세요"))    # 5

# 숫자 연산자
print("\n숫자 연산자")
print("3+2=", 3+2)
print("3*2=", 3*2)
print("3-2=", 3-2)
print("3/2=", 3/2)
print("3%2=", 3%2)
print("3//2=", 3//2)
print("3**2=", 3**2)
print("3462를 17로 나우었을 때의")
print("- 몫:", 3462//17)
print("- 나머지:", 3462%17)

# 변수
print("\n변수")
pi = 3.14159265
print("pi*2=",pi*2)
print("pi/2=",pi/2)
print("pi%2=",pi%2)

print("\n원의 둘레와 넓이")
r = 10
print("원주율=", pi)
print("반지름=", r)
print("원의 둘레=", 2*pi*r)
print("원의 넓이=", pi*r*r)

# 복합 대입 연산자
print("\n복합 대입 연산자")
number = 100
number += 10
number += 20
number += 30
print("number:", number)
string = "안녕하세요"
string += "!"
string += "!"
print("string:", string)

# 사용자 입력: input()
print("\n사용자 입력: input()")
string1 = input("인사말을 입력하세요>")
print(string1)
