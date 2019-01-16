#Project Euler question 24
#What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

#Dynamic programing solution, save pervious inputs then reuseing them
def pEQuestion():
    fibSqeunce = [1,1]
    count = 2
    while len(str(fibSqeunce[-1]))<1000:
        #Fn = Fn-1 + Fn-2
        fibSqeunce.append(fibSqeunce[count-1]+fibSqeunce[count-2])
        count+=1
    return len(fibSqeunce)
print(pEQuestion())

