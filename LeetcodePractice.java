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