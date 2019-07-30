public class Task11 {
    public static void main(String args[]) {
        int b = 2; // Задача 11
        int n = 9;
        int m = 7;
        if (b == n || n == m || b == m) ;
        else if (b > n && b > m) {
            System.out.println("больше" + b);
        } else if (n > b && n > m) {
            System.out.println("больше" + n);
        } else if (m > b && m > n) {
            System.out.println("больше" + m);
        }
    }
}