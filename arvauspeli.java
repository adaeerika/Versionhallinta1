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
        }
    }
}
