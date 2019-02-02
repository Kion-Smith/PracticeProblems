#Project Euler question 41
#What is the largest n-digit pandigital prime that exists?

def getPrimes(bound):
    primes = [True for x in range(bound+1)]
    p = 2
    while(p*p <= bound):
        if(primes[p] == True):
            for y in range(p*p, bound+1,p):
                primes[y] = False
        p+=1
    return primes

def isPan(num):
    numStr = str(num)
    if len(numStr) > 9 or len(numStr) < int(max(list(numStr))):
        return False
    for x in range(1,len(numStr)):
        if list(numStr).count(str(x))>1 or list(numStr).count(str(x)) <= 0:
            return False
    return True

def pEQuestion():
    primes = getPrimes(10000000) #going higeher than this made python compilers crash
    for i in range(len(primes)-1,2,-1):
        if isPan(i) and primes[i]:
            return i
    return -1

print(pEQuestion())


