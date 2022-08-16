package Com.company;

import java.util.ArrayList;

public class negative_elements_oneside {
    public static void segregateElements(int arr[], int n) {
        // Your code goes here
        ArrayList<Integer> pos = new ArrayList();
        ArrayList<Integer> neg = new ArrayList();

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < pos.size()) {
                arr[i] = pos.get(i);
            } else {
                arr[i] = neg.get(i - pos.size());
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n =8;
        segregateElements(arr,8);
        for (int e:arr) {
            System.out.print(e+",");
        }
    }
}
