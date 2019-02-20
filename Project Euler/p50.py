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
        

#solution   not mine, slightly adapted to be faster, found at https://radiusofcircle.blogspot.com/2016/06/problem-50-project-euler-solution-with-python.html
def pEQuestion(bound):
    primes = getPrimes(bound)
    tempMax = [0,0]
    innerBound = len(primes)
    for i in range(len(primes)):
        for j in range(i+tempMax[0],innerBound):
            cur = sum(primes[i:j])
            if cur<bound:
                if cur in primes:
                    tempMax[0] = j-i
                    tempMax[1] = cur
            else:
                innerBound = j+1
                break
            
    print(tempMax[1])
                
print(pEQuestion(1000000))
