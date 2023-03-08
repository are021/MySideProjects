from datetime import date

class Directory:
    def __init__(self):
        self.fileList = {}      #HashMap of filename and datecreated tuples pairs
        self.size = 0
        
    def add(self, name: str):
        today = date.today()
        type = None
        if "." in name:
            x = name.rfind(".")
            type = name[x+1:]
        dataTuple = (today,type)

        self.fileList[name] = dataTuple

    def __str__(self) -> str:
        directoryString = ""
        for key,val in self.fileList.items():
            directoryString += ("{} || {} || {}".format(key,val[0],val[1]))
        return directoryString
            
class Tree:
    '''
    File Tree Constructor
    param :none
    return : none
    '''
    def __init__(self):
        self.size = 0
        self.root = Node("/",None)
        self.root.left_child = Node("usr",None)
        self.root.right_child = Node("temp",None)

        self.root.left_child.parent = self.root
        self.root.right_child.parent = self.root

    def printWorkingDirectory(self):
        
        #get current node

        #recursively translate upwards to root, then print out each value!
        pass
    def _getCurrentNode(self):
        pass


class Node:
    def __init__(self, name : str , files : Directory):
        self.title = name
        self.data = files
        self.right_child = None
        self.left_child  = None
        self.parent = None

        

    def __str__(self):

        pass




