from stack import *

def generateProblems():
    pass


def startGame(stack):
    try:
        difficulty = int(input("Select a Difficult /n 1. Easy /n 2. Medium /n 3. Hard"))
    except:
        print("Input A Valid Number!")
        return (stack,False,None)
    
    if difficulty == 1:
        val = 4
    elif difficulty == 2:
        val = 7
    elif difficulty == 3:
        val = 10
    else:
        print("Not a Valid Difficulty")
        return (stack,False,None)


    for i in range(val):
        stack.push(Dummy())
    return (stack,True,difficulty)



def main():
    quizStack = Stack()
    quizStack, untilTrue, difficulty = startGame(quizStack)
    while untilTrue == False:
        quizStack, untilTrue, difficulty = startGame(quizStack)


if __name__ == "__main__":
    main()