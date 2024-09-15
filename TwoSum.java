import java.util.Map;
import java.util.HashMap;

class Solution {

    public int[] twoSumNSquared(int[] nums, int target) {
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

    public int[] twoSumN(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int searchedFor = target - nums[i];
            if (map.containsKey(searchedFor)) {
                answer[0] = map.get(searchedFor);
                answer[1] = i;
                return answer;
            }
            map.put(nums[i], i);
        }
        return answer;
    }
}
