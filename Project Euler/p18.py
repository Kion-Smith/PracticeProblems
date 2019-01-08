#Project Euler question 18
#Find the maximum total from top to bottom of the triangle below:

#Non-brute force, sum from the bottom and check with adj if to determine tri[x][y] of next row
def readFile():
    f = open("q18.txt","r")
    triMatrix = []
    for i in f.readlines():
        triMatrix.append( [int(j) for j in i.split(" ")])
            
    return triMatrix

def pEQuestion():
    tri = readFile()
    
    for x in range( len(tri)-2, -1 ,-1 ):
        for y in range(x+1):
            if tri[x+1][y] > tri[x+1][y+1]:
                tri[x][y] += tri[x+1][y]
            else:
                tri[x][y] += tri[x+1][y+1]

    return tri[0][0]
    
print(pEQuestion())

