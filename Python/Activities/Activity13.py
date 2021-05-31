def sum(numbers):
    sum=0
    for number in numbers:
        sum=sum+int(number)
    return sum
#list1=[1,2,3,4,5]

list1=list(input("Enter numbers with comma ").split(","))

result=sum(list1)
print("Sum of all elements is ", result)