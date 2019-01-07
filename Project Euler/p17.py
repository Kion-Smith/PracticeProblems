#Project Euler question 17
#If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
specialList = ["One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","sixteen","seventeen","eighteen","nineteen"]
tensList = ["Twenty","Thirty","Forty","Fifty","sixty","seventy","eighty","ninety"]
otherPlaces = ["Hundred","Thousand"]

#worsk as inteded;did not sumbit answer rules are to vague I dont know if fourty should be spelt forty and if 990 should be nine hundred and nintey or nine hundred nintey
def twoDigits(ones,tens):
    if ones != 0:
        return tensList[tens-2]+" "+specialList[ones-1]
    else:
        return(tensList[tens-2])
    
def pEQuestion(n):
    count =0
    for i in range(1,n+1):
        temp = list(str(i))
        if i < 20:
            count += len(specialList[i-1])
        else:
            if len(temp) == 2:
                count += len(twoDigits(int(temp[1]),int(temp[0])))
            elif len(temp) == 3:
                if temp[1] == "0" and temp[2] == "0":
                    count += len(specialList[int(temp[0])-1]+otherPlaces[0])
                else:
                    count += len(specialList[int(temp[0])-1]+""+otherPlaces[0]+"and"+twoDigits(int(temp[2]),int(temp[1])))
            elif len(temp) == 4:
                count+= len(otherPlaces[1])
                
    return count

print(pEQuestion(1000))

