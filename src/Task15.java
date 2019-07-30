public class Task15 {
    public static void main(String args[]){
        int l = 1; // Задача 15
        for (l = 1; l < 100; l++) {
            System.out.println("l1=" + l);
        }
        while (l < 100) {
            System.out.println("l2=" + l);
            l++;
        }
        do {
            System.out.println("l3=" + l);
            l++;
        }
        while (l < 100);
     }
    }
