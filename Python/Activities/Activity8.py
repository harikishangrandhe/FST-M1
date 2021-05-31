list1=list(input("Enter the numbers with comma").split(","))
print("The list you entered is",list1)
first=int(list1[0])
last=int(list1[-1])
if first==last:
#if list1[0]==list1[-1]:
    print(True)
else:
    print(False)