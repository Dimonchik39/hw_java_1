// Напечатать строку source repeat раз.

public class hw_task_3 {
    public static void main (String[] args){
        System.out.println(printString("ку ку", 5));
    }

    private static String printString(String source, int repeat) {
        String text_repeat = "";
            for (int i=0; i<repeat; i++) {
                text_repeat += source;
            }
            return text_repeat;
    }
}
