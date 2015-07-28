package Test;

public class LinkedList1 {
  
  private Node head;
  private int count;
  
  public LinkedList1(){
	  head = new Node(null);
	  count = 0;
  }
	
  //Add element to the end of the list
  public void add(String data){
	  Node temp = new Node(data);
	  Node current = head;
	  while(current.getNext() != null){
		  current = current.getNext();
	  }
	  current.setNext(temp);
	  count ++;
  }
  
  // Add at given index
  public void addAtIndex(String data, int index){
	  Node temp = new Node(data);
	  Node current = head;
	  for (int i=1; i<index && current.getNext() != null ;i++){
		  current = current.getNext();
	  }
	  // current now points to the given index position
	  temp.setNext(current.getNext());
	  current.setNext(temp);
	  count ++;
  }
  
  
  // Get element at index
  public String getElement(int index){
	  String s = null;
	  if (index <= 0){
		  return s;
	  }
	  Node current = head.getNext();

	  for (int i=1; i<index  ;i++){
		  if (current.getNext() == null)
              return null;
		  current = current.getNext();
	  }
	  // current now points to the given index position
	  s = current.getData();
	  return s;
  }
  
  // Remove element at index
  public boolean removeElement(int index){
	  Node current = head;
	  if (index < 1 || index > getSize()){
		  return false;
	  }
	
	  for (int i=1; i<index ;i++){	  
		  if (current.getNext() == null){
			  return false;
		  }
		  current = current.getNext();
	  }
	  // current now points to the given index position
	  // setting to next next 
      current.setNext(current.getNext().getNext());
	  count --;
	  return true;
  }
  
  // Find middle element
  
  public String getMiddleElement(){
	  Node current = head;
	  Node middle = head;
	  int length = 0;
	  while (current.getNext() != null){
		  length ++;
		  
		  if (length %2 ==0){
			  middle = middle.getNext();
		  }
		  current = current.getNext();	  		  
	  }
	  if (length % 2 ==1){
		  middle = middle.getNext();
	  }
	  return middle.getData();
  }
  
  // Get nth elemend from end of linekd list
  
  public String nthFromLastNode(int n)  
  {  
   Node firstPtr=head;  
   Node secondPtr=head;  
     
   for (int i = 0; i < n-1; i++) {  
    firstPtr=firstPtr.getNext();  
      
   }  
     
   while(firstPtr.getNext()!=null)  
   {  
    firstPtr=firstPtr.getNext();  
    secondPtr=secondPtr.getNext();  
   }  
     
   return secondPtr.getData();  
  }  

  
  
  //to Print
  public String toString() {
      Node current = head.getNext();
      String output = "";
      while (current != null) {
          output += "[" + current.getData().toString() + "]";
          current = current.getNext();
      }
      return output;
  }
  
  // Find length
  public int getLength(){
	  Node current = head;
	  int i = 0;
	  while(current.getNext() != null){
		  current = current.getNext();
		  i++;
	  }
	  return i;
  }
  
  // Reverse a linked list
  public void reverseList(){

	  if (head.getNext() == null) {
          return;
      }
      Node current = head;
      Node after = head.getNext();
      while (after != null) {
          Node tmp = after.getNext(); // preserve what will come later.
          after.setNext(current);  // reverse the pointer
          current = after;       // advance the cursor
          after = tmp;           // the node after is the one preserved earlier.
      }
      head.setNext(null);         // null-out next on what was the start element 
      head = current;
      
      Node newList = head;
      String output = "";
      while (newList.getNext() != null) {
	          output += "[" + newList.getData().toString() + "]";
	          newList = newList.getNext();
      }
      System.out.println("REversed List " +output);
  }
  
  
  public String binaryAddition(String s1, String s2){

	    int len1 = s1.length();
	    int len2 = s2.length();
	    
	    int max = Math.max(len1, len2);
	    StringBuilder sb = new StringBuilder("");
	    
	    int carry = 0;
	    
	    for(int i=0; i < max; i++){
	        int m = getBit(s1, len1 - i - 1);
	        int n = getBit(s2, len2 - i -1);
	        int add = m + n + carry;
	        sb.append(add % 2);
	        carry = add / 2 ;
	     }
	     if (carry ==1){
	        sb.append("1");
	     }
	        
	    return sb.reverse().toString();

	}


	public int getBit(String s, int index){
	    if (index < 0 || index >=s.length()){
	       return 0;
	    }
	    if (s.charAt(index) == '0'){
	      return 0;
	    }
	    else { 
	      return 1;
	    }

	}

  
  public int getSize(){
	  return count;
  }
	
  private class Node {
	  private Node next;
	  private String data;
	  
	  public Node(String data){
		  next = null;
		  this.data = data;
	  }

	public void setData(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return next;
	}
  }
	
	
}