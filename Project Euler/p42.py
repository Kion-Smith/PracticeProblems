#Project Euler question 42
#How many are triangle words?
from math import sqrt
def readFile(file):
    f = open(file,'r')
    tempList = f.read().split(',')
    for x in range(len(tempList)):
        tempList[x] = str(tempList[x]).replace('"','')

    return tempList

def getAlpha(word):
    #not need for this file but converted items to upper for future use
    tempWord = list(word.upper())
    wordSum = 0
    for y in range(len(tempWord)):
        #sum the word values
        wordSum += (ord(tempWord[y]) - 64)
    return wordSum

def isTrigNum(num):
    # inverse function
    n = (sqrt(1+8*num)-1)/2
    #check to make sure that ans is not a decimal
    if n == int(n):
        return True
    return False

def pEQuestion(file):
    count =0
    wordList = readFile(file)
    for i in range(len(wordList)):
        if isTrigNum(getAlpha(wordList[i])):
            count +=1
    return count
print(pEQuestion("q42.txt"))
