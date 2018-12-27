#Project Euler question 6
#Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
#Simple brute force 
def pEQuestion6(n):
    mySum = 0
    mySqr = 0
    for i in range(1,n+1):
        mySum = (i*i) + mySum
        mySqr += i
        
    return (mySqr*mySqr) - mySum

print(pEQuestion6(100))
