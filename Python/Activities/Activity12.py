def recsum(n):
    if n<=1:
        return n
    else:
        return n+recsum(n-1)

number=int(input("Enter the number you want to perform recursive addition "))
result=recsum(number)
print(result)