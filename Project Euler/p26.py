#Project Euler question 26
import math

def getLength(num):
    count =0
    r = 10
    while r !=10 or count<1:
        r = (r%num)*10
        count+=1
    return count

def pEQuestion(bound):
    maxNum = [0,0]
    for i in range(2,bound+1):
        if(i%2 != 0 and i%5 != 0 and math.gcd(i,10)==1) and getLength(i)>maxNum[0]:
            maxNum[0] =getLength(i)
            maxNum[1] = i

    return maxNum[-1]

print(pEQuestion(1000))



