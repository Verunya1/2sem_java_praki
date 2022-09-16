package practice5;

import java.util.Scanner;

public class Task3 {
    public static int theShifter(int n, int i){
        return (n==0) ? i : theShifter( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(theShifter(n,0));
    }
}
