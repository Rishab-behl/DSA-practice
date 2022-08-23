package Com.company;
import java.util.*;
public class Union_array {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> hs = new HashSet();
        for(int i=0; i<n; i++){
            hs.add(a[i]);
        }
        for(int j=0; j<m; j++){
            hs.add(b[j]);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3};
        int n = 5;
        int m = 3;
        Union_array obj = new Union_array();
        int s = obj.doUnion(a,n,b,m);
        System.out.println(s);
    }
}
