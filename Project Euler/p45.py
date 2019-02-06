#Project Euler question 44
#Find the next triangle number that is also pentagonal and hexagonal.
from math import sqrt

#I noticed that triangle and hexagonal num sequnce had similar numbers, so I just need to check if num is odd
def calcTrigAndHexNum(n):
    t =  n*(2*n-1)
    return t

def isPentaNum(x):
    n = (sqrt(24*x+1)+1)/6
    if int(n) == n:
        return True
    return False

def pEQuestion(target):
    cur = 143 #starting hex
    num = -1
    while True:
        num = calcTrigAndHexNum(cur)
        
        if isPentaNum(num) and num>target:
            num = calcTrigAndHexNum(cur)
            break

        cur += 1
        
    return num

print(pEQuestion(40755))

