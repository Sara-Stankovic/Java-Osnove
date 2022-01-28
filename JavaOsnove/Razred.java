package JavaOsnove;
/* Korisnik unosi ime, prezime i godinu rodjena. Ispisati: "Dobrodosao u {x}. razred, {ime} {prezime}",
pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
poruku od: "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje" */

import java.util. Scanner;

public class Razred {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime= sc.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = sc.nextLine();
        System.out.print("Unesite godinu rodjenja: ");
        int godina = sc.nextInt();

        int god = 2021-godina;
        int razred = -6 + god;

        if (razred>=1 && razred<=12) {
            System.out.println("Dobrodosao u "+ god + ". razred, "+ ime + " "+ prezime + ".");
        } else if (razred < 1) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje.");
        } else if (razred>12) {
            System.out.println(ime + " " + prezime + " je zavrsio skolu.");
        }

    }
}