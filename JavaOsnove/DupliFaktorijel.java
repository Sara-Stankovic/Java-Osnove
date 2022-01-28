package JavaOsnove;
//Napisati program koji racuna dupli faktorijel unetog broja n.

import java.util. Scanner;

public class DupliFaktorijel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dupliF = 1;


        for (int i = n; i > 0; i-=2) {
            dupliF *= i;
        }
        System.out.println(dupliF);
    }
}