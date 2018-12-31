#Project Euler question 10
#Find the sum of all the primes below two million.


#using sieve, what I implemented in question 7 might not be a sieve
def pEQuestion10(n):
   #set all numbers to true
   primes = [True for i in range(n+1)]
   totalSum = 0
   cur = 2

   #loop through list
   for cur in range(2,n+1):
      if primes[cur] == True:
         totalSum += cur
         #check i^2, i^2+i,.....
         for i in range(cur*cur,n+1,cur):
            primes[i] = False
   return totalSum

print(pEQuestion10(2000000))

