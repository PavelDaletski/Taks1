import java.util.Scanner;

public class Task18 {
        public static String main(int day) {
            return String.format("%d:%02d:%02d", day * 24, day *24*60, day*24*60*60);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while ( true ) {
                System.out.print("Введите количество дней: ");
                if ( ! scanner.hasNextInt() )
                    break;
                int day = scanner.nextInt();
                if ( day < 0 )
                    break;
                System.out.println("Human readable: " + main(day));
            }

            scanner.close();
        }
    }