package EightSort;

import java.util.Collection;
import java.util.Collections;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr=new int[1];
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length-1-i;i++){
                if(arr[i]>arr[j]){
                    swap(arr,arr[i],arr[i+1]);
                }
            }
        }
    }
}
