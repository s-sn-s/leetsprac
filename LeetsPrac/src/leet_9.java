
public class leet_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isItPalindrome(123454321));
	}
	public static boolean isPalindrome(int x) {
       String o = String.valueOf(x);
       String r = "";
       for(int i = o.length()-1;i>=0;i--) {
    	   r = r + o.charAt(i);
       }
       System.gc();
       return (o.equals(r)?true:false);
    }
	
	public static boolean isItPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        if(x < 0 || x % 10 == 0) {
            return false;
        } 

        int reversed_int = 0;
        while(x > reversed_int) {
            int pop = x % 10;
            //System.out.println(pop);
            x /= 10;
            //System.out.println(x);
            reversed_int = (reversed_int * 10) + pop;
            //System.out.println(reversed_int);
        }
        if(x == reversed_int || x == reversed_int / 10) {
        	System.out.println(x);
        	System.out.println(reversed_int);
            return true;
        } else {
           return false; 
        }

        
    }
}
