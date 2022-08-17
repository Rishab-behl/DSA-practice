package Com.company;

import java.util.ArrayList;

public class Array_0_1_2 {
    public static void sort012(int a[], int n) {
        int zero=0, one=0, two=0;
        for (int i=0; i<n; i++){
            if (a[i]==1){
                one++;
            }
            else if (a[i]==2){
                two++;
            }
            else{
                zero++;
            }
        }
        for (int i=0; i<n; i++){
            if (i<n-one-two){
                a[i]=0;
            }
            else if (i<n-two){
                a[i]=1;
            }
            else{
                a[i]=2;
            }
        }
    }

    public static void main(String[] args) {
        int a[]= {0,2,1,2,0};
        sort012(a,5);
        for (int e:a) {
            System.out.print(e + ",");
        }
    }

}
