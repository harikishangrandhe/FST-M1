
while True:
    number=int(input("Enter a number for which you want to see the multiplication table : "))
    for i in range(1,11):
        print(number, 'x',i,'=',number*i)

    cont=input("Do you want to continue with another number?.Enter y or n ")

    if cont=='y':
        continue
    elif cont=='n':
        raise SystemExit
    else:
        print("You have not entered a correct option. Exiting now...")
        raise SystemExit
