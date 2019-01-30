#Project Euler question 39
#For which value of p ≤ 1000, is the number of solutions maximised?
import math

#brute force takes long time
def pEQuestion(bound):
    count = 0
    largest = [0,0]
    for p in range(bound+1,2,-1):
        count = 0
        for a in range(2,300):
            for b in range(2,300):
                if (a+b+math.sqrt(a**2 + b**2) == p) :
                    count +=1
                    if count>largest[1]:
                        largest[0] = p
                        largest[1] = count
    return largest[0]

print(pEQuestion(1000))

