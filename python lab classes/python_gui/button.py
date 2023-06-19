from breezypythongui import *

class ButttonDemo(EasyFrame):

    def __init__(self):
        EasyFrame.__init__(self)
        
        self.label=self.addLabel(text="Hello world",row=0,column=0,columnspan=2,sticky="NSEW")
        
        self.clearBtn=self.addButton(text="clear",row=1,column=0,command=self.clear)
        self.restorBtn=self.addButton(text="Restore",row=1,column=1,state="disabled",command=self.restore)

    def clear(self):
          self.label["text"]=""
          self.clearBtn["state"]="disabled"        
          self.restorBtn["state"]="normal"

    def restore(self):
              self.label["text"]="hello world"
              self.clearBtn["state"]="normal"
              self.restorBtn["state"]="disabled"
def main():
    ButttonDemo().mainloop()
if __name__=="__main__" :
        main()                 