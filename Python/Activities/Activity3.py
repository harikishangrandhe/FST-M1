print("This is a Rock Paper Scissor game.Players can enter Rock or Paper or Scissor")
Player1=input("Player 1: Enter your option ").lower()
Player2=input("Player 2: Enter your option ").lower()

if Player1=="rock":
    if Player2=="paper":
        print("Player 2 wins!!")
    elif Player2=="scissor":
        print("Player 1 wins!!")
    elif Player2=="rock":
        print("Tie..Both are equal")
    else:
            print("Player 2 -> You have entered an incorrect option")

elif Player1=="paper":
    if Player2=="rock":
        print("Player 1 wins!!")
    elif Player2=="scissor":
        print("Player 2 wins!!")
    elif Player2=="paper":
        print("Tie..Both are equal")
    else:
        print("Player 2 -> You have entered an incorrect option")

elif Player1=="scissor":
    if Player2=="paper":
        print("Player 1 wins!!")
    elif Player2=="rock":
        print("Player 2 wins!!")
    elif Player2=="scissor":
        print("Tie..Both are equal")
    else:
        print("Player 2 -> You have entered an incorrect option")

else:
    print("Player 1 -> You have entered an incorrect option")