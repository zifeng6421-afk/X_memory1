package EightSort;

public class ShellSory {
    public static void main(String[] args) {
        int[] arr= new int[10];
        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                int temp=arr[i];
                int j=i;
                while(j-gap>=0 && arr[j-gap]>temp){
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=temp;
            }
        }
    }
}
