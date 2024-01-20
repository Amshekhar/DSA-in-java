package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        //bubble sort
        //algorithem used - ek element or dusre element ke sath compare krte hai or jo element bda hota hai usko last me shift kr dete hai.
        //time complexity - O(n^2) coz double nasted loop used.


        int arr[] = {36,1,2,3,5,6};

        //int k = 3;

        /*for(int i=0; i<arr.length; i++){

            int flag = 0;    //hum yha pr flag use krege taki agr array ek baar me hi sort ho jaye to hume baar baar faltu me outer loop na chlana pde

            for(int j=0; j<arr.length-1-i; j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }

            }
            System.out.println(flag);
            if(flag==0){
                break;
            }
        }*/

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //int kthElement = arr.length-k;

        //System.out.print(arr[kthElement]);
    }
}
