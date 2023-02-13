// Проверить, является ли год високосным. Если да - return true.

public class hw_task_4 {
    public static void main (String[] args){
        System.out.println(isLeapYear(2040));
    }

    private static boolean isLeapYear(int year) {
        if (((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
            return true;
        }
        else {
            return false;
        }
    } 
}
