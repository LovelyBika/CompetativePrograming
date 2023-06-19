class school:
    school="jnv"
    print(school)


class student:
      def stu(self,name,marks):
          self.name=name
          self.marks=marks
          print(f"student name-{self.name} having marks-{self.marks}")

class regis(school,student):
    pass


a=regis()
         