#Project Euler question 11
#Find the sum of all the primes below two million.

def readFile():
   f = open("question11Num.txt","r")
   matrix = []
   for i in f.readlines():
      matrix.append( [int(j) for j in i.split(" ")])

   return matrix

#brute fore checking left-right then up-down and finally diagonals
def pEQuestion11():
   grid = readFile()

   maxProduct = 0
   for i in range(20):
      for j in range(20):
         if j < 16:
            #left and right
            temp = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3]
            if temp > maxProduct:
               maxProduct = temp
            #up and down
            temp = grid[j][i]*grid[j+1][i]*grid[j+2][i]*grid[j+3][i]
            if temp > maxProduct:
               maxProduct = temp  
         if i<16 and j<16:
            #diag
            temp = grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3]
            if temp > maxProduct:
               maxProduct = temp
         if i<16 and j>3:
            #diag
            temp = grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3]
            if temp > maxProduct:
               maxProduct = temp
               
   return maxProduct
print(pEQuestion11())

