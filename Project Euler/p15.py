import math
#Project Euler question 15
#How many such routes are there through a 20×20 grid? (Lattice paths)

#Very Slow (brute force)
def pEQuestion(x,y):

    count =0
    if x ==0 and y ==0:
        return 1
    if x>0:
        count += pEQuestion(x-1,y)
        print (count)
    if y>0:
        count += pEQuestion(x,y-1)
        print (count)
    return count
  
#print(pEQuestion(20,20))

#Need to reuse pieces or find optimal solution
#other than dynamic programing found a factorial solution from help from stack overflow
def opt(grid):
    return math.factorial(grid*2)/(math.factorial(grid)* math.factorial(grid))

print(opt(20))
