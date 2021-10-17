package BDZ;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line = in.nextInt(), st = in.nextInt();
        for (int i=1; i<st+1; i++){
            tab(i, line);
        }
    }

    public static void tab(int st, int line) {
        int[] array = new int[line];
        for (int i=0; i<line; i++){
            System.out.print((i+1)*st+" ");
        }
        System.out.println();
    }
}
