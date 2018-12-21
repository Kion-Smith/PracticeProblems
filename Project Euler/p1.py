#Project Euler question 1
#This is a function that finds the sum of all the multiples of 3 or 5 below 1000.
def pEQuestion1():
    num = 0
    #Intially go this wrong because I thought question bounds were inclusive of 0 and 1000
    for i in range(1,1000):
      if i%3 == 0 or i%5 ==0:
          num = num + i
    return num

print(pEQuestion1())
