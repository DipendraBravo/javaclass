package Arrays;

import java.util.Arrays;

public class AscendingArrayPractice {
    public static void main(String[] args) {
        int [] arr = {5,4,1,3,2};
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array in ascending order "+ Arrays.toString(arr));

        for(int i =0; i < n-1; i++){
            for (int j=0; j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array in descending order"+ Arrays.toString(arr));


    }
}
