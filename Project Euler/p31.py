#Project Euler question 30
#How many different ways can £2 be made using any number of coins?

#This solution was gotten through help from https://www.mathblog.dk/project-euler-31-combinations-english-currency-denominations/
def pEQuestion(bound):
    bound+=1
    coinList = [1,2,5,10,20,50,100,200]
    total = [0]*bound
    total[0] = 1
    for i in coinList:
        for j in range(i,bound):
            total[j] += total[j-i]

    return total[-1]

print(pEQuestion(200))



