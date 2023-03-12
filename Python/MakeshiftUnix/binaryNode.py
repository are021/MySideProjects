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
        self.size = 3
        self.height = 1

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
    '''
    Find a node recursively in the binary tree (CD)
    '''
    def find(self, root, ary ,i = 1):
        
        if root is None:
            return None
        elif ary[i] == self.root.left_child:
            return self.root.left_child
        elif ary[i] == self.root.right_child:
            return self.root.right_child
        
        left = self.find(root.left_child, ary, i+1)
        right = self.find(root.right_child, ary, i+1)
        if left is None and right is None:
            return None
        elif left is not None:
            return left
        elif right is not None:
            return right      
            
        
class Node:
    def __init__(self, name : str , files : Directory):
        self.title = name
        self.data = files
        self.right_child = None
        self.left_child  = None
        self.parent = None

        

    def __str__(self):

        pass




