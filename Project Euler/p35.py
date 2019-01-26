#Project Euler question 35
#How many circular primes are there below one million?

#sieve
def getPrimes(bound):
    primes = [True for x in range(bound+1)]
    p = 2
    while(p*p <= bound):
        if(primes[p] == True):
            for y in range(p*p, bound+1,p):
                primes[y] = False
        p+=1
    return primes

def getShiftList(num,primes):
    for x in range(len(num)):
        if not primes[int(num[x:len(num)]+ num[0:x])]:
            return False
    return True

def pEQuestion(bound):
    count = 0
    primes = getPrimes(bound)
    for i in range(2,bound+1):
        if primes[i] and getShiftList(str(i),primes):
            count +=1
            
    return count
print(pEQuestion(1000000))

