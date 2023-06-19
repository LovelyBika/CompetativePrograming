public class compareObj_8 {
    
    public static void main(String[] args) {
        person ob1= new person(14,"izzy");
        person ob2 =new person(20, "agent Rask");
        person ob3= new person(14, "izzy");
    
        //compare objects wihtout overriding with help of equal() method
        System.out.println(ob1.equals(ob3));   /* Output :-False  */
    }
}
class person{
    int age;
    String name;
 
   person(int age, String name){
     this.age =age;
     this.name=name;
    }
}