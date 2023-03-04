from binaryNode import *
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
    print(userString)



def main():
    var = Directory()
    var.add("hello.val.txt")
    print(var)
    bashInput = input("%").upper()
    while (bashInput != "EXIT"):
        if bashInput == "ECHO":
            usrInput = input()
            echo(bashInput)

        else:
            print("Not a Valid Input!!")
        
        bashInput = input("%").upper()

if __name__ == "__main__":
    main()