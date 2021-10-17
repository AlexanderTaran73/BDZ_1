package BDZ;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int length = str.length();
        for (int i = 0; i<length/2; i++){
            if (str.charAt(i)!=str.charAt(length-i-1)){
                System.out.println("NO");
                System.exit(0);
            }
        }

        System.out.println("YES");
    }
}
