# import datetime
# now = datetime.datetime.now()

# print("# datetime.timedelta로 시간 더하기")
# after = now + datetime.timedelta(\
#     weeks=1,days = 1,hours = 1,minutes = 1,seconds = 1)
# print(after.strftime("%Y{} %m{} %d{} %H{} %M{} %S{}").format(*"년월일시분초"))
# print()

# print("# now.replace()로 1년 더하기")
# output = now.replace(year=(now.year + 1))
# print(output.strftime("%Y{} %m{} %d{} %H{} %M{} %S{}").format(*"년월일시분초"))

# # --------------------------------------

# from urllib import request

# target = request.urlopen("https://google.com")
# output = target.read()

# print(output)

# # ------------------------------------

# from urllib import request
# from bs4 import BeautifulSoup

# target = request.urlopen("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108")

# soup = BeautifulSoup(target,"html.parser")

# for location in soup.select("location"):
#     print("도시:", location.select_one("city").string)
#     print("날씨:", location.select_one("wf").string)
#     print("최저기온:", location.select_one("tmn").string)
#     print("최고기온:", location.select_one("tmx").string)
#     print()

# ---------------------------------

# from flask import Flask
# app = Flask(__name__)

# @app.route("/")
# def hello():
#     return "<h1>Hello World!</h1>"

# --------------------------------

from flask import Flask
from urllib import request
from bs4 import BeautifulSoup

app = Flask(__name__)
@app.route("/")

def hello():
    target = request.urlopen("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=018")

    soup = BeautifulSoup(target,"html.parser")

    output = ""
    for location in soup.select("location"):
        output += "<h3>{}</h3>".format(location.select_one("city").string)
        output += "날씨: {}<br/>".format(location.select_one("wf").string)
        output += "최저/최고 기온: {} / {}"\
            .format(\
                location.select_one("tmn").string,\
                location.select_one("tmx").string\
            )
        output += "<hr/>"
    return output

# --------------------------------
# 데코레이터
def test(function):
    def wrapper():
        print("인사가 시작되었습니다.")
        function()
        print("인사가 종료되었습니다.")
    return wrapper

@test
def hello():
    print("hello")

hello()
# 인사가 시작되었습니다.
# hello
# 인사가 종료되었습니다.

# ------------------------
print("# 바이너리 데이터")
from urllib import request

target = request.urlopen("http://hanbit.co.kr/images/common/logo_hanbit.png")
output = target.read()
print(output)

file = open("output.png","wb")
file.write(output)
file.close()

# pip list: 설치된 모듈 목록
# pip show 모듈이름: 모듈 정보