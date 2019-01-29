#Project Euler question 37
#Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

#sieve used 0's and 1's so it would be faster
def getPrimes(bound):
    primes = [1 for x in range(bound+1)]
    p = 2
    while p*p <= bound:
        if primes[p] == 1:
            for y in range(p*p,bound+1,p):
                primes[y] = 0
        p+=1
    return primes

#easier to use when looking up primes
def isPrime(primes,n):
    if(primes[n] == 1):
        return True
    return False

#intially wrote this wrong because I thought the questio asked for the revrse, and this worked up until the last num strangely
def isTrunc(num,primes):
    strNum = str(num)
    for k in range(1,len(strNum)):
        leftToRight = int(strNum[k:])
        rightToLeft = int(strNum[:k])
        if isPrime(primes,leftToRight) == False or isPrime(primes,rightToLeft) == False or leftToRight == 1 or rightToLeft == 1:
            return False
    return True
#just guessed the bound would be 100000; smarter way to do this is with a while loop counting all truncated nums   
def pEQuestion():
    primes = getPrimes(1000000)
    total =0
    for i in range(8,1000000+1):
        if isPrime(primes,i) and isTrunc(i,primes):
            total+= i
    return total

print(pEQuestion())

