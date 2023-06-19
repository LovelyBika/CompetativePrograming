import matplotlib.pyplot as plt 
import numpy as np 
m=10
w=4
r=np.arange(-10,10)
for j in r  :
    v=0.5*m*w*w*r*r   

plt.plot(r,v)
plt.title("harmonic oscilaator ")
plt.xlabel("radius")
plt.ylabel("energy")
plt.show()