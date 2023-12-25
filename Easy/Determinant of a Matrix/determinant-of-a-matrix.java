//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                  matrix[i][j] =sc.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.determinantOfMatrix(matrix, n));
        }
    }
}
// } Driver Code Ends




class Solution
{
    
    static int[][] getSubMatrix(int matrix[][], int p, int q) {
        int n = matrix.length;
        int subMatrix[][] = new int[n - 1][n - 1];
        for(int i = 0, p1 = 0; i < n; i++) {
            if(i == p) {
                continue;
            }
            for(int j = 0, p2 = 0; j < n; j++) {
                if(j == q) {
                    continue;
                }
                subMatrix[p1][p2] = matrix[i][j];
                p2++;
            }
            p1++;
        }
        return subMatrix;
    }
    static int determinantOfMatrix(int matrix[][], int n)
    {
       if(n == 1) {
           return matrix[0][0];
       }
       int det = 0;
       for(int i = 0; i < n; i++) {
           int cofactor = matrix[0][i] * determinantOfMatrix(getSubMatrix(matrix, 0, i), n - 1);
           det += (i % 2 == 0) ? cofactor : -cofactor;
       }
       return det;
    }
}

