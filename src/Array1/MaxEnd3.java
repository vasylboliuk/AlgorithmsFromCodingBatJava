package Array1;

/**
 * Created by Dell on 2/2/2017.
 */
public class MaxEnd3 {

    /**
     * Given an array of ints length 3, figure out which is larger,
     * the first or last element in the array, and set all the other elements
     * to be that value. Return the changed array.
     *
     * maxEnd3([1, 2, 3]) → [3, 3, 3]
     * maxEnd3([11, 5, 9]) → [11, 11, 11]
     * maxEnd3([2, 11, 3]) → [3, 3, 3]
     * @param nums
     * @return
     */
    public int[] maxEnd3(int[] nums) {
        int[] list = new int[3];
        boolean result = nums[0]>nums[2];
        if(result) {list[0] = nums[0]; list[1]=nums[0]; list[2]=nums[0];}
        else {list[0] = nums[2]; list[1]=nums[2]; list[2]=nums[2];}
        return list;
    }
}
