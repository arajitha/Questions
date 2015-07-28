package Test;

public class LinkedListTest {

		 
    public static void main(String[] args) {
    	LinkedList1 lList = new LinkedList1();
 
        // add elements to LinkedList
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        lList.add("6");

 
        /*
         * Please note that primitive values can not be added into LinkedList
         * directly. They must be converted to their corresponding wrapper
         * class.
         */
        String s =  lList.binaryAddition("11", "1");
        System.out.println("Binary Addition: " +s);

        System.out.println("lList - Find length: " + lList.getLength());

        System.out.println("lList - print linkedlist: " + lList.toString());
        lList.addAtIndex("7", 3);

        System.out.println("lList - print linkedlist: " + lList.toString());

        System.out.println("lList.size() - print linkedlist size: " + lList.getSize());
        System.out.println(" - get middle element: " + lList.getMiddleElement());

        System.out.println("lList.get(3) - get 3rd element: " + lList.getElement(3));
        System.out.println("lList.remove(2) - remove 2nd element: " + lList.removeElement(2));
        System.out.println("lList - print linkedlist: " + lList.toString());

        System.out.println("lList.get(3) - get 3rd element: " + lList.getElement(3));
        System.out.println("lList.size() - print linkedlist size: " + lList.getSize());
        System.out.println("lList - print linkedlist: " + lList.toString());
        System.out.println("3th node from end is : "+ lList.nthFromLastNode(3));  
        lList.reverseList();

    }
}
	 
