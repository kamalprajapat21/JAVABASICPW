/* here Iterator Concept is Good to Learn it is used in All collections  */


import java.util.*;
class IteratorFunction{
    public static void main(String args[]){
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(20);
        ls.add(40);
        ls.add(60);
        ls.add(80);

        Iterator itr = ls.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Without Ierator");
        System.out.println(ls);
    }
}