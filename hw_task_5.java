import java.util.Arrays;

// Должен вернуть массив длины len, каждое значение которого равно initialValue.

public class hw_task_5 {
    public static void main (String[] args){
        int len = 12;
        int initialValue = 8;
        int[] array = new int[len];
        createArray(array, len, initialValue);
        System.out.println(Arrays.toString(array));
    }

    private static int[] createArray(int[] array, int len, int initialValue) {
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;               
        }
        return array;
    }
}
