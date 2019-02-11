#Project Euler question 47
#What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
from math import sqrt

#getting prime factorization
def getPrimeFactors(n):
    countList = []
    while n % 2 ==0:
        if 2 not in countList:
            countList.append(2)
        n = n / 2
    for i in range(3,int(sqrt(n))+1,2): 
        while n % i== 0:
            if i not in countList:
                countList.append(i)
            n = n / i
    if n>2:
        if n not in countList:
            countList.append(n)
    return len(countList)
  
def pEQuestion():
    consecList = [2]
    i =2
    while len(consecList)<4:
        if getPrimeFactors(i) == 4 and consecList[-1]+1 == i:
            consecList.append(i)
        elif  getPrimeFactors(i) == 4 and consecList[-1]+1 != i:
            consecList.clear()
            consecList.append(i)
        i+=1
    print(consecList[0])    
    
print(pEQuestion())

