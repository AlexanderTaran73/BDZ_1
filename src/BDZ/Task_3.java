package BDZ;
import java.lang.Math;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt(), sum = k;
        while (k!=0){
            k = in.nextInt();
            sum += k;
        }
        System.out.println(Math.floor(Math.sqrt(sum)));
    }
}
