//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            
            String input_line[] = br.readLine().trim().split("\\s+");
            int[][] matrix = new int[n][n];
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; ++j) {
                    matrix[i][j] = Integer.parseInt(input_line[i * n + j]); 
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.antiDiagonalPattern(matrix);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
       int n = matrix.length;
       int res[] = new int[n * n];
       HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
               if(map.containsKey(i + j)) {
                   List<Integer> list = map.get(i + j);
                   list.add(matrix[i][j]);
                   map.put((i + j), list);
               }
                else {
                    List<Integer> list = new ArrayList();
                    list.add(matrix[i][j]);
                    map.put((i + j), list);
                }
            }
        }
       int i = 0;
        for(List<Integer> list : map.values()) {
            for(int num : list) {
                res[i++] = num;
            }
        }
        return res;
    }
}