package Sorting;
public class InsertioSort {
    //insertion sort

    //logic - sbse phle hum ye assume krte hai ki 1st element apni shi position pr hai phir uss se next element ko 1st elem ko compare krte h
    //agr 2nd wala element 1st element se chhota hai to unko swap kr dete hai
    //in short - hr element ko compare krte h or jha element ki shi position milti h wha usko place kr dete hai.

    public static void main(String[] args) {
        int arr[] = {1,2,5,6,3,4};

        int n = arr.length;

        int temp = 0;

    /* for(int i=1; i<n; i++){

            temp = arr[i];          //sbse phle arr[i] ko temp me store krwa lenge jis se arr[i] ki position khali ho jayegi

            int j = i;              //ab ek j pointer lenge or wo i se start hoga

            while(j >=0 && arr[j-1] > temp){            //ek loop start krege usme compare krege ki j>0 && arr[j-1]>temp

                arr[j] = arr[j-1];                  //ydi dono conditon true hai to arr[j] wali jgh pr arr[j-1] ko put kr dege

                j--;                                //or phir j ko decrement kr dege
            }

            arr[j] = temp;                          //ydi arr[j] ke pichhe wala elem arr[j] se chhota h to arr[j] me temp ko put kr dege
        }*/

        for(int i=1; i<arr.length; i++){
            temp = arr[i];
            int j = i;
            while(j>=0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = temp;
        }

        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
