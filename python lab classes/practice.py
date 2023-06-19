    
import os


# f=open('sample.txt','w')
# f.write("ok so i go it")
# f.close()

# f=open('sample.txt','a')
# f.write("done now")
# f.close()

f=open('sample.txt','r')
data=f.readline()
print(data)
data=f.readline()
print(data)
f.close()  