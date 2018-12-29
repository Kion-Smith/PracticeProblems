#Project Euler question 8
#Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?

#brute force, tried to optmize with break statement
def readFile():
    numList = []
    f = open("question8Num.txt","r")
    while True:
        cur = f.read(1)
        if not cur:
            break
        numList.append(cur)
        
    return numList
    
def pEQuestion8():
    nums = readFile()

    temp =1
    maxProduct =0
    for i in range(len(nums)-12):
        for j in range(i,i+13):
            if nums[j] == 0 or nums[i] == 0:
                break
            else:
                temp = temp * int(nums[j])
            
            if temp>maxProduct:
                maxProduct = temp
        
        temp =1

    return maxProduct

print(pEQuestion8())
