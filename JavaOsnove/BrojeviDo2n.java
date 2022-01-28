package JavaOsnove;
// Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

import java.util. Scanner;

public class BrojeviDo2n {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = -14; i <= 2 * n; i++) {
            System.out.println(i);
        }

    }
}