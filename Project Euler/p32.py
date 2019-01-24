#Project Euler question 32
#Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

#could have done this using itertoools permutations and getting all the permutations

#check the pamaters for being a pandigit
def isPandigital(d1,d2):
    prod = d1*d2
    combString = str(d1)+str(d2)+str(prod)
    if len(combString) > 9:
        return False
    for x in range(1,10):
        if str(x) not in list(combString) or list(combString).count(str(x))>1:
            return False
    return True
    
def pEQuestion():
    listOfPans = []
    for i in range(1,100): # 1- 99
        for j in range(i,10000): #100 - 10000
            if isPandigital(i,j) and i*j not in listOfPans:
                listOfPans.append(i*j)
    return sum(listOfPans)

print(pEQuestion())



