#Project Euler question 21
#Evaluate the sum of all the amicable numbers under 10000.

#This is very brute force, I felt sick while doing this question
def getDivisors(num):
    divSum =0
    for x in range(1,num):
        if num%x==0:
            divSum += x
    return divSum

def pEQuestion(bound):
    pairSum =0
    for a in range(1,bound+1):
        b = getDivisors(a)
        if a == getDivisors(b) and  a != b:
            pairSum += a + b
        
    return int(pairSum/2)

print(pEQuestion(10000))

