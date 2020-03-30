import java.util.Scanner;

public class Random {
    private static Object Scanner;

    public static void main(String[] args) {
        int n, arrg[];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        arrg = new int[n];
        for (int i = 0; i < arrg.length; i++)
            arrg[i] = (int) (Math.random() * n);
        for (int i : arrg)
            System.out.print(i + " ");
    }

}
