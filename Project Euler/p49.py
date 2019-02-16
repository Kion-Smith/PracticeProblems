#Project Euler question 49
#What 12-digit number do you form by concatenating the three terms in this sequence?
from itertools import permutations
#works now

def getPrimes(low,high):
    primes = []
    temp = [1]*(high+1)
    p = 2
    while p*p <= high:
        if temp[p] == 1:
            for y in range(p*p,high+1,p):
                temp[y] = 0
        p+=1

    for z in range(low,len(temp)):
       if temp[z]:
           primes.append(z)
    return primes
        
def getPermPrimes(num,primes):
    allPermList = permutations(str(num))
    permsList = []
    for z in list(allPermList):
        if int(''.join(z))in primes and len(str(''.join(z)))>=4 :
            permsList.append(int(''.join(z)))
    return permsList


def permRelation(permList):
    for i in range(len(permList)):
        for j in range(i,len(permList)):
            if permList[i] != permList[j]:
                dif = permList[j] - permList[i]
                if permList[j]+dif in permList:
                    return [permList[i],permList[j],permList[j]+dif]
    return -1

def pEQuestion():
    primes = getPrimes(1000,100000)
    for i in range(len(primes)):
        permList = getPermPrimes(primes[i],primes)
        if len(permList)>= 3 and permRelation(permList) != -1 and 1487 not in permList:
            return permRelation(permList)     
    return 0
    
print(pEQuestion())
