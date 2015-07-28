package Test;

import java.util.Stack;

public class QueueUsingStacks {
	
    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();
    
    public void push(int n){
    	s1.push(n);
    }
    
    public int pop(){
    	if(s2.isEmpty()){
	    	while(!s1.isEmpty()){
	    		s2.push(s1.pop());
	    	}
	    	//return s2.pop();
    	} 
    	return s2.pop();
    }
   
    public static void main (String[] args){
    	QueueUsingStacks ns = new QueueUsingStacks();
    	ns.push(1);
    	ns.push(2);
    	System.out.println(ns.pop());
    	ns.push(3);
    	ns.push(4);
    	System.out.println(ns.pop());	
    }
  

}
