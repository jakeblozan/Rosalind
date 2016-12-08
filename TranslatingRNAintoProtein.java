import java.util.*;
import java.io.*;

/**
 * Write a description of class TranslatingRNAintoProtein here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TranslatingRNAintoProtein
{
    public static void main(String[] args) throws IOException {
        Scanner data = new Scanner(new File("practice.txt"));
        Scanner tableScan = new Scanner(new File("table.txt"));
        System.out.println("Fetching data...");
        String[] table = new String[64];
        for (int i = 0; i < 64; i++) {
            table[i] = tableScan.nextLine();
        }
        String allData = data.next();
        int codons = allData.length() / 3;
        System.out.println(allData);
        System.out.println(allData.length());
        System.out.println(codons);
    }
}
