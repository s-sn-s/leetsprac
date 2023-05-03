
public class leet_1822 {

	public static void main(String[] args) {
		int[] nums = {
				41,65,14,80,20,10,55,58,24,56,28,86
				,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41
		};
		int[] nums1 = {
				9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30
		};
		System.out.println(arraySign1(nums1));
	}
	
	public static int arraySign(int[] nums) {
        long product = 0;
        int myProd = 0;
        for (int i = 1; i<nums.length; i++){
            if(i==1){
                product = nums[0] * nums[1];
            }else{
                product = product * nums[i];
            }
            System.out.println(product);
        }
        if(product ==0){
            myProd = 0;
        }else if(product <0){
            myProd = -1;
        }else if(product >0){
            myProd = 1;
        }
        return myProd;
    }
	public static int arraySign1(int[] nums) {
	    int sign = 1;

	    for (final int num : nums) {
	      if (num == 0)
	        return 0;
	      if (num < 0)
	        sign = -sign;
	      System.out.println(num + " " + sign); 
	    }
	    return sign;
	  }
}
