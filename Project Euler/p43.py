#Project Euler question 43
#Find the sum of all 0 to 9 pandigital numbers with this property.
from itertools import permutations
def getPrimes(bound):
    primes = [True for x in range(bound+1)]
    primeList = []
    p = 2
    while p*p <= bound:
        if primes[p] == True:
            for y in range(p*p,bound+1,p):
                primes[y] = False
        p+=1

    for z in range(2,len(primes)):
       if primes[z]:
           primeList.append(z)
           
    return primeList

def hasDivProperty(num,primes):
    numStr = str(num)
    if len(numStr) == 10:
        for x in range(1,len(numStr)):
            if x < 8:
                temp = numStr[x]+ numStr[x+1]+numStr[x+2]
                if int(temp)%primes[x-1] != 0:
                    return False
    return True


def pEQuestion():
    primes = getPrimes(70)
    count =0
    for i in permutations(range(0,10)):
        num = ''.join([str(j) for j in list(i)])
        if hasDivProperty(int(num),primes) and len(str(int(num)))==10:
            count += int(num)
    return count
print(pEQuestion())

