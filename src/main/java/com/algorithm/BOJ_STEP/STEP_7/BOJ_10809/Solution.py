# https://www.acmicpc.net/problem/10809
import sys

# input_value = sys.stdin.readline()
input_value = sys.stdin.readline()
print (input_value)

result = []
for i in range(0,24):
    result.append(-1)

std=97
def get_str_value(str):
    return ord(str)-std

for i in range(0, len(input_value)):
    if (result[get_str_value(input_value[i])] == -1):
        result[get_str_value(input_value[i])] = i

for i in result:
    print(i, end= ' ')
