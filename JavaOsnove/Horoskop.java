package JavaOsnove;
// Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

import java.util. Scanner;

public class Horoskop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi mesec: ");
        String mesec = sc.nextLine();
        System.out.print("Unesi dan: ");
        int dan = sc.nextInt();

        if (mesec.equals("Januar")) {
            if (dan>=21) {
                System.out.println("Vodolija");
            } else {
                System.out.println("Jarac");
            }
        } else if (mesec.equals("Februar")) {
            if (dan>=20) {
                System.out.println("Ribe");
            } else {
                System.out.println("Vodolija");
            }
        } else if (mesec.equals("Mart")) {
            if (dan >= 21) {
                System.out.println("Ovan");
            } else {
                System.out.println("Ribe");
            }
        } else if (mesec.equals("April")) {
            if (dan >= 21) {
                System.out.println("Bik");
            } else {
                System.out.println("Ovan");
            }
        } else if (mesec.equals("Maj")) {
            if (dan >= 21) {
                System.out.println("Blizanci");
            } else {
                System.out.println("Bik");
            }
        } else if (mesec.equals("Jun")) {
            if (dan >= 21) {
                System.out.println("Rak");
            } else {
                System.out.println("Blizanci");
            }
        } else if (mesec.equals("Jul")) {
            if (dan >= 22) {
                System.out.println("Lav");
            } else {
                System.out.println("Rak");
            }
        } else if (mesec.equals("Avgust")) {
            if (dan >= 24) {
                System.out.println("Devica");
            } else {
                System.out.println("Lav");
            }
        } else if (mesec.equals("Septembar")) {
            if (dan >= 24) {
                System.out.println("Vaga");
            } else {
                System.out.println("Devica");
            }
        } else if (mesec.equals("Oktobar")) {
            if (dan >= 24) {
                System.out.println("Skorpija");
            } else {
                System.out.println("Vaga");
            }
        } else if (mesec.equals("Novembar")) {
            if (dan >= 23) {
                System.out.println("Strelac");
            } else {
                System.out.println("Skorpija");
            }
        } else if (mesec.equals("Decembar")) {
            if (dan >= 22) {
                System.out.println("Jarac");
            } else {
                System.out.println("Strelac");
            }
        }
    }
}