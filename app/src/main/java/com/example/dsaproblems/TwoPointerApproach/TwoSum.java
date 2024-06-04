
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
public class TwoSum {

    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 4, 6, 8, 9, 14, 15};
        int target = 13;
        int left =0;
        int right = arr.length - 1;
        int[] resultArr = new int[2];
        while(left<right){
          int sum = arr[left] + arr[right];
          if (sum==target) {
          	resultArr[0] = arr[left];
          	resultArr[1] = arr[right];
          	break;
          }
          if (sum>target) {
          	right--;
          }
          if (sum<target) {
          	left++;
          }

        }
        if (!resultArr.length==0){
            System.out.println("Target not found");
        }else {
            System.out.println("Target = "+resultArr[0]+" "+resultArr[1]);
        }
    }
}