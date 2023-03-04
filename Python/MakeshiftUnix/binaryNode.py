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
            


        
class Node:
    def __init__(self, files : Directory):
        self.data = files
        self.right_child = None
        self.left_child  = None




