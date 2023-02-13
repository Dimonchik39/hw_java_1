import java.util.Arrays;

// Задать целочисленный массив, состоящий из элементов 0 и 1.
// С помощью цикла и условия заменить 0 на 1, 1 на 0.

public class hw_task_7 {
    public static void main (String[] args) {
        int[] array = new int[]{0, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(replace_value(array)));
    }

    private static int[] replace_value(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
            else {
                array[i] = 0;
            }
        }
        return array;
    }
}
