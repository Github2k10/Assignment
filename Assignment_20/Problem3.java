package Assignment_20;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(helper("acdxbexdfxxefj"));
    }

    public static String helper(String str){
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] == 'x'){
                    char c = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = c;
                }
            }
        }

        return new String(arr);
    }
}
