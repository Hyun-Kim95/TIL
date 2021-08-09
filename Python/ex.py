def solution(s):
    answer = -1
    list_s = []
    for i in s:
        if len(list_s) != 0 and list_s[-1] == i:
            list_s.pop()
        else:
            list_s.append(i)
    if len(list_s) != 0:
        answer = 0
    else:
        answer = 1

    return answer

print(solution('abbaabb'))