package practice5;

import java.util.Scanner;

public class Task2 {
    public static int f(int a, int b) {
        if (a > b +1)
            return 0;
        else if (a == 0 || b ==0)
            return 1;
        else return f(a - 1, b - 1) + f(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        System.out.println(f(a,b));
    }
}
