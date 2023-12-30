//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        String s = "";
        int max = 0;
        for (Map.Entry<String, Integer> mp : map.entrySet()) {
            String t1 = mp.getKey();
            int t2 = mp.getValue();
            if (t2 > max || (t2 == max && t1.compareTo(s) < 0)) {
                max = t2;
                s = t1;
            }
        }
        String res[] = {s, Integer.toString(max)};
        return res;
    }
}

