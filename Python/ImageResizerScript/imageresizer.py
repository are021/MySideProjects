from io import BytesIO

from PIL import Image
import requests
class ImageModifier:

    def __init__(self, filename = "", new_file = ""):
        self.filename = filename
        self.new_file = new_file
        self.im = None
        self.file_extension = None
        self.saved_file = None

        if (self.filename !=""):
            self.im = Image.open(self.filename)
            self.file_extension = (self.im.format).lower()
    
    def inputFile(self):
        filename = input("Drag a file into the source folder and type the filename -->")
        while True:
            try:
                self.im = Image.open(filename)
            except:
                print("invalid - filename: try again!")
                filename = input("Drag a file into the source folder and type the filename -->")
                continue
            
            print("valid")
            break
        self.filename = filename
        self.file_extension = self.im.format

    def getImageHTTP(self):
        http_link = input("Input a Link --> ")
        self.download_img(http_link)

    def download_img (self,url):
        r = requests.get(url)
        self.new_file = Image.open(BytesIO(r.content)) #Open the image
        self.file_extension = (self.new_file.format).lower()
        

    def modifyImage(self):
        new_height = int(input("A height --> "))
        new_width = int(new_height / self.im.height * self.im.width)

        new_size = self.im.resize((new_width, new_height))
        self.new_file = new_size

    def showImage(self):
        self.new_file.show()

    def saveImage(self):
        new_file_name = input ("Name your file! --> ")
        self.new_file.save(new_file_name +"." + self.file_extension)
        self.saved_file = (new_file_name + "." + self.file_extension)



    