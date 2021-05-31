
print("I can tell you when you will be 100 years old.")
name=input("Please Enter your name ")
age=int(input("Please Enter your age "))
temp=100-age
curyear=2021
year=curyear+temp
outputMsg="{} will turn 100 years on {}"
print(outputMsg.format(name,year))