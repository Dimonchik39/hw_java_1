import java.util.Arrays;
import java.util.Random;

// Задать одномерный массив и найти в нем минимальный и максимальный элементы.

public class hw_task_10 {
    public static void main (String[] args) {
        Random r = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }         
        int max = array[0];
        int min = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);
    }
}