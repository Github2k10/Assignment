package Assignment_22;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {3, -2, 4, 1, -6, 3, 7, -9, 8};
        int sum = 0;

        mergeSort(0, arr.length - 1, arr);
        for(int i = arr.length - 1; i >= 0; i--){
            if(sum + arr[i] > sum) sum += arr[i];
        }
        
        System.out.println("Maximum sum of a subarray in the array: " + sum);
    }

    private static void mergeSort(int s, int e, int[] arr){
        if(s < e){
            int m = s + (e - s)/2;

            mergeSort(s, m, arr);
            mergeSort(m + 1, e, arr);
            merge(s, m, e, arr);
        }
    }

    private static void merge(int s, int m, int e, int[] arr){
        int[] out = new int[e - s + 1];
        int i = s, j = m + 1, k = 0;

        while(i <= m  || j <= e){
            if(i <= m && j <= e){
                if(arr[i] < arr[j]){
                    out[k++] = arr[i++];
                } else {
                    out[k++] = arr[j++];
                }
            } else if(i <= m){
                out[k++] = arr[i++];
            } else {
                out[k++] = arr[j++];
            }
        }

        k = 0;
        for(int a = s; a <= e; a++){
            arr[a] = out[k++];
        }
    }
}
