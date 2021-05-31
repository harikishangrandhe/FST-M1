fruitdict={
    "apple":100,
    "pomo" :250,
    "mango":60,
    "orange": 80
}
print("The fruits in the fruit shop are",fruitdict)
findfruit=input("What fruit do you want to check? ").lower()
if findfruit in fruitdict:
    print(findfruit, " is available")
else:
    print(findfruit, " is not available")