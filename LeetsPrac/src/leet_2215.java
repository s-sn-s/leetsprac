import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class leet_2215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {0,0,0,1}; 
		int[] j = {2,1,3,1,4,4};
		System.out.println(findDifference(i,j));
	}
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> n1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> n2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i:nums2) {
        	if(n1.contains(i)) {
        		n1.removeAll(Arrays.asList(i));
        		n2.removeAll(Arrays.asList(i));
        		continue;
        	}
        }
        n1 = n1.stream().distinct().collect(Collectors.toList());
        n2 = n2.stream().distinct().collect(Collectors.toList());
        result.add(n1);
        result.add(n2);
        return result;
    }
}