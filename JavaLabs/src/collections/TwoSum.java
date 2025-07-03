package collections;

public class TwoSum {
    // You are given a list and also you are given a number
    // Is there a pair of numbers in the given list that sums up to the number. If yes, return true, else return false
    // 1, 10, 5, 50, 16, 21, 37
    // number = 38 => true
    // number = 100 => false
    public static void main(String []args) {
        int[] nums = {1, 10, 5, 50, 16, 21, 37};

        System.out.println(twoSum(nums,22));
    }

    // Brute force approach - not very efficient
    public static boolean twoSum(int []nums, int sum) {
        for(int i=0; i<nums.length-1;i++) {
            for (int j=i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
    // Can we do better???
//    public static boolean twoSumV2(int []nums, int sum) {
//        // Create an empty hashmap with key and value as int and int
//        // Loop thru the nums and add each number to map
//        // Before adding number to the map, check if sum-number exists in the map already
//        // If yes, return true else return false
//    }
//
//    public static boolean twoSumV3Indices(int []nums, int sum) {
//        // Input : int[] nums = {1, 10, 5, 50, 16, 21, 37}, sum=22
//        // sum=22, Return 0, 5, array of 2 integers
//        // sum=38, return 0, 6
//        // sum=100, return null
//    }
}
