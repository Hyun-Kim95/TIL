PI = 3.141592

def number_input():
    output = input("숫자입력>")
    return float(output)

def get_circumference(radius):
    return 2 * PI * radius

def get_circle_area(radius):
    return PI * radius * radius

if __name__ == "__main__":
    print("활용 예")
    print("get_circumference(10):",get_circumference(10))
    print("get_circle_area(10):",get_circle_area(10))

print("모듈의 __name__ 출력하기")
print(__name__)
print()