public class FindGivenArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2};
        if (arr[0]>arr[1]){
            System.out.println(sortedDescending(arr));
        }
        else
            System.out.println(sortedAscending(arr));
    }
    static int sortedDescending(int[] arr){
        int i = 0;
        int count = 0;
       while (i<arr.length-1) {
           if (arr[i] < arr[i + 1]){
               count+=1;
       }
           i++;
       }
       result(count);
       return count;
    }
    static int sortedAscending(int[] arr){
        int i = 0;
        int count = 0;
        while (i<arr.length-1) {
            if (arr[i] > arr[i + 1]){
                count+=1;
            }
            i++;
        }
        result(count);
        return count;
    }

    static void result(int value){
        if (value == 0)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not-sorted");
    }
}
