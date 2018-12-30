#Project Euler question 9

#There exists exactly one Pythagorean triplet for which a + b + c = 1000.
#Find the product abc.


#brute force
def pEQuestion9():
   for a in range(1,1000):
       for b in range(a,1000 - a):
         c = 1000 - a - b
         if a*a + b*b == c*c:
            return a*b*c
   
print(pEQuestion9())


#I tried implementing a solution with find the tripplet
#tripplets can be found with when
#m>n ,so a = m*m - n*n , b = 2(m*n), c = m*m + n*n
#I was having trouble generateing n and ms but figure Id just loop until 1000

def mnTriplet():
    for m in range(1,1000):
        for n in range(1,m):
            a = m*m - n*n 
            b = 2*(m*n)
            c = m*m + n*n

            if a+b+c == 1000:
                return a*b*c
            
print(mnTriplet())
