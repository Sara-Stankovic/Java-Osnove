package JavaOsnove;
// Ispisati proizvod prvih n celih brojeva [1, n].

import java.util. Scanner;

public class ProizvodCelihBrojeva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int proizvod = 1;

        for (int i = 1; i <= n; i++) {
            proizvod = proizvod * i;
        }
        System.out.println(proizvod);
    }
}