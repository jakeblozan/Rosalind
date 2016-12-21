import java.util.*;
import java.io.*;

/**
 * Write a description of class FindingaMotifinDNA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindingaMotifinDNA
{
    public static void main (String[] args) throws IOException {
        Scanner scan = new Scanner(new File("rosalind_subs.txt"));
        String S = scan.nextLine();
        String T = scan.nextLine();
        System.out.println(S + "\n" + T);
        int length = T.length();
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for (int i = 0; i < S.length() - length; i++) {
            if (T.equals(S.substring(i, i + length))) {
                positions.add(i + 1);
            }
        }
        System.out.println(positions);
    }
}
