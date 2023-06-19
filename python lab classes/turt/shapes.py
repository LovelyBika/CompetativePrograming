import turtle
d=turtle.Turtle()
d.pensize(5)
d.color("yellow")
turtle.bgcolor("black")
#sqaure
s=int(input("Enter the side of square: "))
for i in range(4):
    d.forward(s)
    d.left(90)
#circle
turtle.goto(50,50)
r=int(input("enter the radius: "))
d.circle(r)


turtle.done()    