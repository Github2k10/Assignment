package Assignment_21;

public class InvertValue {
    public static int[] invert(int[] array) {
        for(int i = 0; i < array.length; i++){
          array[i] = array[i] * -1;
        }
    return array;
    }
}
