#Project Euler question 36
#Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

#reverse number
def isPalindrome(num):
    tempList = [int(x) for x in str(num)]
    tempList.reverse()
    reverseNum = "".join(str(y) for y in tempList)
    if int(reverseNum) == num:
        return True
    else:
        return False
#get base 
def baseToBin(num):
    tempBin = str(bin(num))
    tempBin = tempBin[2:]
    return int(tempBin)

def pEQuestion(bound):
    total = 0
    for i in range(bound+1):
        if isPalindrome(i) and isPalindrome(baseToBin(i)):
            total += i
    return total

print(pEQuestion(1000000))


