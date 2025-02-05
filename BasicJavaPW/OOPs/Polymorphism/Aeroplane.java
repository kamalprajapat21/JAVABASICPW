////POLYMORPHISM ------> 


// class Aeroplane1{
//    public void fly()
//    {
//         System.out.println("Plane is Flying");
//     }

//     public void takeof(){
//         System.out.println("Plane is takeOf");
//     }
// } 


/////ABSTRACT concept (Abstract class ka object java me nahi bana sakte hai )
abstract class Aeroplane1{
   abstract public void fly();
 //    {
 //         System.out.println("Plane is Flying");
 //     }
 
     abstract public void takeof();
     // {
     //     System.out.println("Plane is takeOf");
     // }
 } 

class Cargoplane extends Aeroplane1 {
   public void fly(){
        System.out.println("Plane is Flying Cargo");
    }

   public void takeof(){
        System.out.println("Plane is takeOf CArgo");
    }
} 

class Passengerplane extends Aeroplane1 {
    public void fly(){
         System.out.println("Plane is Flying Passenger");
     }
 
    public void takeof(){
         System.out.println("Plane is takeOf Pessenger");
     }
 } 


 class Aeroport{
    public void poly(Aeroplane1 ref){
        ref.takeof();
        ref.fly();

        System.out.println("---------------------");
    }
 }

class Aeroplane{
    public static void main(String[]args){
        Cargoplane cp = new Cargoplane();
        Passengerplane pp = new Passengerplane();
        Aeroport Ap = new Aeroport();
        Ap.poly(cp);
        Ap.poly(pp);
        // pp.takeof();
        // pp.fly();

        // System.out.println("---------------------------");
//  cp.takeof();
//  cp.fly();
    }
}