from stack import *
import random
import time
import threading

'''
Difficulty 1 = Both Single Digit Numbers
Difficulty 2 = One Double, One Single

'''
def generateProblems(dif, stack):
    type = random.randint(1,4)

    if dif == 1:
        if type == 1 or type == 2:
            val1 = random.randint(0,9)
            val2 = random.randint(0,9)
        elif type == 3:
            val1 = random.randint(0,6)
            val2 = random.randint(0,6)
        else:
            val1 = random.randint(0,30)
            val2 = random.randint(1,10)

  
    if dif == 2:
        if type == 1 or type == 2:
            val1 = random.randint(0,99)
            val2 = random.randint(0,99)
        elif type == 3:
            val1 = random.randint(0,12)
            val2 = random.randint(0,12)
        else:
            val1 = random.randint(0,100)
            val2 = random.randint(1,30)
    if dif == 3:
        if type == 1 or type == 2:
            val1 = random.randint(0,999)
            val2 = random.randint(0,999)
        elif type == 3:
            val1 = random.randint(0,20)
            val2 = random.randint(0,20)
        else:
            val1 = random.randint(0,200)
            val2 = random.randint(1,50)
    if type == 1:
        return ((val1 + val2), "{} + {}\n".format(val1,val2))
    elif type == 2:
        return ((val1 - val2), "{} - {}\n".format(val1,val2))
    elif type == 3:
        return ((val1 * val2), "{} * {}\n".format(val1,val2))
    else:
        return ((val1 // val2), "{} / {}\n".format(val1,val2))


def countdown(t):
    
    while t:
        mins, secs = divmod(t, 60)
        timer = '{:02d}:{:02d}'.format(mins, secs)
        print(timer, end="\r")
        time.sleep(1)
        t -= 1
    print("Hello")
    



def startGame(stack):
    try:
        difficulty = int(input("Select a Difficult \n 1. Easy \n 2. Medium \n 3. Hard \n"))
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

def askQuestion(answer,questionString):
    try:
        userPrompt = int(input(questionString))
        if userPrompt == answer:
            return True
        else:
            return False

    except:
        print("Wrong Answer")
        return False


def main():
    quizStack = Stack()
    quizStack, untilTrue, difficulty = startGame(quizStack)
    while untilTrue == False:
        quizStack, untilTrue, difficulty = startGame(quizStack)
    #t = threading.Thread(target = countdown,args= (15,))
    while not quizStack.is_empty():
        #t.start()
        answer, questionString = generateProblems(difficulty,quizStack)
        qBool = askQuestion(answer,questionString)
        if qBool == True:
            print("Correct! Questions Left = {}".format(len(quizStack)-1))
            quizStack.pop()
        elif qBool == False:
            print("Incorrect! Questions Left = {}".format(len(quizStack)+1))
            quizStack.push(Dummy())
        else:
            break
    print("YOU WIN")
if __name__ == "__main__":
    main()