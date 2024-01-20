package Sorting;
public class MergeSort {
/*public class Main {
    //merge sort
    //algo - tb tk todo jb tk tukde tukde na ho jaye
    //phir compare kr ke jod do or new array me copy kr do

    public static void conqure(int arr[], int left, int mid, int right){

        int newArr[] = new int[right-left+1];

        int index1 = left;
        int index2 = mid+1;
        int x = 0;

        while(index1 <= mid && index2 <= right){

            if(arr[index1] <= arr[index2]){
                newArr[x++] = arr[index1++];

            }else{
                newArr[x++] = arr[index2++];
            }

        }
        while(index1 <= mid){
            newArr[x++] = arr[index1++];
        }

        while(index2 <= right){
            newArr[x++] = arr[index2++];
        }

        for(int i=0, j=left; i<newArr.length; i++, j++){
              arr[j] = newArr[i];
        }
    }

    public static void devide(int arr[], int left, int right){
        if(left >= right){
            return;
        }
        int mid = left + (right-left)/2;

        devide(arr, left, mid);
        devide(arr, mid+1, right);

        conqure(arr, left, mid, right);
    }

    public static void main(String[] args) {
        int arr[] = {12,1,24,34,6,56,13,25};

        devide(arr, 0, arr.length-1);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

}*/
    public static void main(String[] args){
        int arr[] = {9,8,7,4,5,6,1,2,3};
        devide(arr, 0, arr.length-1);

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
    static void devide(int arr[], int left, int right){
        int mid = left + (right-left)/2;

        if(left>=right){
            return;
        }

        devide(arr, left, mid);
        devide (arr, mid+1, right);

        conqure(arr, left, mid, right);
    }
    static void conqure(int arr[], int left, int mid, int right){
        int index1 = left;
        int index2 = mid +1;
        int x = 0;
        int newArr[] = new int[right-left+1];

        while(index1 <= mid && index2 <= right){
            if(arr[index1] <= arr[index2]){
                newArr[x++] = arr[index1++];
            }else{
                newArr[x++] = arr[index2++];
            }
        }
        while(index1<=mid){
            newArr[x++] = arr[index1++];
        }
        while(index2 <= right){
            newArr[x++] = arr[index2++];
        }

        for(int i=0, j=left; i<newArr.length; i++, j++){
            arr[j] = newArr[i];
        }
    }
}
