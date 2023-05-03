
public class leet_2 extends leet_2_super{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leet_2 lee = new leet_2();
		
		leet_2_super l12 = new leet_2_super(3);
		leet_2_super l11 = new leet_2_super(4,l12);
		leet_2_super l1 = new leet_2_super(2,l11);
		leet_2_super l22 = new leet_2_super(4);
		leet_2_super l21 = new leet_2_super(6,l22);
		leet_2_super l2 = new leet_2_super(5,l21);
//		System.out.println(l12.val);
//		System.out.print(l12.next);
//		System.out.println(l22.val);
//		System.out.print(l22.next);
		addTwoNumbers(l1,l2);
	}

	

	public static leet_2_super addTwoNumbers(leet_2_super l1, leet_2_super l2) 
	{
		// Head of the new linked list - this is the head of the resultant list
        leet_2_super head = null;
        // Reference of head which is null at this point
        leet_2_super temp = null;
        // Carry
        int carry = 0;
        // Loop for the two lists
        while (l1 != null || l2 != null) {
            // At the start of each iteration, we should add carry from the last iteration
            int sum = carry;
            // Since the lengths of the lists may be unequal, we are checking if the
            // current node is null for one of the lists
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            // At this point, we will add the total sum % 10 to the new node
            // in the resultant list
            leet_2_super node = new leet_2_super(sum % 10);
            // Carry to be added in the next iteration
            carry = sum / 10;
            // If this is the first node or head
            if (temp == null) {
                temp = head = node;
            }
            // For any other node
            else {
                temp.next = node;
                temp = temp.next;
            }
        }
        // After the last iteration, we will check if there is carry left
        // If it's left then we will create a new node and add it
        if (carry > 0) {
            temp.next = new leet_2_super(carry);
        }
        return head;
		
//		leet_2_super l1head = l1;
//		leet_2_super l2head = l2;
//		leet_2_super head = null;
//		leet_2_super temp = null;
//		leet_2_super[] objArr = {l1head,l2head};
//		int sum = 0;
//		int i=1;
//		for(leet_2_super a : objArr) {
//			i = 1;
//			int num = 0;
//			int counter = 0;
//			while (!(a == null)) {
//				counter	= a.val*i;
//				num = num + counter;
//				a = a.next;
//				i = i * 10;
//			}
//			System.out.println(num);
//			sum = sum + num;
//		}
//		
//		int scount = 1;
//		
//		while(sum>0){
//			leet_2_super node = new leet_2_super(sum%10);
//			if(temp==null){
//				temp = head = node;
//				scount = scount++;
//				}else{
//					temp.next = node;
//					temp = temp.next;
//				} 
//			sum=sum/10;
//		}
//		return head;
	}

}
