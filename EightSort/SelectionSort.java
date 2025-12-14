package EightSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] <arr[min]){
                    min=j;
                }
            }
            swap(arr[min],arr[i]);
        }
    }
}
