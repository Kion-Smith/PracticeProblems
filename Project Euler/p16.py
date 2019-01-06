#Project Euler question 16
#What is the sum of the digits of the number 2^(1000)?

def pEQuestion(n):
    myProd = 1
    mySum = 0
    
    for i in range(n):
       myProd *= 2

    numArray = list(str(myProd))
    for j in range(len(numArray)):
        mySum += int(numArray[j])
        
    return mySum

print(pEQuestion(1000))

