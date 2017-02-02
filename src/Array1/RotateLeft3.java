package Array1;

/**
 * Created by Dell on 2/2/2017.
 */
public class RotateLeft3 {

    /**
     * Given an array of ints length 3, return an array with the elements
     * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     *
     * rotateLeft3([1, 2, 3]) → [2, 3, 1]
     * rotateLeft3([5, 11, 9]) → [11, 9, 5]
     * rotateLeft3([7, 0, 0]) → [0, 0, 7]
     * @param nums
     * @return
     */
    public int[] rotateLeft3(int[] nums) {
        int[] list = {nums[1], nums[2], nums[0]};
        return list;
    }
}
