/*this is treeSet it gives the value of Sorted order and it Use 
 * st.add()
 * st.higher();
 * st.lower()
 * st.floor()
 * st.ceiling()
 * Method 
 */

import java.util.*;
class TreeSetFunction{
    public static void main(String args []){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(40);
        ts.add(20);
        ts.add(30);
        ts.add(10);
        System.out.println(ts);
        System.out.println(ts.higher(20));
        System.out.println(ts.lower(20));
        System.out.println(ts.ceiling(30));
        
        
    }
}