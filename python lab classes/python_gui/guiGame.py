
import random
from turtle import width
from breezypythongui import *

class GuessGame(EasyFrame):

    def __init__(self):
        EasyFrame.__init__(self,title="Guessing Game")
        
       
        self.myNumber=random.randint(1,100)
        self.count=0

        greeting="Guess a Number between 1 and 100"
        self.hintLabel=self.addLabel(text=greeting,row=0,column=0,columnspan=2,sticky="NSEW")


        self.addLabel(text="Your guess",row=1,column=0)
       
        self.guessField=self.addIntegerField(0,row=1,column=1)
        
        self.nextButton=self.addButton(text="Next",row=2,column=0,command=self.nextGuess)
        self.newButton=self.addButton(text="New game",row=2,column=1,state="disabled",command=self.newGame)
        
      
    def nextGuess(self):
        self.count+=1
        guess=self.guessField.getNumber()
        if guess==self.myNumber:
            self.hintLabel["text"]="you have guesed it in " + str(self.count)+"attempts!"
            self.nextButton["state"]="disabled"
            self.newButton["state"]="active"
        elif guess<self.myNumber:
            self.hintLabel["text"]="sorry, too to small!"
        else:
            self.hintLabel["text"]="sorry, too large"
    def newGame(self):
            self.myNumber=random.randint(1,100)
            self.count=0
            greeting="Guess a number between 1 to 100"
            self.hintLabel["text"]=greeting
            self.guessField.setNumber(0)
            self.nextButton["state"]="normal"


def main():
        GuessGame().mainloop()
if __name__=="__main__":
        main()    

