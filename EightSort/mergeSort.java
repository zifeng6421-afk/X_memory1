package EightSort;

public class mergeSort {


    public static void merge2(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)>>1;
        merge2(arr,l,mid);
        merge2(arr,mid+1,r);
        merge(arr,l,mid,r);
    }


    public static void merge(int[] arr,int l,int mid,int r){
        int[] temp=new int[r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=r){
            temp[k++]=arr[i]>arr[j]? arr[i++]:arr[j++];
        }
        while(i<=mid){arr[k++]=arr[i++];}
        while(j<=r){arr[k++]=arr[j++];}
        System.arraycopy(temp,0,arr,l,temp.length);

    }
}

