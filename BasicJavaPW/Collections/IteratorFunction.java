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


        /*ListIterator  Only use in ArrayList or LinkeList it print the Reverse Order*/

       ListIterator Litr = ls.listIterator(ls.size());
        while(Litr.hasPrevious()){
            System.out.println(Litr.previous());
        }
        System.out.println("Without Ierator");
        System.out.println(ls);
    }
}