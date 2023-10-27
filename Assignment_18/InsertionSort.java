import java.util.*;

public class InsertionSort
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements of array: ");
		int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int count = insertionSort(arr);
		System.out.println("Number of shif required: " + count);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		sc.close();
	}
	
	private static int insertionSort(int[] arr){
	    int n = arr.length;
		int c = 0;
		
		for(int i = 0; i < n; i++){
		    int key = arr[i];
		    int j = i - 1;
		    
		    while(j >= 0 && arr[j] > key){
		        arr[j + 1] = arr[j];
		        j--;
				c++;
		    }
		    
		    arr[j + 1] = key;
		}

		return c;
	}
}
