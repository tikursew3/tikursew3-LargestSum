
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        /* 
        Integer largestSum = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) > largestSum) {
                    largestSum = nums.get(i) + nums.get(j);
                }
            }         
        }
        return largestSum;
        */
        Integer first;
        Integer second;
        if(nums.get(0) > nums.get(1)){
            first = nums.get(0);
            second = nums.get(1);
        }else {
            first = nums.get(1);
            second = nums.get(0);
        }
        for (int k = 2; k < nums.size(); k++) {
            if(nums.get(k) > first) {
                second = first;
                first = nums.get(k);
            } else if (nums.get(k) > second) {
                second = nums.get(k);
            }
        }
        return first + second;
    }


}