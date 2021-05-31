tuple1=tuple(input("Enter numbers seperated by comma ").split(","))
print("Numbers entered by the user are ", tuple1)
print("Numbers divisible by 5 are below ")
for t in tuple1 :
    if int(t) % 5 ==0:
        print (t)

