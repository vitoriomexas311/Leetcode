
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp = 0;
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                temp = nums[i];
                for (int j = i; j < nums.length; j++) {
                    int searchedFor = target - temp;
                    if (nums[j] == searchedFor) {
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
