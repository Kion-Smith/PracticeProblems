#Project Euler question 50
#Which prime, below one-million, can be written as the sum of the most consecutive primes?
from itertools import permutations
#works now

def getPrimes(bound):
    primes = []
    temp = [1]*(bound+1)
    p = 2
    while p*p <= bound:
        if temp[p] == 1:
            for y in range(p*p,bound+1,p):
                temp[y] = 0
        p+=1

    for z in range(2,len(temp)):
       if temp[z]:
           primes.append(z)
    return primes
        


def pEQuestion(bound):
    primes = getPrimes(bound)
    i=0
    while primes[i]<1000000:
        print(primes[i])
        i+=1
        
print(getPrimes(1000000)[-1])
