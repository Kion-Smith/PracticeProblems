#Project Euler question 23
#Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

#Brute force find all abundant nums then checking to see if it 
def isAbundant(num):
    divSum = 0
    for x in range(1,int(num/2)+1):
        if num % x == 0:
            divSum += x
            
    if divSum > num:
        return True
    else:
        return False
    
def pEQuestion():
    abundantNums= []
    abundantSum = [y for y in range(28123)]
    total = 0
    
    for i in range(12,28123):
        if isAbundant(i):
            abundantNums.append(i)
    for j in range(len(abundantNums)):
        for k in range(j,28123):
            if abundantNums[j] + abundantNums[k] < 28123:
                abundantSum[abundantNums[j] + abundantNums[k]] = 0
            else:
                break
    for cur in range(len(abundantSum)):
        total += abundantSum[cur]
        
    return total

print(pEQuestion())

