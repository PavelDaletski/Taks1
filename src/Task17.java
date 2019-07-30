public class Task17 {
    public static void main(String args[]){
        double[][] ints = { // Задача 17
                {16, 14, 5, 7},
                {10, 4, 8, 5}
        };
        double max = 0;
        for (double[] Anint : ints) {
            for (double i : Anint) {
                if (max < i) max = i;


                System.out.println("i" + i / max);
            }
        }
        System.out.println("max i" + max);
    }
    }
