from breezypythongui  import EasyFrame
import tkinter.filedialog

class FileDialogDemo(EasyFrame):
    
    def __init__(self):
        EasyFrame.__init__(self,"File Dialog Demo")
        self.outputArea=self.addTextArea("",row=0,column=0,width=80,height=15,)
        self.addButton(text="Open",row=1,column=0,command=self.openFile)\
    
    def openFile(self):
        fList=[("python files","*.py"),("Text files","*txt")] 
        fileName =tkinter.filedialog.askopenfilename(parent=self,filetype=fList)
        if fileName !="":
            file=open(fileName,'r')
            text=file.read()
            file.close()
            self.outputArea.setText(text)
            self.setTitle(fileName)   

 