package Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Program to generate n binary numbers *
 */

public class GenerateBinaryNumbers {

	public static void generateBinaryNum(int n){
		Queue<String> que = new LinkedList<String>();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();			

		que.add("1");
		for (int i =0; i < n; i ++){
			String s = que.poll();
			sb.append(s);
			System.out.println(sb.toString());
			//sb1.append(sb.toString());
			sb1.append(s);
			que.add(sb.append("0").toString());
			que.add(sb1.append("1").toString());
			sb.delete(0, sb.length());
			sb1.delete(0, sb1.length());
		}
	}
	
	public static void main(String[] args){
		int n = 8;
		generateBinaryNum(n);
	}

}
