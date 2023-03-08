from stack import *
import random
'''
Difficulty 1 = Both Single Digit Numbers
Difficulty 2 = One Double, One Single

'''
def generateProblems(dif, stack):
    type = random.randint(1,2)

    if dif == 1:
        val1 = random.randint(0,9)
        val2 = random.randint(0,9)
    if dif == 2:
        val1 = random.randint(0,99)
        val2 = random.randint(0,99)
    if dif == 3:
        val1 = random.randint(0,999)
        val2 = random.randint(0,999)

    if type == 1:
        return ((val1 + val2), "{} + {}".format(val1,val2))
    elif type == 2:
        return ((val1 - val2), "{} - {}".format(val1,val2))



    



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