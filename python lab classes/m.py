from PIL import Image
#Open image using Image module
im = Image.open(r"C:\Users\welcome\Pictures\women.png")
#Show actual Image
im.show()
#Show rotated Image
im = im.rotate(45)
im.show()