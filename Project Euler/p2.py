#Project Euler question 2
#By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
#This is following the dynamic programing aproch I learned in java found at ::https://github.com/Kion-Smith/Small-Java-projects/blob/master/Testing%20Dynamic%20programing/FibonacciRunTime.java
def pEQuestion2():
    cur = 0;
    i=2
    fib = [1,1] #Frist few fib elements,does not need zero because it will have no impact
    sumFib =0;
    while cur < 4000000:
        cur = fib[i-1]+fib[i-2]
        fib.append(cur)
        #When first sumbiting my solution I forgot that the numbers needed to be even
        if fib[i]%2 ==0:
            sumFib+=fib[i]
        i+=1
    return sumFib

print(pEQuestion2())
