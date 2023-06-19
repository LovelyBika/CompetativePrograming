# e=[1,2,3,4,10,6]
# low=0
# high=len(e)-1

# key=int(input("enter the no "))
# while low<=high:
#     mid=(low+high)//2
#     if e[mid]==key:
#         print(f"your key is found{key}")
#     elif key>mid:
#          low=mid+1
#     else:
#          high=mid+1

# e=[5,7,1,4,23,12,45,33,56]
# b=len(e)-1
# for i in e:
#   for j in range(0,b):
#       if e[j]>e[j+1]:
#           e[j],e[j+1]=e[j+1],e[j]
# print(e)        

# print("welcome",end=" ")
# print("here")
        
# def convertList(l1):
#      for i in l1:
#          print(i,end=" ") 
      
            
            
# l1=["hello","i am","lovely"]
# convertList(l1)


def armstrong(n):
    s=0
    t=n
    while t>0:
        digit=t%10
        s+=digit**3
        t//=10
    if n==s:
       print(f"no is armstong{n}")
    else:
        print("no is not armstrong")
armstrong(145)              


