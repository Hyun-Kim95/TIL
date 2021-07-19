import test_module as test

radius = test.number_input()
print(test.get_circumference(radius))
print(test.get_circle_area(radius))

print("# 메인의 __name__ 출력하기")
print(__name__)
print()

print("# 페키지 내부의 모듈을 모두 읽어 들입니다.")
from test_package import *

print(module_a.variable_a)
print(module_b.variable_b)