#Project Euler question 12

#brute force very slow
def getFactors(y):
    count =0
    for x in range(1,int(y/2+1)):
        if y%x ==0:
            count+=1
    return count

def pEQuestion(n):
    foundN= False
    i = cur =1
    while not foundN:
        i+=1
        cur = int((i*(i+1))/2)
        if getFactors(cur) == n:
            foundN = True
            break
    return cur

print(pEQuestion(500))

#prime factorization can be done using sieve; might do this later
