import random
import turtle

# def inScreen(win,turt):
   
def main():
    wn=turtle.Screen()
    Red=turtle.Turtle()
    Red.pencolor("red")
    Red.pensize(5)
    Red.shape('turtle')
    pos=Red.pos()
    
    Blue=turtle.Turtle()
    Blue.pencolor("blue")
    Blue.shape('turtle')
    Blue.pensize(5)
    Blue.hideturtle()
    Blue.penup()
    Blue.goto(pos[0]+50,pos[1])
    Blue.showturtle()
    Blue.pendown()
    # Blue.pendown()
    turtle.done()
    
    mT= True 
    jT= True
     
    while mT and jT and sameposition(Red,Blue)
        coinRed= random.randomrange(0,2) 
        angleRed =90
        if coinRed==0 :
            Red.left(angleRed)
        else:
            Red.right(angleRed)
        
        
        coinBlue=random.randomrange(0,2)
        angleBlue=90
        if coinBlue==0:
            Blue.left(angleBlue)
        else:
            Blue.right(angleBlue)
        Red.forward(50)
        Blue.forward(50)        
    
    
    
    


main()  
