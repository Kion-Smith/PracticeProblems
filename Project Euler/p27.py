#Project Euler question 27
#Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n=0.
import math
def isPrime(num):
    if num == 2:
        return True
    elif num%2 == 0 or num<2:
        return False
    else:
        for x in range(3,int(math.sqrt(num)),2):
            if num % x == 0:
                return False
    return True

def getN(numA, numB):
    i = 0
    while isPrime((i*i) +(numA*i)+ numB):
        i+=1 
    return i

def pEQuestion():
    maxPrimes = 0
    product = 0
    for a in range(-1000,1000):
        for b in range(-1000,1000+1):
            n = getN(a,b)
            if n>maxPrimes:
                maxPrimes = n
                product= a*b
    return product

print(pEQuestion())



