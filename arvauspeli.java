package Versionhallinta;
import java.util.Scanner;

public class arvauspeli {
    public static void main(String[] args) {
        String nimi = "Ada";
        int arvauksia = 0;
        int maxYritykset = 5;
        Scanner scanner = new Scanner(System.in);

        while (arvauksia < maxYritykset) {
            System.out.print("Arvaa nimi (tai kirjoita 'loppu' lopettaaksesi pelin): ");
            String arvaus = scanner.nextLine();
            arvauksia++;

            if (arvaus.equalsIgnoreCase("loppu")) {
                System.out.println("Peli loppui. Et arvannut nimeä.");
                break;
            }
            else if (arvaus.equals(nimi)) {
                System.out.println("Onneksi olkoon! Arvasit oikein " + arvauksia + ". yrityksellä.");
                break;
            }
            else if (arvauksia == maxYritykset) {
                System.out.println("Yritykset loppuivat! Oikea nimi oli: " + nimi);
            }
            else {
                System.out.println("Väärin! Yritä uudestaan.");
            }
        }
        scanner.close();
    }
}
