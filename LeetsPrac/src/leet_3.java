

public class leet_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "sas";
		System.out.println(lengthOfLongestSubstring(ss));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		int maxLen = 0;
        for(int l = 0, r = 0; r<s.length();r++){
            int indexOfCharFIrstFoundat = 
                s.indexOf(s.charAt(r),l);
            if (indexOfCharFIrstFoundat != r){
                l = indexOfCharFIrstFoundat +1;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        System.gc();
        return maxLen;
    }

}
