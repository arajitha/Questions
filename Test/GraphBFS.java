package Test;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

	
	public static void bfs1(int[][] m, int nodes){
		Queue<Integer> q = new LinkedList<Integer>();

		int NNodes = nodes;
		int[] visited = new int[NNodes];
		//for(int i = 0 ; i < nodes-1; i++){
		//	visited[i] = 0;
		//}
		q.add(0);
		//visited[source] = 1;
		 while( ! q.isEmpty() )
	      {
	         int nextNode;                // Next node to visit
	         int i;

	         nextNode = q.remove();

	         if (visited[nextNode] == 0 )
	         {
	            visited[nextNode] = 1;    // Mark node as visited
	            System.out.println("nextNode = " + nextNode );

	            for ( i = 0; i < NNodes; i++ )
	               if ( m[nextNode][i] > 0 && visited[i] ==0 )
	                  q.add(i);
	         }
	      }
	}

 
	
	public static void main(String[] args){
	  int m[][] = {{0, 1, 0, 1},
			  	   {0, 0, 1, 0 },
			       {0, 1, 0, 1},
			       {0, 0, 0, 1}};
	  int p[][] = {  
			  { 0, 1, 0, 1, 0, 0, 0, 0, 1 },  // 0
              { 1, 0, 0, 0, 0, 0, 0, 1, 0 },  // 1        
              { 0, 0, 0, 1, 0, 1, 0, 1, 0 },  // 2
              { 1, 0, 1, 0, 1, 0, 0, 0, 0 },  // 3
              { 0, 0, 0, 1, 0, 0, 0, 0, 1 },  // 4
              { 0, 0, 1, 0, 0, 0, 1, 0, 0 },  // 5
              { 0, 0, 0, 0, 0, 1, 0, 0, 0 },  // 6
              { 0, 1, 1, 0, 0, 0, 0, 0, 0 },  // 7
              { 1, 0, 0, 0, 1, 0, 0, 0, 0 } };
	  
	  bfs1(p,9);
	 // bfs1(m,4); // 0 1 3 2 

	  
	}

}
