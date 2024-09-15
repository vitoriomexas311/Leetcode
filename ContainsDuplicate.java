import java.util.HashMap;
import java.util.Map;

class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        boolean result = false;
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                result = true;
                return result;
            } else {
                numbers.put(nums[i], 1);
            }
        }
        return result;
    }
}
