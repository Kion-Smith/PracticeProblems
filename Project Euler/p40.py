#Project Euler question 40
#If dn represents the nth digit of the fractional part, find the value of the following expression.

#Just created a large string then get their index, there is most likely some formula/series but I cant derive it
def pEQuestion():
    numStr = ""
    cur = 1
    while cur<1000000:
        numStr += str(cur)
        cur+=1
    return int(numStr[0])*int(numStr[9])*int(numStr[99])*int(numStr[999])*int(numStr[9999])*int(numStr[99999])*int(numStr[999999])
print(pEQuestion())

