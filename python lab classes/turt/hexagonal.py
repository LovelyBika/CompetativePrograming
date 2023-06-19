import turtle
color=["blue","yellow","red","green","orange","pink"]
sketch=turtle.Turtle()
sketch.pensize(10)
turtle.bgcolor("black")
for i in range(200):
   sketch.pencolor(color[i%6])
   sketch.width(i/100+1)
   sketch.forward(i)
   sketch.left(59) 
turtle.done()