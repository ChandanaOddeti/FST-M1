User1 = input("Enter Player1's Name")
User2 = input("Enter Player2's Name")

while True:  
    User1_Ans = input(User1 + "Choose rock,paper or scissors").lower()
    User2_Ans = input(User2 + "Choose rock,paper or scissors").lower()

if User1_Ans == User2_Ans:
    print("Its a tie!")
elif User1_Ans == 'rock':
    if User2_Ans == 'scissors':
        print("Rock wins!")
    else :
        print("paper wins!")

elif User1_Ans == 'scissors':
    if User2_Ans == 'paper':
        print("Scissors wins!")
    else:
        print("Rock wins!")
elif User1_Ans == 'paper':
    if User2_Ans == 'rock':  
        print("Paper wins!")
    else:
        print("Scissors wins!") 
else:
    print("Please enter rock, paper or scissors, try again.")
repeat = input("Do you want to play another round? Yes/No: ").lower()
if(repeat == "yes"):
        pass
elif(repeat == "no"):
        raise SystemExit
    
else:
    print("You entered an invalid option. Exiting now.")
    raise SystemExit