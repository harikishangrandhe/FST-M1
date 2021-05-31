import pandas
data=pandas.read_csv("Acti17Output.csv")
print("The complete data in CSV file is ")
print(data)
print("Printing the values only in the Usernames column: ")
print(data["Usernames"])
print("Printing the user name and Password of 2nd row :")
print("Username : " ,data["Usernames"][1],", " ,"Password : ",data["Passwords"][1])
print("Sorting the Usernames column data in ascending order and printing data")
print(data.sort_values("Usernames"))
print("Sort the Passwords column in descending order and print data")
print(data.sort_values("Passwords",ascending=False))




