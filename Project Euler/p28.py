#Project Euler question 28
#What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

#Initial tired to brute force this, but figure that there had to be a sequnce
#for the diagonals, I couldnt come up with the formula on my own but I found
#several blogs detailing the sequnce, this being the best https://www.xarg.org/puzzle/project-euler/problem-28/

def pEQuestion(num):
    num = (num-1)/2
    return (16*(num**3)+26*num)/3 + 10*(num**2)+1
    #This is the formula simplified
    #return 2 * num * (8 * num * num + 15 * num + 13) / 3 + 1;
print(pEQuestion(1001))



