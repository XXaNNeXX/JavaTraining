import java.util.HashMap;

public class LeetcodePractice {

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
    
    
    static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
   
    static int[] twoSum2(int[] nums2, int target2) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums2.length; i++) {
            myMap.put(nums2[i], i);
        }
        for(int i=0; i<nums2.length; i++) {
            int j = target2 - nums2[i];
            if(myMap.containsKey(j) && myMap.get(j) != i) {
                return new int[] {i, myMap.get(j)};
            }
        }
        return null;
    }

    /**Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
    Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
    The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.*/

    static int romanToInt(String s) {
        int n = 0, res = 0;
        for(int i=s.length()-1; i<=0; i--) {
            switch(s.charAt(i)) {
                case 'I': n = 1; break;
                case 'V': n = 5; break;
                case 'X': n = 10; break;
                case 'L': n = 50; break;
                case 'C': n = 100; break;
                case 'D': n = 500; break;
                case 'M': n = 1000; break;
            }
            if(4*n < res) {
                res -= n;
            }
            else {res += n;}
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,8,6};
        int target = 10;
        twoSum(nums, target);
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + ", " + nums[j]);
                }
            }
        }

        int[] nums2 = {3,5,7,8};
        int target2 = 10;
        twoSum(nums2, target2);
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums2.length; i++) {
            myMap.put(nums2[i], i);
        }
        for(int i=0; i<nums2.length; i++) {
            int j = target2 - nums2[i];
            if(myMap.containsKey(j) && myMap.get(j) != i) {
                System.out.println(nums2[i] + ", " + j);
            }
        }
    }
}