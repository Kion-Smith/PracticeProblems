#Project Euler question 13
#Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.

#brute force because python has no max number
def pEQuestion():
    f = open("q13.txt","r")
    numArray = f.readlines()
    numArray =[l.strip('\n') for l in numArray]

    mySum =0
    for i in range(len(numArray)):
        mySum += int(numArray[i])
        
    #get first ten digits
    return ( int(str(mySum)[:10]))

print(pEQuestion())


