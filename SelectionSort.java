package Sorting;
public class SelectionSort {
    //selection sort
    //Algo used - stating me phle element ko bda maan lete h
    //phir baaki bche huye elements me se sbse chhote element ke index ko kisi variable me store kr lete hai.
    //ab sbse chhote element ko phle element se swap kr dete hai.

    public static void main(String[] args) {
        int arr[] = {1,3,4,6,1,2,8,9};

        int min = 0;

        int n = arr.length;

      /*  for(int i=0; i<arr.length; i++){
            min = i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[min]){                //copying the index of smallest element
                    min = j;
                }
            }
            int temp = arr[min];                    //Swapping the smallest element with current element
            arr[min] = arr[i];
            arr[i] = temp;
        }*/

        for(int i=0; i<n; i++){
            min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
