package Test;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
	
	private Queue<Integer> q1 = new LinkedList<Integer>();
	private Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void enqueue(int n){
		q1.add(n);
	}
	
	public int dequeue(){
		int val = -1;
		while(!q1.isEmpty()){
			 val = q1.remove();
			if(!q1.isEmpty()){
				q2.add(val);
			}	
		}
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	    return val;
	}
	
	public static void main (String[] args){
		StackUsingQueues ns = new StackUsingQueues();
    	ns.enqueue(1);
    	ns.enqueue(2);
    	System.out.println(ns.dequeue());
    	ns.enqueue(3);
    	ns.enqueue(4);
    	System.out.println(ns.dequeue());	
    }


}
