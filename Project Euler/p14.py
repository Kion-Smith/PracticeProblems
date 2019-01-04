#Project Euler question 14
#Which starting number, under one million, produces the longest chain? (Collatz sequence)

#brute force (slow)
def sequenceLength(num):
    count = 0
    while num > 1:
        if num%2 == 0:
            num = num/2
        else:
            num = 3*num +1
        count+=1
    return count+1
    
def pEQuestion():
    maxCount = 0
    maxNum = 0
    for i in range(1,1000000):
        count = sequenceLength(i)
        print(i,count)
        if count> maxCount:
            maxCount = count
            maxNum = i
    return maxNum
print(pEQuestion())

#read that using a psuedo cache to hold know collatz sequences to be used later
