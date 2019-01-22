#Project Euler question 30
#Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

def isFifthPower(num):
    tempTotal =0
    numList = list(str(num))
    for x in range(len(numList)):
        tempTotal += int(numList[x])**5
    if tempTotal == num:
        return True
    else:
        return False
def pEQuestion():
    total =0
    #Looked up help for the bound only
    for i in range(1000,6*(9**5)):
        if isFifthPower(i):
            total += i
    return total
print(pEQuestion())



