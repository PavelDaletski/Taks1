public class Task3 {
    public static void main (String args[]) {
        int[] a = {1, 2, 3, 5, 4, 3, 2, 1};
        boolean isPolindrom = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - i - 1]) {
                isPolindrom = false;
                break;
            }
        }
        System.out.println(isPolindrom ? "Это полиндром " : " Это не полиндром");
    }
}
