#Project Euler question 46
#What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
from math import sqrt
def getPrimes(bound):
    primes=[]
    numList = [1 for x in range(bound+1)]
    p=2;
    while p*p <= bound:
        if numList[p] == 1:
            for y in range(p*p,bound+1,p):
                numList[y] = 0
        p+=1

    for z in range(3,len(numList)):
        if numList[z] == 1:
            primes.append(z)
    return primes
  
def pEQuestion():
    primes = getPrimes(10000)
    count = 1
    comp = []
    hasNum = False
    temp =0
    while True:
        count+=2
        for x in range(10000):
            #if not a valid ans will be negative
            temp = count - 2 * x ** 2
            if temp in primes:
                hasNum = True
                break
        if hasNum and temp<0:
            break
    return count
    
print(pEQuestion())

