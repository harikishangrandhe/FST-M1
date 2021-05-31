list1=list(input("Enter the first list numbers with comma ").split(","))
list2=list(input("Enter the second list numbers with comma ").split(","))
list3=[]


for i in list1:
    if int(i) % 2 != 0 :
            list3.append(i)

for i in list2:
    if int(i) % 2 == 0 :
        list3.append(i)
   
print("The new list - odd from list1 & even from list 2 ",list3)