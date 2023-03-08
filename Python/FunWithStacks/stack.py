

class Dummy:
    def __init__(self):
        self.data = None

    def __str__(self):
        return "Node"
class Stack:
    def __init__(self):
        self.stack = []

    def __len__(self):
        return len(self.stack)
    
    def __str__(self):
        return(" ".join(str(item) for item in self.stack))

    def push(self, val):
        self.stack.append(val)

    def is_empty(self):
        return len(self.stack) == 0
    
    def top(self):
        return self.stack[0]
    
    def pop(self):
        return self.stack.pop()
    


