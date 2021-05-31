import pandas

data={
    "Usernames":["admin","Charles","Deku"],
    "Passwords":["password","Charl13","AllMight"]
}

dataframe=pandas.DataFrame(data)
dataframe.to_csv("Acti17Output.csv",index=False)