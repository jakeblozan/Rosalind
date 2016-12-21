import java.util.*;
import java.io.*;

/**
 * Write a description of class TranslatingRNAintoProtein here.
 * 
 * @author (Jake Blozan) 
 * @version (12/13/16)
 */
public class TranslatingRNAintoProtein
{
    public static void main(String[] args) throws IOException {
        Scanner data = new Scanner(new File("rosalind_prot.txt"));
        Scanner tableScan = new Scanner(new File("table.txt"));
        System.out.println("Fetching data...");
        String[] tableInit = new String[128];
        for (int i = 0; i < 128; i++) {
            tableInit[i] = tableScan.next();
        }
        boolean yesNoRNA = true;
        String[] RNA = new String[64];
        int which = 0;
        for (int i = 0; i < 128; i++){
            if (yesNoRNA) {
                RNA[which] = tableInit[i];
                which++;
            }
            yesNoRNA = !yesNoRNA;
        }
        boolean yesNoProtein = false;
        String[] proteins = new String[64];
        which = 0;
        for (int i = 0; i < 128; i++){
            if (yesNoProtein) {
                proteins[which] = tableInit[i];
                which++;
            }
            yesNoProtein = !yesNoProtein;
        }
        String allData = data.next();
        int codons = allData.length() / 3;
        String[] dataArray = new String[codons];
        which = 0;
        for (int i = 0; i < codons; i++) {
            dataArray[i] = "";
        }
        for (int i = 0; i < codons; i++) {
            for (int q = 0; q < 3; q++) {
                dataArray[i] += Character.toString(allData.charAt(which));
                which++;
            }
        }
        String[] translated = new String[codons];
        for (int i = 0; i < codons; i++) {
            for (int q = 0; q < 64; q++) {
                if (dataArray[i].equals(RNA[q])) {
                    translated[i] = proteins[q];
                }
            }
        }
        String result = "";
        for (int i = 0 ; i < codons; i++) {
            result += translated[i];
        }
        System.out.println(Arrays.toString(dataArray));
        System.out.println(result);
    }
}