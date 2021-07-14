import random

print("-----------평탄화-----------")
def flatten(data):
    a = []
    for i in data:
        if type(i) == list:
            a += flatten(i)
            print(a)
        else:
            a.append(i)
    return a
    
example = [[1,2,3],[4,[5,6]],7,[8,9]]
print("원본:",example)
print("변환:",flatten(example))

print("-----------람다-------------")
power = lambda x: x*x
under_3 = lambda x: x<3

list_input_a = [1,2,3,4,5]

output_a = map(power, list_input_a)
print("#map()함수의 실행결과")
print("map(power,list_input_a):",output_a)
print("map(power,list_input_a):",list(output_a))
print()

output_b = filter(under_3, list_input_a)
print("#filter()함수의 실행결과")
print("filter(under_3,output_b):", output_b)
print("filter(under_3,output_b):", list(output_b))

print("-----파일처리------------")
hanguls = list("가나다라마바사아자차카타파하")
with open("info.txt","w") as file:
    for i in range(1000):
        name = random.choice(hanguls) + random.choice(hanguls)
        weight = random.randrange(40,100)
        height = random.randrange(140,200)
        file.write("{}, {}, {}\n".format(name, weight, height))

with open("info.txt","r") as file:
    for line in file:
        (name, weight, height) = line.strip().split(", ")

        if(not name) or (not weight) or (not height):
            continue

        bmi = int(weight)/(int(height)*int(height))*10000
        result = ""
        if 25 <= bmi:
            result = "과체중"
        elif 18.5<= bmi:
            result = "정상 체중"
        else:
            result = "저체중"
        
        print('\n'.join([
            "이름: {}",
            "몸무게: {}",
            "키: {}",
            "BMI: {}",
            "결과: {}"
        ]).format(name,weight,height,bmi,result))
        print()
