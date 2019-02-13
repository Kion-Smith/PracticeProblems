#Project Euler question 49
#What 12-digit number do you form by concatenating the three terms in this sequence?
from itertools import permutations
#doesnt work
def getPrimes(bound):
    primes = [1]*(bound+1)
    p = 2
    while p*p <= bound:
        if primes[p] == 1:
            for y in range(p*p,bound+1,p):
                primes[y] = 0
        p+=1
    return primes
        
def isPrime(primes, num):
    if primes[num] == 1:
        return True
    return False

def getPermPrimes(primes,num):
    allPermList = permutations(str(num))
    permsList = []
    for z in list(allPermList):
        if  isPrime(primes,int(''.join(z))):
            permsList.append(int(''.join(z)))

    if len(permsList) >= 3:
        return permsList
    else:
        return -1

def permsRelation(permList):
    if permList == -1:
        return -1
    
    temp = []
    for i in range(len(permList)):
        for j in range(i,len(permList)):
            if permList[i] - permList[j] not in temp:
                temp.append(permList[i] - permList[j])
            else:
                return permList[i] - permList[j]
    return -1

def pEQuestion():
    numProp = []
    primes = getPrimes(100000)
    for i in range(1000,100001):
        if isPrime(primes,i) and permsRelation(getPermPrimes(primes,i)) > 0:
            offset = permsRelation(getPermPrimes(primes,i))
            if isPrime(primes,primes[i+offset]) and isPrime(primes,primes[i+offset*2]):
                 

    return 0
    
print(pEQuestion())

