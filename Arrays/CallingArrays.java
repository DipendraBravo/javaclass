package Arrays;

public class CallingArrays {
    public static void main(String[] args) {
        int a[] ={10,20,30,40,50};
        //Iteration for, while, do-while, foreach
        for(int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();

        for(int i = a.length-1; i >= 0 ; i--){
            System.out.println(a[i]);
        }
        System.out.println(        );

        int j=0;
        while(j<5){
            System.out.println(a[j]);
            j++;
        }
        System.out.println();

        int k = 0;
        do{
            System.out.println(a[k]);
            k++;
        }while(k<5);

        System.out.println("For each");
        for (int i:a){
            System.out.println(i);
        }
    }
}
