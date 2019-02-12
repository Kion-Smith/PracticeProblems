#Project Euler question 48
#Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
from math import sqrt

#very easy with python; no max number 
def pEQuestion(bound):
    total =0
    for i in range(1,bound+1):
        total += i**i

    #last ten didgits
    return str(total)[-10:]

print(pEQuestion(1000))

