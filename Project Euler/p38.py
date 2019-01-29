#Project Euler question 38
#What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?

#modfied from question 32;checks to see if num is 1-9 pandigital 
def isPandigital(x,y):
    combString = str(x)+str(y)
    if len(combString)>9:
        return False
    for z in range(1,10):
        if str(z) not in list(combString) or list(combString).count(str(z))>1:
            return False
    return True
# we want largest num to create pandigital, so 4+5 = 9
# we can get this from some 4 digit num xxxx and then add to xxxx*2 (Which is are 5 digit num) equaling a nine digit num
def pEQuestion():
    largest = 0
    for i in range(10000,9000,-1):
        if isPandigital(i,i*2):
            largest = str(i) + str(i*2)
            print(i,i*2)
            break
    return largest
print(pEQuestion())

