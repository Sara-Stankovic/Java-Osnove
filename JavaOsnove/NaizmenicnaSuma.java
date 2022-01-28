package Domaci3;
/*Korisnik unosi vrednost broja n (int) sa konzole. Na standardni izlaz ispisati resenje izraza:
1 - 2 + 3 - .... (+/-) n.*/

import java.util. Scanner;

public class NaizmenicnaSuma {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n= sc.nextInt();
            int sum=0;

            for(int i=1;i<=n;i++) {

                if(i%2==0) {
                    sum-=i;
                }
                else sum+=i;
            }
            System.out.println(sum);

        }
    }
