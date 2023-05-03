
public class leet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sums = {3,1,6};
		int[] out = twoSum(sums, 9);
		for (int i : out) {
			System.out.println(i);
		}
	}
	public static int[] twoSum(int[] nums, int target) {
        int[] ind = new int[2];
        int arLen = nums.length;
        boolean flag = false;
        for (int i=0; i<arLen-1; i++){
            for (int j=i+1; j<arLen; j++){
            	if(nums[i]+nums[j]==target){
            		ind[0] = i;
            		ind[1] = j;
            		flag = true;
            		break;
                }
            }
            if (flag==true)
                break;
        }
        for (int i : ind) {
			System.out.println(i);
		}
        System.gc();
        return ind;
    }
}
