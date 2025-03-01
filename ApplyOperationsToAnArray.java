public class ApplyOperationsToAnArray{
    public int[] applyOperations(int[] nums){
        int[] result = new int[nums.length];
        int ptr = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                nums[i] = 0;
                nums[i - 1] *= 2;
            }
        }

        for(int n : nums){
            if(n != 0){
                result[ptr++] = n;
            }
        }

        for(int i = ptr; i < nums.length; i++){
            result[i] = 0;
        }

        return result;
    }
}