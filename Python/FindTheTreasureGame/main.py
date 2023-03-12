from charclass import *

startText = """"A Cloaked Figure Approaches You In the Middle of the Night....\n
    "The Man Tells You Of A Hidden Treasure Located in the Forbidden \"Midnight Dungeon\" \n
    He Warns you of the Great Danger, and advises caution when exploring the dungeon \n 
    Will You Explore This Perilous Dungeon? \n
    Yes Or No?"""


def main():
    print(startText)
    verifyChoice1 = input()

    if verifyChoice1 != "Yes":
        return
    

    


if __name__ == "__main__":
    main()