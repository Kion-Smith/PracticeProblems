#Project Euler question 33
#If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
from fractions import Fraction

#brute force
def pEQuestion():
    prodNum = 1
    prodDen = 1
    for num in range(10,100):
        for den in range(10,100):
            #checking to make sure is digit cancling fraction
            if den%10 != 0 and(float(num/den) == float(int(num/10)/int(den%10))) and (num%10 == int(den/10)) and num != den:
                prodNum *= num
                prodDen *= den
                
    #get Fraction simplified
    print(Fraction(prodNum,prodDen))
    
print(pEQuestion())



