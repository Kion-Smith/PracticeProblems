#Project Euler question 20
#Find the sum of the digits in the number 100!

#easy with python, No max number sizes and easy conversions
def pEQuestion(fact):
    cur =1
    for i in range(fact,0,-1):
        cur *= i
    numList = [int(j) for j in str(cur)]
    mySum = 0
    for x in range(len(numList)):
        mySum+= numList[x]
        
    return mySum   
print(pEQuestion(100))

