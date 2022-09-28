package practice7;

import java.util.Scanner;
import java.util.Stack;

public class StackGameDrunk {
    public static void howWinner(Stack<Integer> pl1, Stack<Integer> pl2) {
        int count1 = 0;
        int count2 = 0;
        System.out.println(pl1.isEmpty());
        while (!pl1.isEmpty() || !pl2.isEmpty()) {
//            System.out.println(0);
            System.out.println(pl1 + "            " + pl2);

            if (pl1.peek() > pl2.peek()) {
                if (pl1.peek() == 0 && pl2.peek() == 9) {
                    pl1.add(0, pl1.pop());
                    pl1.add(0, pl2.pop());
                    count1++;
                } else if (pl1.peek() == 9 && pl2.peek() == 0) {
                    pl2.add(0, pl2.pop());
                    pl2.add(0, pl1.pop());
                    count2++;
                } else {
                    pl1.add(0, pl1.pop());
                    pl1.add(0, pl2.pop());
                    count1++;
                }

            } else {
                if (pl1.peek() == 0 && pl2.peek() == 9) {
                    pl1.add(0, pl1.pop());
                    pl1.add(0, pl2.pop());
                    count1++;
                } else if (pl1.peek() == 9 && pl2.peek() == 0) {
                    pl2.add(0, pl2.pop());
                    pl2.add(0, pl1.pop());
                    count2++;
                } else {
                    pl2.add(0, pl2.pop());
                    pl2.add(0, pl1.pop());
                    count2++;
                }
            }
            if (pl1.isEmpty() || pl2.isEmpty()) {
                break;
            }
        }
        if (count1 > count2) {
            System.out.println("first " + count1);
           /* System.out.println(pl1);
            System.out.println(pl2);
            pl2.clear();
            System.out.println(pl1.size()+" "+ pl2.size());
            System.out.println(pl1);
            System.out.println(pl2);*/
        } else {
            System.out.println("second " + count2);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                int temp = scanner.nextInt();
                player1.push(temp);
            } else {
                int temp = scanner.nextInt();
                player2.push(temp);
            }
        }
        // System.out.println(player1);
        howWinner(player1, player2);
//        if(player1.peek()>player2.peek()){
//
//        }
    }
}
