package Test;

import java.util.Stack;

public class GraphDFS {

	public static void bfs1(int[][] m, int nodes){
		Stack<Integer> q = new Stack<Integer>();

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

	         nextNode = q.peek();

	         if (visited[nextNode] == 0 )
	         {
	            visited[nextNode] = 1;    // Mark node as visited
	            System.out.println("nextNode = " + nextNode );

	            for ( i = 0; i < NNodes; i++ )
	               if ( m[nextNode][i] > 0 && visited[i] ==0 )
	                  q.push(i);
	         } else {
	        	 q.pop();
	         }
	      }
	}
	
	public static  int getUnvisitedChildNode(int n, int NNodes, int[][]m, int[] visited)
	   {
	      int j;

	      for ( j = 0; j < NNodes; j++ )
	      {
		 if ( m[n][j] > 0 )
	         {
		    if ( visited[j]!=1 )
	               return(j);
	         }
	      }

	      return(-1);
	   }

 
	
	public static void main(String[] args){
	  int m[][] = {{0, 1, 0, 1},
			  	   {0, 0, 1, 0 },
			       {0, 1, 0, 1},
			       {0, 0, 0, 1}};
	  int p[][] = {  { 0, 1, 0, 1, 0, 0, 0, 0, 1 },  // 0
              { 1, 0, 0, 0, 0, 0, 0, 1, 0 },  // 1        
              { 0, 0, 0, 1, 0, 1, 0, 1, 0 },  // 2
              { 1, 0, 1, 0, 1, 0, 0, 0, 0 },  // 3
              { 0, 0, 0, 1, 0, 0, 0, 0, 1 },  // 4
              { 0, 0, 1, 0, 0, 0, 1, 0, 0 },  // 5
              { 0, 0, 0, 0, 0, 1, 0, 0, 0 },  // 6
              { 0, 1, 1, 0, 0, 0, 0, 0, 0 },  // 7
              { 1, 0, 0, 0, 1, 0, 0, 0, 0 } };
	  
	  //bfs1(p,9);
	  bfs1(m,4);

	  
	}

}



