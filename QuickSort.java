package Sorting;
public class QuickSort {
    // Quick Sort

    // Algo used - sbse phle hum middle element ko pivot element lege
    // phir uss pivot element ke left me un elements ko swap kr dege jo pivot element se chhote hoge
    // phir phir uss pivot element ke right me un elements ko swap kr dege jo pivot element se bade hoge
    // or is process ko baar baar follow krege jb tk pura array sort nhi ho jata.

    public static void main(String[] args) {

        int arr[] = {1,5,3,70,4,30,9,2,4};
        int len = arr.length;

        quickSortRecursion(arr,0,len-1);

        for(int i=0; i<len; i++){
            System.out.print(arr[i] + " ");
        }

    }

   /* static int partition(int arr[], int low, int high){
        int pivot = arr[(low + high)/2];

        while(low<=high){

            while(arr[low]< pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }

            if(low<=high){                          //swaping to sort left and right side

                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    static void quickSortRecursion(int arr[], int low, int high){


        int pi = partition(arr, low, high);                 //here we are calling partition method to get the lower index and storing that lower index in pi

        if(low<pi-1){                                       //yha index change kr ke hum quickSortRecursion method ko call kr rhe h same waise hi jais ehum binary search me krte h
            quickSortRecursion(arr, low, pi-1);
        }

        if(pi<high){
            quickSortRecursion(arr, pi, high);
        }
    }*/

    static int partition(int arr[], int left, int right){
        int pivot = arr[left + (right-left)/2];

        while(left<=right){
            while(arr[left]<pivot){
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }

            if(left<=right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return left;
    }

    static void quickSortRecursion(int arr[], int left, int right){
        int pi = partition(arr, left, right);

        if(left<pi-1){
            quickSortRecursion(arr, left, pi-1);
        }
        if(right>pi){
            quickSortRecursion(arr, pi, right);
        }
    }
}
