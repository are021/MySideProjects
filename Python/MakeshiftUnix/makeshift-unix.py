from binaryNode import *
import re
'''
This program emulates a simple unix terminal, using some of the basic unix commands

These Include
 * cd
 * ls
 * cat
 * echo
 etc...
'''

def echo(userString): 
    print(" ".join(userString))

def callInput():
    bashInput = input("%")
    inputArray = re.split('[ /,\\\\/]+', bashInput)
    return inputArray

def main():
    compDirectory = Tree()
    inputArray = callInput()
    
    while (inputArray[0] != "exit"):
        if inputArray[0] == "echo":
            echo(inputArray[1:])

        elif inputArray[0] == 'cd':
            print()
        else:
            print("Not a Valid Input!!")
        
        inputArray = callInput()
    

if __name__ == "__main__":
    main()