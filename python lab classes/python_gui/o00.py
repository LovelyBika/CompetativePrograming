from breezypythongui import EasyFrame
class ok(EasyFrame):
     """Displays a greeting in a window."""
     def __init__(self):
        """Sets up the window and the label."""
        EasyFrame.__init__(self, title="ok")
        # self.addLabel(text = "fuck off", row =0, column = 0)
        self.addLabel(text="input",row=0,column=0)
        self.inputField=self.addTextField(text="",row=0,column=1)

        self.addLabel(text="Output",row=1,column=0)
        self.outputField=self.addTextField(text="",row=1,column=1,state="readonly")

        self.addButton(text="convert",row=2,column=0,columnspan=2,command=self.convert)

     def convert(self):
       text=self.inputField.getText()
       result=text.upper()
       self.outputField.setText(result)




def main():
        
         ok().mainloop()
if __name__ == "__main__":
        main()               
            
