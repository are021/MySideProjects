'''
Credit are021

Simple Python Image Resizer!

Maintains ratio

'''

from imageresizer import *

def testResize(im):
    while True:
        im.modifyImage()
        im.showImage() 
        
        seeImage = input("Keep the Image? \n y or n \n --> ").lower()

        if seeImage == 'y':
            break

    return

def main():
    start = input("Do you want to download a file via \n 1) Url \n 2) Local \n --> ")
    im = ImageModifier()

    if start == "Url":
        im.getImageHTTP()
        save = input("Save your image? \n y or n \n --> ").lower()
        if save == 'y':
            im.saveImage()
        ##################Resize the downloaded image?########################
        resize_new = input("Resize Downloaded Image?? \n y or n \n --> ")
        new_img = ImageModifier(im.saved_file)
        testResize(new_img)
        save = input("Save your image? \n y or n \n --> ").lower()
        if save == 'y':
            new_img.saveImage()
        ######################################################################
    if start == "Local":
        im.inputFile()
        testResize(im)

        save = input("Save your image? \n y or n \n --> ").lower()
        if save == 'y':
            im.saveImage()
        




if __name__ == "__main__":
    main()
