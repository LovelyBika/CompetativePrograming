import os 
f= open("E:\demo.txt","w")
f.write("hello i am coder")



f= open("E:\demo.txt","a")
f.write ("\nits so cool")


# f=open("E:\demo.txt","w")
# data=683
# f.write(data)

f= open("E:\demo.txt","r")
print(f.read())

f.close()