#Project Euler question 4
#Find the largest palindrome made from the product of two 3-digit numbers.

#brute force aproch
def isPalindrom(num):
    numStr = str(num)
    #Cant just reverse a string becasue it becomes a list
    if numStr == ''.join(reversed(numStr)):
        return True
    else:
        return False
    
def pEQuestion4():
    largestPal =0
    for i in range(999,1,-1):
        #used I to try and cut down on duplicates
        for j in range(i,1,-1):
            if isPalindrom(i*j) and i*j>largestPal:
                largestPal = i*j
                
    return largestPal

print(pEQuestion4())
