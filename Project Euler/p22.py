#Project Euler question 22
#What is the total of all the name scores in the file?

#Brute force
def readFile(file):
    f = open(file,"r")
    tempList = f.read().split(",")
    for x in range(len(tempList)):
        tempList[x] = str(tempList[x]).replace('"','')

    return tempList

def getAlpha(name):
    temp = list(name)
    num = 0
    for j in range(len(temp)):
        num+= (ord(temp[j]) - 64)
    return num

def pEQuestion(file):
    nameList = readFile(file)
    nameList = (sorted(nameList))

    total = 0
    for i in range(len(nameList)):
        total += (i+1) * getAlpha(nameList[i])
    return total

print(pEQuestion("q22.txt"))

