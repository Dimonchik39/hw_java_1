// Создать квадратный двумерный целочисленный массив (количество строк 
// и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
// элементы единицами (можно только одну из диагоналей, если обе сложно).

public class hw_task_9 {
    public static void main (String[] args) {
        int[][] array = new int [5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i] == array[j]) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }       
    }
}
