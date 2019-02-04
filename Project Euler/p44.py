#Project Euler question 44
#Find the pair of pentagonal numbers, Pj and Pk, for which their sum and difference are pentagonal and D = |Pk − Pj| is minimised; what is the value of D?
from math import sqrt

#inverse function to check if it is a penta num
def isPentaNum(x):
    n = (sqrt(24*x+1)+1)/6
    if int(n) == n:
        return True
    return False

def pEQuestion():
    i = 1
    pentaNums = []
    pairFound = False
    while not pairFound:
        pentaNums.append(i*(3*i-1)/2)
        #print(i*(3*i-1)/2 , len(pentaNums))
        for j in range(1,len(pentaNums)-1):
            if( isPentaNum(int(abs(pentaNums[i-1] - pentaNums[j]))) and isPentaNum(pentaNums[i-1] + pentaNums[j]) ):
                #print(pentaNums[i-1],pentaNums[j])
                return(abs(pentaNums[i-1] - pentaNums[j]))
        i+=1
    
print(pEQuestion())

