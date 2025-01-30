//// in this code we UnderStand the Encapsulation ---> Binding the data and Corresponding to the method into a single Unit.
/// Encapsulation  = Data Hinding + Data Abstation
/// 
/// here we learn about the this and setter or Getter 



class Student{
    private int age ;
    private String name;

    public void setAge(int age){
       this. age = age;
       
    }
public int getAge(){
    return age;
}

    public void setName(String name){
        this.name = name;
    }
public String getName(){
    return name;
}
    // public void show(){
    //     System.out.println(name);
    //     System.out.println(age);
    // }

}

public class Encap1{
public static void main(String []args){
    Student obj = new Student();
   
obj.setAge(20);

   obj.setName("Kunal");
   System.out.println(obj.getAge());
   System.out.println(obj.getName());
   
}
}