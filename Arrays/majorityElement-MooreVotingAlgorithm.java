//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times.

class Solution {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        int count = 0;
        int candidate = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count += 1;
            }
            else{
                count -= 1;
            }
        }
        System.out.println(candidate);
    }
}

//Output
//2