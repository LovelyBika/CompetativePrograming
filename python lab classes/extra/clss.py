class Employee:
    company = "goofle"
    def __init__(self,pay,sal):
        self.pay=pay
        self.sal=sal
        print(f"calling without restriction")
    
    def getdetail(self):
        print(f"your pay is {self.pay}and {self.sal}")
    def getSal(self):
        print(f"lets see {self.wk}")
    @staticmethod

    def cool(self):
        print("i am in")


# ob = Employee()
# ob.wk = "ok shit works"
# ob.getSal()
# ob.cool()
ob=Employee(100,20)
ob.getdetail()