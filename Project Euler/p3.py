#Project Euler question 3
#What is the largest prime factor of the number 600851475143 ?
#This is my implementation it is very brute force looking for prime numbers and then checking against my num
def isPrime(myNum):
    if myNum == 2 or myNum == 3:
        return True
    else:
        for i in range(2,myNum):
            if myNum%i == 0:
                return False
    return True

def pEQuestion3(myNum):
    largestFactor =0
    for i in range(2,myNum):
        if isPrime(i):
            if myNum%i == 0 and i>largestFactor:
                largestFactor = i
        i+=1
        
    return largestFactor


myAns=pEQuestion3(600851475143)    
print(myAns)

#I saw a better implementation that first looked for all the facots and put them in a list then checked to see from largest to smallest if that number was prime
