import pandas

dataframe=pandas.read_excel("Activity19Output.xlsx","Sheet1")
print("Printing the complete data in Excel file")
print(dataframe)
print("Printing total no. of rows and cols : ")
print(dataframe.shape)
print("Print the data in the emails column only ")
print(dataframe["Email"])
print ("Sorting the data based on FirstName in ascending order and printing the data")
print(dataframe.sort_values("FirstName"))