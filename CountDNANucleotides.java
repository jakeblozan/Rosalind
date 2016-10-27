import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Write a description of class CountDNANucleotides here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountDNANucleotides
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("rosalind_dna.txt"));
        System.out.println("Fetching data...");
        String input = scan.next();
        int length = input.length();
        int As = 0;
        int Cs = 0;
        int Gs = 0;
        int Ts = 0;
        for (int i = 0; i < length; i++) {
            char x = input.charAt(i);
            if (x == 'A') {
                As++;
            }
            if (x == 'C') {
                Cs++;
            }
            if (x == 'G') {
                Gs++;
            }
            if (x == 'T') {
                Ts++;
            }
        }
        System.out.println(As + " " + Cs + " " + Gs + " " + Ts);
    }
}
