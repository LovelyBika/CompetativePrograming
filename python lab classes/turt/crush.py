import turtle


wn =turtle.Screen()
wn.setup(width=500,height=600)
 
obj1=turtle.Turtle()
turtle.bgcolor("black")
obj1.pencolor("red")
obj1.speed(500)
def curve():
 for i in range(200):
    obj1.right(1)
    obj1.forward(1)

def heart():
    obj1.left(140)
    obj1.forward(113)
    obj1.begin_fill()
    curve()
    obj1.left(120)
    curve()
    obj1.right(112)
    obj1.end_fill()
def txt():
  obj1.up()
  obj1.setpos(-68, 95)
  obj1.down()
  obj1.color('lightgreen')
  obj1.write("HAHA That's 4 U", font=(
      "Verdana", 12, "bold"))
obj1.speed(400)
heart()
txt()
turtle.done()  

