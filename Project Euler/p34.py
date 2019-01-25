#Project Euler question 34
#Find the sum of all numbers which are equal to the sum of the factorial of their digits
from math import factorial

def getFact(num):
    total =0
    numList = [int(x) for x in str(num)]
    for j in range(len(numList)):
        total += factorial(numList[j])
        if(total>num):
            break
    if total == num :
        return True
    else:
        return False
    
#had to get help with upper bound which is 7*9!
def pEQuestion():
    factorialSum = 0
    for i in range(3,2540160):
        if getFact(i):
            factorialSum += i    
    return factorialSum

print(pEQuestion())
