// Найти общий префикс среди слов из одного массива.

public class hw_task_6 {
    public static void main (String[] args){
        String[] array = new String[]{"aaa", "aab", "aa", "aabc", "aaaaag"};
        System.out.println(findCommonPrefix(array));
    }

    private static String findCommonPrefix(String[] source) {
        String prefix = source[0];
        if (source.length == 0) {
            return "";
        }
        if (source.length == 1) {
            return source[0];
        }
        for (var str: source) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;       
    }
}
