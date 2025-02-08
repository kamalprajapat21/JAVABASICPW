/*
QUESTION 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */




/*
Way 1 --> Brute force -->O(n2)
simply check if ith element is making a pair with any of the other element on
the right side

Way 2-->Using Two Pointer approach-->O(n log n )
time complexity is nlogn because in this approach, the array will be first sorted and then , two pointer approach will be used

Way 3-->Using HashMap -->O(n)
keep on storing the elements that we reach , also keep on check if target-element is already present in the hashmap or not , if it is , then we found a pair */



// Case1 = if Target = nums[i] && map.contains(0)
// result[0] = i;
// result[1] = map.get(0)


// class Twosum{
//     public static void main(String []args){
//         HashMap<Integer,
//     }
// }



import java.util.*;
public class TwoSum{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n");
        int n = sc.nextInt();
int nums[] = new int[n];
System.out.println("Element of Nums");
for(int i = 0;i<n;i++){
    nums[i] = sc.nextInt();
}

System.out.println("Enter Target :");
int target = sc.nextInt();

HashMap<Integer, Integer> map = new HashMap<>();
for(int i = 0;i<n;i++){
    map.put(nums[i],i);
}

int result[] = new int[2];
for(int i = 0;i<n;i++){
if(nums[i] == target && map.containsKey(0)){
result[0] = i;
result[1] = map.get(0);
System.out.println("[" + result[0] + "," + result[1] + "]");

break;
}

else if(map.containsKey( target - nums[i])){
    if(map.get(target - nums[i]) > i){
        result[0] = i;
        result[1] = map.get(target - nums[i]);
        System.out.println("[" + result[0] + "," + result[1] + "]");
        break;

    }
}
}

// System.out.println("[" + result[0] + "," + result[1] + "]");
}

}