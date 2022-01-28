package JavaOsnove;
// Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].

import java.util. Scanner;

public class SumaIntervala {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int suma = 0;

        for (int i = m; i <= n; i++) {
            suma += i;
        }
        System.out.println(suma);

    }
}