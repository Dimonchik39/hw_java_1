// Проверить, что х положительное.

public class hw_task_2 {
    public static void main (String[] args){
        System.out.println(isPositive(-1));
    }

    private static boolean isPositive(int x) {
        if (x>=0) {
            return true;
        }
        else {
            return false;
        }
    }
}
