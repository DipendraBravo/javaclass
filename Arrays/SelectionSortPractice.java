package Arrays;

import java.util.Arrays;

public class SelectionSortPractice {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2,6};
        int n= arr.length;
        int small;
        for(int i =0;i<n-1;i++ ){
            small=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;

        }
        System.out.println("The array selection sort"+ Arrays.toString(arr));
    }
}
