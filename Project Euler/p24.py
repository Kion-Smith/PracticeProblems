#Project Euler question 24
#What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
import itertools

#tried solving without libs and was taking to long so I used permutations lib
def pEQuestion():
    myPerms = list(itertools.permutations('0123456789'))
    print(myPerms[1000000-1])
    
print(pEQuestion())

