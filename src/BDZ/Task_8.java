package BDZ;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), K = 2;
        while (K!=1){
            if (a%K==0){
                System.out.print(K);
                a = a/K;
                K = 1;

            }
            else K++;
        }
        K = 2;
        while (a!=1){
            if (a%K==0){
                System.out.print("*"+K);
                a = a/K;
                K = 2;

            }
            else K++;
        }
    }
}
