/* static value ko call ke samay Object ki jarurat nahi hoti hai 
 * jabki non static methods ko call ke samay object ki jarurat hoti hai
 */


class Demo{
    static int a;
    static int b;
    int n;
    int m;

    static{
        a = 10;
        b = 52;
    }

    {
        n = 12;
        m = 99;
    }

    static void dis(){
        System.out.println("Static Value is " + a );
        System.out.println("Static Value of  b is " + b );
        }

        void dis2(){
            System.out.println("Non Static Value  of n is " + n );
            System.out.println("Non Static Value of  m is " + m );
        }
    }


public class StaticNonStaticConcept{
    public static void main(String[]args){
        Demo obj = new Demo();
        obj.dis2();
Demo.dis();
    }
}