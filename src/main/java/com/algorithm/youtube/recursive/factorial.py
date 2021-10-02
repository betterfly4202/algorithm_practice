
def fac(n):
    if n <= 1:
        return 1

    return n * fac(n - 1)

# A를 B로 나눈 나머지(A>B)를 R 이라고 하면
# >> A/B의 최대공약수와 B/R의 최대 공약수는 같다 <<
def gcd(a, b):
    if a%b == 0:
        return b

    return gcd(b, a%b)


if __name__ == '__main__':
    # print(fac(10))
    print(gcd(192, 162))
