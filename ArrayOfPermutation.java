import java.util.Arrays;

public class ArrayOfPermutation {
    public static int[] buildArray(int[] nums){
        int[] out = new int[nums.length];

        for (int i=0; i<nums.length; i++){
            out[i] = nums[nums[i]];
        }
        return out;
    }
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
