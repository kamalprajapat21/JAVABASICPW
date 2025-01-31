
class Human{
    int age;
   private String name;

   Human(){
    System.out.println("This is Human Constructor");
   }
    
    ///Constructor not take part in Inheretance 
    void sleep(){
        age  =25;
        name = "Kamal";
        System.out.println("Human class");
        System.out.println(age);
        System.out.println(name);
    }
}


class Student extends Human{
    // here name filled is Private so it not take part in Inheretance 
    // System.out.println(name);


    //by deafault here the default constructor is called so Super()method called by default
}

public class Inheretance{
    public static void main(String []args){
Student st = new Student();
st.sleep();
    }
}