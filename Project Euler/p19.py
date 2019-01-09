#Project Euler question 19
#How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
import datetime

#orginally tired to implement with my own alg, and then later with gaussian day, but found it easier to use python libs
def pEQuestion(low,high):
    count = 0;
    for i in range(low,high+1): #years
        for j in range(1,12+1): #Months
            if datetime.date(i,j,1).weekday() == 6:
                count +=1
    return count
print(pEQuestion(1901,2000))

