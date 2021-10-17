package BDZ;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = Integer.toBinaryString(in.nextInt()), b = Integer.toBinaryString(in.nextInt()), a1 = "", b1 = "", per = "0", c1="", c2="";
        while (a.length()!=32) a="0"+a;
        while (b.length()!=32) b="0"+b;
        for (int i = 0; i <= 31; i++) {
            a1 = Character.toString(a.charAt(31-i));
            b1 = Character.toString(b.charAt(31-i));

            if (a1.equals(b1)) c1 = "0";
            else  c1 = "1";


            if (c1.equals(per)) c2 = "0"+c2;
            else  c2 = "1"+c2;

            if ((a1.equals("1") && b1.equals("1"))||(c1.equals("1") && per.equals("1"))) {
                per = "1";
            } else {
                per = "0";
            }
        }
        System.out.println(Integer.parseInt(c2, 2));
    }
}
//не понял как перевести если результат <0