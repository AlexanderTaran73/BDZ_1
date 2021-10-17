package BDZ;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        int k = 0;
        Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i*i <= n; i++) k = i;
    System.out.println(k);
    }
}
