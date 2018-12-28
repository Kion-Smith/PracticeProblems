#Project Euler question 7
#What is the 10 001st prime number?

#using the prime sieve alg that I leanerd previously
def pEQuestion7():
    primes = [2]
    cur = 3
    
    #while my list of primes is less than target
    while len(primes) < 10001:
        isPrime = True
        #check prime list against current number
        for i in primes:
            
            #if current is factor of prime then its not prime
            if cur%i == 0:
                isPrime = False
                break
            
        #if current is prime add it to the list
        if isPrime == True:
            primes.append(cur)
            
        #No need to check even numbers so increment 2        
        cur+=2
        
        #return last element in the list
    return primes[-1]
   
print(pEQuestion7())
