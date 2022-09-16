package practice5;

import java.util.Scanner;

public class Task1 {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;

        if (n<=1){
            return true;
        }

        if (s.charAt(i) == s.charAt(n - 1)) {
            i++;
            return isPalindrome(s.substring(i, n - 1));
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (isPalindrome(str)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
