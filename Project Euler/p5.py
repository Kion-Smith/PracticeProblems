import fractions
#Project Euler question 5
#What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

#gets the solution very slowly (brute force)  
def pEQuestion5():
    isDivisible = False
    num = 2
    while isDivisible is False:
        for i in range(1,21):
            if num%i==0 and i == 20:
               return num 
            num+=1
            print(num)
    return num

#My alt cuts time in half of thee intial solultion       
def alt():
    div =1
    isDivisible = False
    while isDivisible is False:
        for i in range(1,21):
            if (20*div)%i != 0:
                break
            else:
                print(div,i)
        div +=1
    return 20*div

#found this soultion at https://www.geeksforgeeks.org/smallest-number-divisible-first-n-numbers/
#This soultion is very fast
def opt():
    div = 1
    for i in range(1,21):
        div = (div*i)/fractions.gcd(div,i)
    return div

print(opt())
#print(alt())
#print(pEQuestion5())
