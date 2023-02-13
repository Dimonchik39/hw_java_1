import java.util.Arrays;

// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], 
// пройти по нему циклом, и числа меньшие 6 умножить на 2.

public class hw_task_8 {
    public static void main (String[] args) {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(change_value(array)));
    }

    private static int[] change_value(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }
}
