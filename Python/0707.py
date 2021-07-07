# 딕셔너리를 선언합니다.
from typing import Counter


dictionary = {
    "name": "7D 건조 망고",
    "type": "당절임",
    "ingredient":["망고", "설탕", "메타중아황산나트륨", "치자황색소"],
    "origin": "필리핀"
}

# 사용자로부터 입력을 받습니다.
key = input("> 접근하고자 하는 키(type): ")

# 출력합니다.
if key in dictionary:
    print(dictionary[key])
else:
    print("키값이 없습니다")

dictionary["name"] = "구름" # 키 값이 이미 있으면 내용변경
dictionary["ha"] = "하" # 키 값이 없으면 추가
del dictionary["origin"]    # 키 값으로 삭제
print(dictionary)

print("------------문제------------")
numbers = [1,2,6,8,4,3,2,1,9,5,4,9,7,2,1,3,4,5,8,9,7,2,3]
counter = {}
for number in numbers:
    if number not in counter:
        counter[number] = 1
    else:
        counter[number] += 1
print(counter)

print("------------문제------------")
pets = [
    {"name":"구름", "age":5},
    {"name":"초코", "age":3},
    {"name":"아지", "age":1},
    {"name":"호랑이", "age":1}
]
print("# 우리동네 애완 동물들")
for pet in pets:
    print("{} {}살".format(pet["name"],pet["age"]))

print("------------문제------------")
key_list = ["name", "hp", "mp", "level"]
value_list = ["기사", 200, 30, 5]
character = {}
for i in range(4):
    character[key_list[i]] = value_list[i]
print(character)

print("------------문제------------")
limit = 10000
i = 1
sum_value = 0
while(sum_value<limit):
    sum_value+=i
    i+=1
print("{}를 더할 때 {}을 넘으면 그때의 값은 {}입니다.".format(i,limit,sum_value))

