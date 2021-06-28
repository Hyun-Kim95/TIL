# 시간 관련
import datetime

now = datetime.datetime.now()

print("{}년{}월{}일{}시{}분{}초".format(now.year, now.month, now.day, now.hour, now.minute, now.second))

if now.hour <12:
    print("현재 시각은 {}시로 오전입니다!".format(now.hour))

if now.hour >=12:
    print("현재 시각은 {}시로 오후입니다!".format(now.hour))

# format 함수
output_a = "{:+5d}".format(52)  # 기호를 뒤로 밀기
output_b = "{:+5d}".format(-52)
output_c = "{:=+5d}".format(52) # 기호를 앞으로 밀기
output_d = "{:=+5d}".format(-52)
output_e = "{:+05d}".format(52) # 0 으로 채우기
output_f = "{:+05d}".format(-52)

output_g = "{:f}".format(52.273)
output_h = "{:15f}".format(52.273)      # 15칸 만들기
output_i = "{:+15f}".format(52.273)     # 15칸에 부호 추가
output_j = "{:+015f}".format(52.273)    # 15칸에 부호 추가하고 0으로 채우기
output_k = "{:15.3f}".format(52.273)    # 소수점 자릿수 지정하기
output_l = "{:15.2f}".format(52.273)
output_m = "{:15.1f}".format(52.273)

output_o = 52.0
output_p = "{:g}".format(output_o)  # 의미 없는 소수점 제거

print("# format 함수")
print(output_a)
print(output_b)
print(output_c)
print(output_d)
print(output_e)
print(output_f)

print(output_g)
print(output_h)
print(output_i)
print(output_j)
print(output_k)
print(output_l)
print(output_m)

print(output_o)
print(output_p)

# 문제
list_of_list = [
    [1, 2, 3],
    [4, 5, 6, 7],
    [8, 9]
]
for i in list_of_list:
    for j in i:
        print(j)

# 문제
numbers = [1,2,3,4,5,6,7,8,9]
output = [[],[],[]]

for number in numbers:
    output[number%3-1].append(number)

print(output)