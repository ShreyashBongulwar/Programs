package in.assignment.Q8;

public class Shuffle {

	public static void main(String[] args) {
		int []nums = {2,5,1,3,4,7};
		int n = 3;
		nums= shuffle(nums,n);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}

	public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        
        for(int i = 0 ; i < n ; i++){
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[n + i];
        }

        return result;
    }
}
